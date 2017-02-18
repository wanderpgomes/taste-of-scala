// simple function
def abs(n: Int): Int =
  if (n < 0) -n
  else n

// call abs
abs(-3)
abs(2)

// assign abs to a variable fn
val f: (Int => Int) = abs

// pass fn as parameter
List(-1, 0, 1, -2, 3, -4).map(f)


// pass lambda as parameter
List(-2, -1, 0, 1, 3).map(n => f(n) + 10)

List(-2, -1, 0, 1, 3).map(f(_) + 10)







