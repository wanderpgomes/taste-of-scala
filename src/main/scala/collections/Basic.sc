import scala.collection.mutable

// Arrays preserve order, can contain duplicates, and are mutable.
val numbersA= Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

numbersA(3) = 10

numbersA foreach println



// Lists preserve order, can contain duplicates, and are immutable.
val numbersL = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//numbersL(3) = 10

val numbersIL = mutable.MutableList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
numbersIL(3) = 10



// Sets do not preserve order and have no duplicates
val numbersS = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

numbersS foreach println


// A Tuple groups together simple logical collections of items without using a class.

val hostPort = ("localhost", 80)

hostPort._1
hostPort._2


// Ranges

1 to 12 foreach println
1 to 12 by 2 foreach println

1 until 12 toList

val someNumbers = Range(0, 10)
val moreNumbers = Range(0, 10).inclusive

// Maps

Map(1 -> 2)
Map("foo" -> "bar", 1 -> "one")
var myMap = Map(1 -> "one", 2 -> "two")
myMap(1)
myMap(2)
myMap.get(2)
myMap.getOrElse(3, "missing data")

myMap = Map(4 -> "four", 5 -> "five") withDefaultValue("key not found")
myMap(1)




val fruitList = List("apples", "oranges", "pears")
// Alternative syntax for lists
val fruit = "apples" :: ("oranges" :: ("pears" :: Nil)) // parens optional, :: is right-associative
fruit.head   // "apples"
fruit.tail   // List("oranges", "pears")
val emptyL = List()
val emptyN = Nil