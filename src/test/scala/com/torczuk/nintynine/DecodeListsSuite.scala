package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import com.torczuk.nintynine.Lists._

@RunWith(classOf[JUnitRunner])
class DecodeListsSuite extends FunSuite {
  test("should reverse empty list") {
    assert(decode(List()) === Nil)
  }

  test("should play nice") {
    assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ===
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
}
