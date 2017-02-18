// Specific for Strings
def findFirst(ss: Array[String], key: String): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)

  loop(0)
}

val names = Array("aa", "bb", "cc", "dd", "bb")

findFirst(names, "cc")
findFirst(names, "xx")



// Generic version. Pass a predicate function.
def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n + 1)

  loop(0)
}

val numbers = Array(1, 2, 4, 6, 4, 6, 4)

findFirst[Int](numbers, n => n > 2)
findFirst[String](names, _.equals("dd"))






