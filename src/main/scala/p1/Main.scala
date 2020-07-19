package p1

object Main {

  val v: Cells = Cells(0)

  def variant1(): Unit = {
    val w = 40 +: v
    val z = w :+ 50
    println(s"a) w=$w; z=$z")
  }

  def variant2(): Unit = {
    val w: Cells = 40 +: v
    val z = w :+ 50
    println(s"b) w=$w; z1=$z")
  }
  
  def main(args: Array[String]): Unit = {
    variant1()
    variant2()
  }
  
}
