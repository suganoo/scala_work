object P08 {
  def compress[T](list: List[T]):List[T] = list match {
    case x::y::xs if (x==y) => compress(x::xs)
    case x::y::xs if (x!=y) => x::y::compress(xs)
    case x::Nil => x::compress(Nil)
    case Nil => Nil
  }
}
val a = List('a','a','a','a','a','b','b','b','c','b','b','b','d','d','d','d','d','d','d')
println(a)
println(P08.compress(a))
