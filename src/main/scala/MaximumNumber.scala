object Maximum extends App {
  val list: List[Int] = List(1, 100, 101, 40, 95, 3, 6, 67, 200, 35, 24, 56)
  println(Maximum.findMax(list))

  def maxOf2(num1: Int, num2: Int): Int = {
    if (num1 >= num2) {
      num1
    }
    else {
      num2
    }

  }

  def findMax(list: List[Int]): Int = {
    if (list.tail.isEmpty) {
      list.head
    }
    else {
      maxOf2(list.head, findMax(list.tail))
    }
  }
}