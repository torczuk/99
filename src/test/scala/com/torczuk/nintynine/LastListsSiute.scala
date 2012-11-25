package com.torczuk.nintynine

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.collection.immutable.Nil
import com.torczuk.nintynine.Lists._

@RunWith(classOf[JUnitRunner])
class LastListsSiute extends FunSuite {

  test("last of Nil list") {
    intercept[IllegalArgumentException] {
      last(Nil)
    }
  }

  test("last of List(1, 2, 3, 4, 5)") {
    assert(last(List(1, 2, 3, 4, 5)) === 5)
  }
}