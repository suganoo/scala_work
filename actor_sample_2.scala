import scala.actors._
import scala.actors.Actor._

case class End()
object HelloActor {
  def main(args: Array[String]): Unit = {
    val helloActor = actor {
      loop {
        react {
          case m: String => println("Got a message: " + m)
          case End => println("End."); System.exit(0)
        }
      }
    }
    helloActor.start

    for (i <- 1 to 3) {
      helloActor ! "Hello Actor World" + i
      Thread.sleep(1000L)
    }
    helloActor ! End
  }
}
