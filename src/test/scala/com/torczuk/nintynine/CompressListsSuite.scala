package com.torczuk.nintynine

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import com.torczuk.nintynine.Lists.compress

@RunWith(classOf[JUnitRunner])
class CompressListsSuite extends FunSuite {
  test("should handle empty list") {
    assert(compress(Nil) == Nil)
  }

  test("should play nice") {
    assert(compress(List('a', 'b', 'a')) == List('a', 'b'))
  }
}
