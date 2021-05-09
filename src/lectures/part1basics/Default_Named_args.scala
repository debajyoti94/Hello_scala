package lectures.part1basics

object Default_Named_args extends App{

  // Here we will learn about default and named arguments
  def factorial(n: Int, accumulator: BigInt = 1): BigInt = {
    if (n<=1) accumulator
    else  factorial(n-1, n * accumulator)
  }
  println(factorial(10, 1))
  println(factorial(100))

 /*
 But the user is not interested in accumulator, it cares only for n while giving an input.
 We can use default arguments in this case to deal with this issue.
  */

  /*
  We can also pass named arguments here
   */
  println(factorial(n=100, accumulator=1))
}
