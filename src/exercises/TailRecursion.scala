package exercises

import scala.annotation.tailrec

object TailRecursion extends App{
  /*
  Write Tail Recursive functions to do the following
  1. Concatenate a string n times
  2. IsPrime function, tail recursion
  3. Fibonacci function, tail recursion
   */

  // 1. Concatenate a string n times
  def nConcat(str: String, n: Int): String = {
    @tailrec
    def concatHelper(accumulator: String, x: Int): String = {
      if (x <= 1) accumulator
      else concatHelper(str + accumulator, x-1 )
    }
    concatHelper(str, n)
  }

  println(nConcat("hello", 10))

  // 2. IsPrime function, tail recursion
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(x: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if  (x <= 1) true
      else  isPrimeHelper(x-1, n % x != 0 && isStillPrime)
    }
    isPrimeHelper(n/2, true)
  }

  println(isPrime(100000000))

  // Fibonacci function, tail recursive
  def fibonacci(n: Int): Int = {
    @tailrec
    // the number of accumulators depend on the number of recursive calls
    // in case of fibonacci we call fibo(n-1) + fibo(n-2) = 2
    def helper(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else helper(x+1, last+nextToLast, last)
    }
    if (n <= 2) 1
    else helper(2,1,1)
  }
  println(fibonacci(8))
}


