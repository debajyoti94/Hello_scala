package exercises

object Functions extends App {

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and i am $age years old
    2. Factorial function 1*2*3*...*n
    3. Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Test if a number is prime
   */

  // 1. greeting function
  def aGreetingFunction(name: String, age: Int): String = {
    "Hi my name is " + name + " and my age is " + age
  }

  // 2. Factorial function
  def factorial(n: Int): Int = {
    if (n==1) 1
    else n * factorial(n-1)
  }

  // 3. Fibonacci function
  def fibonacci(n: Int): Int = {
    if (n==1 || n==2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  //4. Test if a number is prime
  def prime(n: Int): Boolean = {
    def checkDivisibility(x: Int): Boolean= {
      if (x <= 1) true
      else n % x != 0 && checkDivisibility(x-1)
    }
    checkDivisibility(n/2)
  }

  println(aGreetingFunction("Deb", 26))
  println(factorial(5))
  println(fibonacci(8))
  println(prime(11))
  println(prime(4))

}
