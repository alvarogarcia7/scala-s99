package com.example.kata.scala.s99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack
import scala.collection.mutable.LinkedList
import org.scalatest.BeforeAndAfter
import com.example.kata.scala.s99.P01.last

@RunWith(classOf[JUnitRunner])
class P01Spec extends FlatSpec with ShouldMatchers with BeforeAndAfter{

  var list : LinkedList[Int] = null
  
  before {
	  list = new LinkedList[Int]
  }
  
  "Last()" should "retrieve the last element in a list" in {
    list = list :+ (1)
    list = list :+ (8)
    last(list) shouldBe 8
  }
  
  it should "fail if the list is empty" in {
    intercept[NoSuchElementException]{
    	last(list)
    }
  }
  
}