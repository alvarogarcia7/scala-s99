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

object P13 {
  import P14.duplicateN
  def duplicate[T](list: List[T]): List[T] = duplicateN(2, list)
}

object P14 {
  def duplicateN[T](times: Int, list: List[T]): List[T] = list flatMap {
    e => List.fill(times)(e)
  }
}
object P15 {
  def drop[T](kth: Int, list: List[T]): List[T] =
    {
      var i: Int = 0
      list.foldRight(List[T]()) { (left, cumulative) => { i = i + 1; if (i == kth) { i = 0; cumulative } else left :: cumulative; } }
    }
}