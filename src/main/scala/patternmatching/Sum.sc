def sum(ints: List[Int]): Int = ints match {
  case Nil => 0
  case x :: xs => x + sum(xs)
}

sum(1 to 10 toList)
