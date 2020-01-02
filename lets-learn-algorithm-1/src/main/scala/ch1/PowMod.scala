package ch1

/*
 * aのk乗をmで割った余りを求める関数
 * a, k, mは1以上の整数で、すべてのJavaのintの範囲に入る(最大およそ21億)
 */
object PowMod {
  def list11(a: Int, k: Int, m: Int): Int = {
    var t: Long = 1;
    for (_ <- 1 to k) {
      t = (t * a) % m
    }
    t.toInt
  }

  def list12(a: Int, k: Int, m: Int): Int = {
    if (k == 0) 1
    else {
      val t = list12(a, k / 2, m)
      val t2 = t * t
      val axk = if (a % 2 == 1) {
        t2 * a
      } else {
        t2
      }
      axk % m
    }
  }
}
