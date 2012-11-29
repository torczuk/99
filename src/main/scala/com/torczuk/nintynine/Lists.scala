package com.torczuk.nintynine

import scala.collection.immutable.Nil

//import com.torczuk.nintynine.???

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

  def nth[A](i: Int, list: List[A]): A = {
    if (i > list.size) throw new IllegalArgumentException("List is to small")
    last(list take i)
  }

  def reverse[A](list: List[A]): List[A] = list.foldLeft(List[A]())((reversed, element) => element :: reversed)

  def isPalindrome[A](list: List[A]): Boolean = reverse(list) == list

  def flatten(listOfLists: List[Any]): List[Any] = Nil

  def compress[A](list: List[A]): List[A] = {
    list.flatMap(e => (e, 1) :: List()
    ).toMap.keys.toList
  }

  /**
   * List(List(1,1,1), List(2,2,2)) will be decomposed
   * to List(1,1,1) :: List(List(2,2,2))
   * @param list
   * @return
   */
  def pack[A](list: List[A]): List[List[A]] = {
    def packer[A](packed: List[List[A]], next: A): List[List[A]] = packed match {
      case Nil => Nil
      case List(List()) => List(List(next))
      case h :: Nil => {
        if (h.head == next) List(next :: h)
        else List(List(next), h)
      }
      case h :: t => {
        if (h.head == next) List(next :: h) ::: t
        else List(List(next)) ::: packed
      }
    }
    reverse(list.foldLeft(List(List[A]()))(packer))
  }

  def encodeModified[A](list: List[A]): List[(Int, A)] = {
    if (list isEmpty) Nil
    else pack(list).flatMap {
      e => List((e.size, e.head))
    }
  }

  def decode[A](list: List[(Int, A)]): List[A] = {
    def addElements(count: Int, element: A, result: List[A]): List[A] = {
      if (count > 0) addElements(count - 1, element, element :: result)
      else result
    }

    reverse(
      list.foldLeft(List[A]()) {
        case (acc, (size, symbol)) => addElements(size, symbol, acc)
      }
    )
  }
}
