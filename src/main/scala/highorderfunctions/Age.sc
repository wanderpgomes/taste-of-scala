val team = List("Alice", "Bob", "Carol", "Dave", "Eve", "Frank")

val (ss1, ss2) = team partition (_.contains("a"))

ss1.length




