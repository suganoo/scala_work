object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case (x:List[_])::xs => println("case1" + x);flatten(x):::flatten(xs)
    case x::xs => println("case2" + x);x::flatten(xs)
    case Nil => Nil
  }
}

val a = List(List(1,2,3),3,List(4,5,6))
println(a)
println(P07.flatten(a))
