
object P01 {
  def last[T](list: List[T]): T = list match {
    case x::Nil => x
    //case x::xs => println(x);last(xs)
    case _::xs => last(xs)
    case _ => sys.error("error")
  }
}

val a = List(2,3,4,2,6)
println(a)
println(P01.last(a))
