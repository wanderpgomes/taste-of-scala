
val names = Map(1 -> "Bob", 2 -> "Martin", 3 -> "David", 4 -> "Donald", 5 -> "")

val name: Option[String] = names.get(5)

val upper = name map { _.trim } filter { _.length != 0 } map { _.toUpperCase }

println(upper getOrElse "Not found!")