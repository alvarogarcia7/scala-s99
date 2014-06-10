package s99;

object P09 {
  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
}

object P10 {

  def encode(list: List[Symbol]): List[Any] = {
    P09.pack(list) map { any => (any.length, any.head) }
  }
}

object P11 {
  def encodeModified(list: List[Symbol]): List[Any] = {
    P09.pack(list) map { any => if (any.length > 1) (any.length, any.head) else (any.head) }
  }
}

object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    //http://stackoverflow.com/questions/12300165/how-to-create-a-list-with-the-same-element-n-times
    list flatMap { any => List.fill(any._1)(any._2) }
  }
}