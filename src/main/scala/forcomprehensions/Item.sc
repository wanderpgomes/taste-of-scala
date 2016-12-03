val numbers = 1 to 4
val letters = List('a', 'b', 'c')

val items : Seq[(Int, Char)] = for {
  i <- numbers
  j <- letters
} yield (i, j)

items.foreach(item => println(item._1 + "." + item._2))