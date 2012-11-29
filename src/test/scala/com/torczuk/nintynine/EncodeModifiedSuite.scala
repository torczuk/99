package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import com.torczuk.nintynine.Lists._
import collection.immutable.Nil

@RunWith(classOf[JUnitRunner])
class EncodeModifiedSuite extends FunSuite {

  test("should handle empty list") {
    assert(encodeModified(Nil) == Nil)
  }

  test("should play nice") {
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}
