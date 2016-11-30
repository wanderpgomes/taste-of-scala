val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
                     "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

for (breed <- dogBreeds)
  println(breed)


for (breed <- dogBreeds
  if breed.contains("Terrier")
) println(breed)


for (breed <- dogBreeds
     if breed.contains("Terrier")
     if !breed.startsWith("Yorkshire")
) println(breed)


val filteredBreeds = for {
  breed <- dogBreeds
  if breed.contains("Terrier")
  if !breed.startsWith("Yorkshire")
} yield breed


for {
  breed <- dogBreeds
  upcasedBreed = breed.toUpperCase()
} println(upcasedBreed)

