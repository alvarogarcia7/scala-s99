package com.example.kata.scala.s99

import scala.collection.mutable.LinkedList

object P01 {

  def last(list: List[Int]): Int = list match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

}