package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import com.torczuk.nintynine.Lists.reverse

@RunWith(classOf[JUnitRunner])
class ReverseListsSuite extends FunSuite {

  test("should reverse empty list") {
    assert(reverse(List()) === Nil)
  }

  test("should play nice") {
    assert(reverse(List(1, 2, 3, 4, 5)) === List(5, 4, 3, 2, 1))
  }
}
