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

object P03{
  def kth[T](k: Int, list: List[T]): T = (k, list) match {
    case (1, head :: tail) => head
    case (k, head :: tail) => kth(k-1, tail)
    case (0, _) => throw new NoSuchElementException
    case (_, Nil) => throw new IndexOutOfBoundsException
  }
}

object P04{
  def len[T] (list: List[T]) : Int  = {
    length(list, 0)
  }

  def length[T] (list: List[T], size: Int) : Int = list match {
    case Nil => size
    case _ :: tail => length(tail, size+1)
  }
}