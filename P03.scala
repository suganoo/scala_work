object P03 {
  def nth[T](index: Int, list: List[T]): T = list match {
    case x::_ if index == 0 => x
    case _::xs if index > 0 => nth(index - 1,xs)
    case _ => sys.error("error")
  }
}

val a = List(2,3,4,2,6)
println(a)
println(P03.nth(2,a))
