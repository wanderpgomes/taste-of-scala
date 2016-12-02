import scala.io.Source


val fileStream = getClass.getResourceAsStream("/authors.txt")

val lines = Source.fromInputStream(fileStream).getLines()

val authors = for {
  author <- lines
  j <- 1 until 4
  if (!author.startsWith("Martin"))
} yield (j, author)

authors.foreach(a => println(a._2))







