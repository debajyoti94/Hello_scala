package lectures.part2OOP

object OOBasics extends App{

  val person = new Person // instantiating a class
  println(person)

  val person_v2 = new Person_v2("Deb", 26)
  println(person_v2.age)
  println(person_v2.x)
  person_v2.greet("John")
  person_v2.greet()

}

class Person

//constructor
class Person_v2(name: String, val age: Int){
  //class body
  val x = 2 // these are class fields, they can be accessed by  the objects

  println(1+3) // this expression/side effect will be evaluated when the class is instantiated

  def greet(name: String): Unit = {
    println(s"${this.name} says: Hello $name.") // this.name refers to class parameter name
  }

  // overloading
  def greet(): Unit = {
    println(s"Hi $name") //now name refers to class parameter
  }

  /* multiple constructors
  Scala provides us with the functionality to have multiple constructors.
  These constructors can be used for setting default values
   */
  // auxiliary constructor
  def this(name: String) = this(name, 0) //setting default value for age
  def this() = this("John Doe")
  // but we can set default values in the main constructor as well, which makes the auxiliary constructors redundant
}

// class parameters are NOT FIELDS
// to convert class parameter to class field, we add val before the parameter