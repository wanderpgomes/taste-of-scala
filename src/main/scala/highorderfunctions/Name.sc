val team = List("Wander", "John", "Alex", "Anton", "Jean", "Kabir")

val (ss1, ss2) = team partition (_.startsWith("A"))

ss1.length




