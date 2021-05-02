package lectures.part1basics

object Functions extends App{

  // defining functions
  def aFunction(a: String, b: Int): String =
    a + " " + b

  // body of a function consists of an expression
  // hence, a code block could also be used here

  def anotherFunction(a: String, b: Int): String = {
    a + " " + b
  }

  // the above two functions are identical
  println(aFunction("hello", 4))
  println(anotherFunction("hello", 4))

  // you can also have a parameter-less function
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  // more ambitious functions

  def aRepeatedFunction(aString: String, n: Int): String = {
  if (n==1) aString
  else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 4))

  // WHEN YOU NEED LOOPS, USE RECURSION---- MAIN IDEA BEHIND FUNCTIONAL PROGRAMMING

  // Unit can be a
  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  } // side effects are situations where you do not return any value

  // In scala you define function within a function
  // since each function evaluates an expression
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = {
      a + b
    }
    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(5))
}
