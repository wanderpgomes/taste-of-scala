package concurrent

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

/**
  * A Scala 'Future' example from the Scala Cookbook.
  * @see http://shop.oreilly.com/product/0636920026914.do
  */
object FuturesExample extends App {

  // not too exciting, the result will always be 42. but more importantly, when?
  println("1 - starting calculation ...")
  val future = Future {
    sleep(Random.nextInt(500))
    42
  }

  println("2- before onComplete")
  future.onComplete {
    case Success(value) => println(s"Got the callback, meaning = $value")
    case Failure(e) => e.printStackTrace
  }

  // do the rest of your work
  println("A ..."); sleep(100)
  println("B ..."); sleep(100)
  println("C ..."); sleep(100)
  println("D ..."); sleep(100)
  println("E ..."); sleep(100)
  println("F ..."); sleep(100)

  // keep the jvm alive (may be needed depending on how you run the example)
  //sleep(2000)

  def sleep(duration: Long) { Thread.sleep(duration) }

}