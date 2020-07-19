package p1

opaque type Cells = Vector[Int]
object Cells {
  def apply(cs: Int*): Cells = Vector.empty[Int] ++ cs
}
  
// extensions 1  
extension on (us: Cells) {
  def +: (u: Int): Cells = (u+1) +: us
  def :+ (u: Int): Cells = us :+ (u+2)
}
  
// extensions 2  
def (update: Int) +: (updates: Cells): Cells = (update-1) +: updates
def (updates: Cells) :+ (update: Int): Cells = updates :+ (update-2)
  