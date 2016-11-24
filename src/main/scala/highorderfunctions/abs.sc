// simple function
def abs(n: Int): Int =
  if (n < 0) -n
  else n

// call abs
abs(-3)
abs(2)

// assign abs to a variable fn
val fn: (Int => Int) = abs

// pass fn as parameter
List(-1, 0, 1, -2, 3, -4).map(fn)


// pass lambda as parameter
List(-2, -1, 0, 1, 3).map(n => fn(n) + 10)







