class Fibonacci1 {

  def fibonacci(number: Int): Int = {
    if (number == 0) {
      0
    }
    else if (number == 1) {
      1
    }
    else {
      fibonacci(number - 1) + fibonacci(number - 2)
    }
  }
}

object Fibonacci extends App {
  val fibonacciobj = new Fibonacci1
  val number = 12

  println(fibonacciobj.fibonacci(number))
}
