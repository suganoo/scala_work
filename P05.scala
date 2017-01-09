import scala.annotation.tailrec

object P05 {
  def reverse[T](list: List[T]): List[T] = {
    @tailrec
    def go(lst: List[T], revlst: List[T]): List[T] = lst match {
      case Nil => revlst
      case x::xs => go(xs, x::revlst)
    }
    go(list,Nil)
  }
}
val a = List(4,5,3,7)
println(a)
println(P05.reverse(a))
