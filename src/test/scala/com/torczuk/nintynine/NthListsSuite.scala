package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import org.scalatest.FunSuite

import com.torczuk.nintynine.Lists.nth


@RunWith(classOf[JUnitRunner])
class NthListsSuite extends FunSuite {

  test("should play nice") {
    assert(nth(1, List(1, 2, 3)) === 1)
  }

  test("should throw exception when list is to small") {
    intercept[IllegalArgumentException] {
      nth(4, List(1, 2, 3))
    }
  }
}
