case class Artist(name: String, genre: String)

val artists = List(Artist("Pink Floyd", "Rock"),
                   Artist("Led Zeppelin", "Rock"),
                   Artist("Michael Jackson", "Pop"),
                   Artist("Above & Beyond", "Trance"))

for ( Artist(name, genre) <- artists; if (genre == "Rock"))
  yield name
