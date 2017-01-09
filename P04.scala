import scala.annotation.tailrec

object P04 {
  def length[T](list: List[T]): Int = {
    @tailrec
    def go(lst: List[T], n: Int): Int = lst match {
      case x::xs => go(xs, n + 1)
      case Nil => n
    }
    go(list,0)
  }
}
//val a = List(4,5,3,7)
val a = List.range(0,100000,1)
//println(a.tail)
println(P04.length(a))
