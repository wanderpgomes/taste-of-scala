case class Person(salutation: String = "Unknown", firstName: String = "Unknown",
                  middleName: String = "Unknown", lastName: String = "Unknown",
                  suffix: String = "Unknown")


Person("Mr", "John", "M", "Doe", "Sr")
Person(salutation = "Mr", firstName = "John", lastName = "Doe")
Person(firstName = "John", middleName = "M", lastName = "Doe")
Person(firstName = "John")
Person(lastName = "Doe")
Person(firstName = "John", lastName = "Doe")