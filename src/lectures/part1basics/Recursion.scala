package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

    def factorial(n: Int): Int = {
      if (n<=1) 1
          //will print the stack call frame now
      else {
          println("Computing factorial of " + n + " - I first need factorial of "+ (n-1))
          val result = n * factorial(n-1)
          println("Computed factorial of "+n)

          result
      }
    }
    println(factorial(10))
    //println(factorial(10000)) // lead to StackOverflowError

    // now we will implement a more efficient factorial function
    def efficientFactorial(n: Int): BigInt = {
      @tailrec // this annotation helps in maintaining the function tail recursive
      def factHelper(x: Int, accumulator: BigInt): BigInt = {
        if (x<=1) accumulator
        else factHelper(x-1, x * accumulator) // TAIL RECURSION = is recursive call as the LAST expression
        // Here scala does not need additional stack frame
       // Refer this link for more information: https://stackoverflow.com/questions/33923/what-is-tail-recursion
      }
      factHelper(n,1)
    }

    println(efficientFactorial(10000))

    // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION
}
