package com.torczuk.nintynine

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import com.torczuk.nintynine.Lists.isPalindrome

@RunWith(classOf[JUnitRunner])
class PalindromeListsSuite extends FunSuite {

  test("should work for empty list as palindrom") {
    assert(isPalindrome(List()) === true)
  }	

  test("should play nice for single element list") {
    assert(isPalindrome(List(1)))
  }

  test("should play nice odd palindorms") {
    assert(isPalindrome(List(1, 2, 1)))
  }

  test("should play nice even palindorms") {
    assert(isPalindrome(List(1, 2, 2, 1)))
  }

  test("should detect not palindrom") {
    assert(!isPalindrome(List(1, 2, 3, 1)))
  }
}
