// map
// Evaluates a function over each element in the list,
// returning a list with the same number of elements.
val numbers = List(1, 2, 3, 4)
numbers.map((i: Int) => i * 2)



// or pass in a function
def timesTwo(i: Int): Int = i * 2
numbers.map(timesTwo)



// foreach is like map but returns nothing.
numbers.foreach((i: Int) => i * 2)  //returns nothing

// foreach is intended for side-effects only.
var sum = 0
numbers.foreach(sum += _)
sum


// filter
// Removes any elements where the function you pass in evaluates to false.
// Functions that return a Boolean are often called predicate functions.
numbers.filter((i: Int) => i % 2 == 0)
def isEven(i: Int): Boolean = i % 2 == 0

numbers.filter(isEven)

// zip
// Aggregates the contents of two lists into a single list of pairs.
List(1, 2, 3).zip(List("a", "b", "c"))

(0 to 100 by 10).zip(0 to 100 by 10 tail)


// Partition splits a list based on where it falls with respect to a predicate function.
val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
num.partition(_ % 2 == 0)

// find
// Returns the first element of a collection that matches a predicate function.
num.find((i: Int) => i > 5)

// drop & dropWhile
// drop drops the first i elements
num.drop(5)

// dropWhile removes the first elements that match a predicate function.
// For example, if we dropWhile odd numbers from our list of numbers,
// 1 gets dropped (but not 3 which is “shielded” by 2).
num.dropWhile(_ % 2 != 0)


// foldLeft
// acts as an accumulator.
num.foldLeft(0)((m: Int, n: Int) => m + n)
num.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

// foldRight
// Is the same as foldLeft except it runs in the opposite direction.
num.foldRight(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

num.reduceRight(_ + _)

// flatten
// flatten collapses one level of nested structure.
List(List(1, 2), List(3, 4)).flatten


// flatMap
// flatMap is a frequently used combinator that combines mapping and flattening.
// flatMap takes a function that works on the nested lists and then
// concatenates the results back together.
val nestedNumbers = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 2))