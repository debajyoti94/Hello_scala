package lectures.part1basics

object CallByValue_CallByName extends App{

  def calledByValue(x: Long): Unit = {
    println("by value: "+x)
    println("by value: "+x)
  }

  def calledByName(x: => Long): Unit = {
    println("by value: "+x)
    println("by value: "+x)
  }
  calledByValue(System.nanoTime())
  /*
  In called by value the System.nanotime() is calculated before being passed to
  calledByValue() function, this is why both the values printed are the same
   */
  calledByName(System.nanoTime())
  /*
  In called by name, the System.nanotime() function is passed as it is and
  it is calculated when the System.nanotime() function is actually called,
  that is why these two value printed are different in calledByName

  -- Called by name does lazy computation, done by using => operator
   */

}
