import p1.{Cells,CellsOps}

object Main {

  val v: Cells = Cells(0)

  def variant1a(): Unit = {
    val w = v :+ 50
    val z = 40 +: w
    println(s"1a) w=$w; z=$z w.length=${w.size}")
  }

  def variant1b(): Unit = {
    val w: Cells = v :+ 50
    val z = 40 +: w
    println(s"1b) w=$w; z=$z w.length=${w.size}\n")
  }

  def variant2a(): Unit = {
    val w = 40 +: v
    val z = w :+ 50
    println(s"2a) w=$w; z=$z w.length=${w.size}")
  }

  def variant2b(): Unit = {
    val w: Cells = 40 +: v
    val z = w :+ 50
    println(s"2b) w=$w; z=$z w.length=${w.size}\n")
  }

  def main(args: Array[String]): Unit = {
    variant1a()
    variant1b()
    variant2a()
    variant2b()
  }

}
