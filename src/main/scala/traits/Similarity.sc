trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}

class Point(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc

  def isSimilar(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x

  override def toString: String = "(" + x + ", " + y + ")"
}


val p1 = new Point(2, 3)
val p2 = new Point(2, 4)
val p3 = new Point(3, 3)
val p4 = new Point(2, 3)

p1.isSimilar(p2)
p1.isSimilar(p3)

// Point's isNotSimilar is defined in Similarity
p1.isNotSimilar(2)
p1.isNotSimilar(p4)
