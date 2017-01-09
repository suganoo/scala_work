import scala.actors.Actor
import Actor._

class SoleState extends Actor {
  private var cnt = 0

  def act = loop {
    react {
      case _ => cnt += 1
        println("Receive" + cnt + " messages")
    }
  }
}

val actor = new SomeState
actor.start
actor ! "Hello"
