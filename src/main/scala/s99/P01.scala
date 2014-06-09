package com.example.kata.scala.s99

import scala.collection.mutable.LinkedList
import java.util.NoSuchElementException

object P01 {

  def last[T](list: List[T]): T = list match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

}
object P02 {

  def penultimate[T](list: List[T]): T = list match {
    case penultimate :: last :: Nil => penultimate
    case head :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

}

object P03 {
  def kth[T](k: Int, list: List[T]): T = (k, list) match {
    case (1, head :: tail) => head
    case (k, head :: tail) => kth(k - 1, tail)
    case (0, _) => throw new NoSuchElementException
    case (_, Nil) => throw new IndexOutOfBoundsException
  }
}

object P04 {
  def len[T](list: List[T]): Int = {
    length(list, 0)
  }

  def length[T](list: List[T], size: Int): Int = list match {
    case Nil => size
    case _ :: tail => length(tail, size + 1)
  }
}

object P05 {
  def reverse[T](list: List[T]): List[T] = {
    reverse(list, List())
  }

  def reverse[T](input: List[T], output: List[T]): List[T] = input match {
    case Nil => output
    case head :: tail => reverse(tail, output.+:(head))
  }
}

object P06 {
  def palindrome[T](list: List[T]): Boolean = {
    list == P05.reverse(list)
  }
}

object P07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ls: List[_] => flatten(ls)
    case else_ => List(else_)
  }
}

object P08 {
  def compress[T](list: List[T]): List[T] = {
    compress(list, list.head, List(list.head))
  }

  def compress[T](list: List[T], head: T, output: List[T]): List[T] = (list, head) match {
    case (Nil, _) => output
    case (h :: tail, head) if (h == head) => compress(tail, head, output)
    case (h :: tail, head) if (h != head) => compress(tail, h, output.+:(head))
  }
}