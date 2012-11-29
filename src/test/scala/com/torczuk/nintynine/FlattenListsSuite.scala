package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import com.torczuk.nintynine.Lists._

@RunWith(classOf[JUnitRunner])
class FlattenListsSuite extends FunSuite {

  test("should handle empty list") {
    assert(flatten(Nil) == Nil)
  }

  test("should play nice") {
    assert(flatten(List(1, 2, 3, List(4, 5, 6, List(7, 8, 9, List(10, 11))))) == (1 to 10).toList)
  }
}