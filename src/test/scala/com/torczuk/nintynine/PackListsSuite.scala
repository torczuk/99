package com.torczuk.nintynine

import org.scalatest.FunSuite

import com.torczuk.nintynine.Lists.pack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PackListsSuite extends FunSuite {

  test("should single list") {
    assert(pack(List(1)) == List(List(1)))
  }

  test("should double list") {
    assert(pack(List(1, 1)) == List(List(1, 1)))
  }
  test("should treeple list") {
    assert(pack(List(1, 1, 1)) == List(List(1, 1, 1)))
  }

  test("should double different list") {
    assert(pack(List(1, 2)) == List(List(1), List(2)))
  }

  test("should threeple different list") {
    assert(pack(List(1, 2, 3)) == List(List(1), List(2), List(3)))
  }

  test("should handle list with the same elements") {
    assert(pack(List(1, 1, 1, 1)) == List(List(1, 1, 1, 1)))
  }

  test("should handle list with all different elements") {
    assert(pack(List(1, 2, 3, 4)) == List(List(1), List(2), List(3), List(4)))
  }

  test("should handle list with multiple elements") {
    assert(pack(List(1, 1, 2, 2)) == List(List(1, 1), List(2, 2)))
  }

  test("should handle empty list") {
    assert(pack(List(1, 1, 1, 1, 2, 3, 3, 3)) == List(List(1, 1, 1, 1), List(2), List(3, 3, 3)))
  }

}
