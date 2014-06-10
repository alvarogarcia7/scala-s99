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