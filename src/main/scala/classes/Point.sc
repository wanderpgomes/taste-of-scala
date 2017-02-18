import scala.beans.BeanProperty


class Point(var x: Int, var y: Int) {
  override def toString: String = "(" + x + ", " + y + ")"
}



class Location (var xl: Int, var yl: Int) extends Point (xl, yl) {

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy

    println("new location after move: " + this);
  }
}

val loc = new Location(1, 2)
loc.move(2, 2)





class Person(@BeanProperty var firstName: String,
             @BeanProperty var lastName: String,
             @BeanProperty var age: Int) {
}


val p = new Person("Wander", "Gomes", 25)

p.getFirstName
p.getAge

p.setAge(26)

p.lastName
p.getLastName
p.getAge
