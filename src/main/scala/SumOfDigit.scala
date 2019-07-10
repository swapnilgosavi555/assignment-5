class SumOfDigit {

  def productOfNum(num: Int): Int = {
    if (num == 0) {
      1
    }
    else {

      num * productOfNum(num - 1)
    }
  }

  def sumOfNum(num: Int): Int = {
    if (num < 10) {
      num
    }
    else {
      val remainder: Int = num % 10
      val division: Int = num / 10
      remainder + sumOfNum(division)
    }
  }

}

object Hello extends App {
  val sumofdigit = new SumOfDigit()
  println("Enter the number")
  val number = 4
  val resultofproduct = sumofdigit.productOfNum(number)
  val sum = sumofdigit.sumOfNum(resultofproduct)
  println(resultofproduct)
  println(sum)
}