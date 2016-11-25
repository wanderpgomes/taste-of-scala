def product(ds: List[Double]): Double = ds match {
  case Nil => 1.0
  case 0.0 :: _ => 0.0
  case x :: xs => x * product(xs)
}

product(List())
product(List(1, 2, 3, 0, 9))
product(List(1.0, 2.0, 4.0, 2.0))

