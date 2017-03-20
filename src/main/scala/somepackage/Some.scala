package somepackage

import cookbook._

object SomethingWithMain {
  def main(args: Array[String]): Unit = {
    for (i: Int <- 1 to 30) print("_")
    for (i: Int <- 1 to 3) println(" ")

    println("Arguments: "+args.mkString(" "))
    println(Cookbook)

    Cookbook.pbj match {
      case Recipe(ingredients, directions) =>
        println(ingredients)
        println(directions)
    }

    for (i: Int <- 1 to 3) println(" ")
  }
}