object Hamming {
  def distance(strand1: String, strand2: String): Option[Int] =
    if (strand1.length == strand2.length)
      Some((0 until strand1.length).map((i: Int) => if (strand1(i) != strand2(i)) 1 else 0).sum)
    else None
}