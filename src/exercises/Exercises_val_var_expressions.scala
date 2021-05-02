package object exercises  extends App{

  // 1. difference between "hello world" vs println("hello world")
  /*
    "hello world" is a value of type string
    println("hello world") returns Unit == void, it is a side effect
   */

  //2. What does the code below return?
  val someValue = {
    2 < 3
  }
  // true

  val someOtherValue = {
    if (someValue) 239 else 986
  }
  // 239

  // Exercises for Functions
}
