//import P05.reverse
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
object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    P05.reverse(list) == list
  }
}

val a = List(1,2,3,2,1)
println(P06.isPalindrome(a))
