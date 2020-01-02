package ch1

import org.scalatest._

class PowModSpec extends FunSuite with DiagrammedAssertions {
  test("list 1-1 too slow algorithm") {
    val actual = PowMod.list11(2, 2, 3)
    val expect = 1
    assert(actual == expect)
  }
  test("list 1-2 faster") {
    val actual = PowMod.list12(Int.MaxValue, Int.MaxValue, 3)
    val expect = 1
    assert(actual == expect)

    val actual2 = PowMod.list12(2, 2, 3)
    val expect2 = 1
    assert(actual2 == expect2)
  }
}
