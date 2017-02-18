def add(x:Int, y:Int) = x + y

add(1, 2)
add(7, 3)

def addC(x:Int)(y:Int) = x + y

addC(1)(2)
addC(7)(3)

val addOne = addC(1)(_)
val addSeven = addC(7)(_)

addOne(2)
addSeven(3)


