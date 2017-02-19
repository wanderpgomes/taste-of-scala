abstract class Animal {
  def speak
}

trait FourLeggedAnimal {
  def walk
  def run
}

trait WaggingTail {
  val tailLength: Int = 5

  def startTail { println("tail started") }
  def stopTail { println("tail stopped") }
}

class Dog extends Animal with WaggingTail with FourLeggedAnimal {
  def speak { println("Dog says 'woof'") }
  def walk { println("Dog is walking") }
  def run { println("Dog is running") }
}
