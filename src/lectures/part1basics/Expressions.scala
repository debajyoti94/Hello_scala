package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // expression: math expression
  println(x)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions DO things
  // Expression return a VALUE

  // IF expression: an IF condition which will return a value
  val aCondition = true
  val aConditionedValue = if(aCondition) 6 else -9  // IF expression
  println(aConditionedValue)
  println(if(aCondition) 6 else -9)


  // there are loops in scala, however they are discouraged
  // the loops are specific to java,python , etc..

  // EVERYTHING in scala is an expression

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects in scala are expressions that return Unit/void
  // these are: println(), while loops, reassigning

  // Code blocks

  val aCodeBlockValue = {
    val x = 1
    var y = x+2

    if (y > 3) "hello" else "goodbye"
  } // end of code block: these are also expressions

  // instructions do something
  // expressions evaluate something

  print(aCodeBlockValue)
}
