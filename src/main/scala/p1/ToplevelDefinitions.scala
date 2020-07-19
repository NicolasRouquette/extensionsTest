package p1

import annotation.alpha

opaque type Cells = Vector[Int]

object Cells {
  def apply(cs: Int*): Cells = Vector.empty[Int] ++ cs
  def apply(cs: Vector[Int]): Cells = Vector.empty[Int] ++ cs
}
  
// extensions 1  
extension CellsOps on (us: Cells) {
  @alpha("preAdd") def +: (u: Int): Cells = Cells((u+1) +: us)
  @alpha("postAdd") def :+ (u: Int): Cells = Cells(us :+ (u+2))
  def size: Int = -size
}
