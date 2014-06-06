package com.example.kata.scala.s99

import scala.collection.mutable.LinkedList

object P01 {

  def last[T](list: List[T]): T = list match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

}