package lectures.part1basics

object StringOps extends App{

  val str: String = "Hello i am learning scala"

  println(str.charAt(2)) // print char at a specific index
  println(str.substring(6, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  // appending and prepending
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(2))

  // Scala-specific: string interpolators

  // S-interpolators
  val name = "Deb"
  val age = "26"
  val greeting = s"Hello, my name is $name and i am $age years old"
  println(greeting)
  val anotherGreeting = s"Hello my name is $name and i will be turning ${age + 1} years old"
  println(anotherGreeting)

  // F-interpolators: for formatted strings, similar to printf
  val speed = 1.2f
  val myth = f"David can eat $speed%2.2f burgers per minute" // formatting the floating point value
  println(myth)

  // raw-interpolators: can ignore escape sequences
  println(raw"this is \n a new line")
  println("this is \n a new line")


}
