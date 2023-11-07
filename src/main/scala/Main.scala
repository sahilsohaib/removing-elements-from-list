object ListRemoval {
  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 3, 4, 5)

    println(s"Initial List: $list")

    while (true) {
      println("Enter an element to remove (or 'q' to quit):")
      val input = scala.io.StdIn.readLine()

      if (input == "q") {
        println("Exiting program.")
        System.exit(0)
      }

      val elementToRemove = input.toInt
      val updatedList = removeElement(list, elementToRemove)

      if (updatedList != list) {
        list = updatedList
        println(s"Updated List: $list")
      } else {
        println(s"Element $elementToRemove not found in the list.")
      }
    }
  }

  def removeElement(list: List[Int], elementToRemove: Int): List[Int] = {
    list.filterNot(_ == elementToRemove)
  }
}
