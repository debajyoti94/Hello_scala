package exercises

object OOBasics extends App {
  /*
    Novel and a Writer

    Writer: first name, surname, year
      -method fullname

     Novel: name, year of release, author
     - authorAge
     - isWrittenBy(author)
     - copy (new year of release) = new instance of Novel
   */
  val writer_obj = new Writer("Debajyoti", "Majumdar", 1994)
  writer_obj.fullName()

  val novel_obj = new Novel(name = "YOLO", yearOfRelease = 2021,author=writer_obj)
  novel_obj.authorAge()
  novel_obj.isWrittenBy(writer_obj)
  /*
    Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
   */
}

// Writer Class
class Writer(firstName: String="", surname: String="", val year: Int=0){

  def fullName(): String = {
    firstName + " " + surname
  }
}

// Novel Class
class Novel(name: String="", yearOfRelease: Int=0, author: Writer){

  def authorAge(): Unit = {
    var age = yearOfRelease - author.year
    println(s"Author's age is: ${age}")
  }

  def isWrittenBy(author: Writer): Unit = {
    println(s"$name novel is written by ${author.fullName()}")
  }

  def copy(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }
}

class Counter(val count: Int) {
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count-1)

  def inc(n: Int) = new Counter(count + n)
  def dec(n: Int) = new Counter(count-n)
}