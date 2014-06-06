package com.example.kata.scala.s99

import scala.collection.mutable.LinkedList

object P01 {

  def last(list: LinkedList[Int]): Int = {
    val last = list.get(list.size - 1).get
    println(last)
    last
  }

}