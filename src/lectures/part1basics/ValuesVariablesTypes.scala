package lectures.part1basics
/*
Learning how to deal with Values, Variables and Types
 */
object ValuesVariablesTypes extends App{
  // declaring a value
  val x: Int = 42
  val y = 20
  println(x)
  println(y)

  // VALS are immutable, their values cannot be changed
  // Types of VAL is optional: compile can infer types

  val aString: String = "yolo"
  val anotherString = "helloooo"

  val aBoolean: Boolean = false
  val achar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 123
  val aLong: Long = 1234L //need to add L at the end
  val aFloat: Float = 2.0f //need to add f at the end
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5     // variables are mutable (their values can be changed)
}