package com.torczuk.nintynine

import org.scalatest.FunSuite
import com.torczuk.nintynine.Lists._
import collection.immutable.Nil
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PenultimateListsSuite extends FunSuite {

  test("should throw exception when list is empty") {
    intercept[IllegalArgumentException] {
      penultimate(Nil)
    }
  }

  test("should throw exception when list has one element") {
    intercept[IllegalArgumentException] {
      penultimate(List(2))
    }
  }

  test("should play nice") {
    assert(penultimate(List(1, 2, 3, 4, 5)) === 4)
  }
}
