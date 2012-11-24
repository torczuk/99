package com.torczuk.nintynine

import scala.collection._
import scala.collection.immutable.Nil


object Lists {
  
  def last[A](list: List[A]): A = list match { 
    case Nil => throw new IllegalArgumentException("List is empty")
    case List(x) => x
    case head :: tail => last(tail)
  }

  def penultimate[A](list: List[A]): A = list match {
    case Nil => throw new IllegalArgumentException("List is empty")
    case List(x) => throw new IllegalArgumentException("List has only one element")
    case x :: List(last) => x
    case x :: tail => penultimate(tail)
  }

  def nth[A](i: Int, list: List[A]): A = last(list take i)

  def reverse[A](list: List[A]): List[A] = list.foldLeft(List[A]())((reversed, element) => element :: reversed)
}
