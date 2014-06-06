package com.example.kata.scala.s99

import org.junit.runner.RunWith

import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack
import scala.collection.immutable.List
import scala.collection.mutable.LinkedList
import org.scalatest.BeforeAndAfter
import com.example.kata.scala.s99.P01.last
import com.example.kata.scala.s99.P02.penultimate
import com.example.kata.scala.s99.P03.kth

@RunWith(classOf[JUnitRunner])
class P01Spec extends FlatSpec with ShouldMatchers {

  var list: List[Int] = null

  "Last()" should "retrieve the last element in a list" in {
    list = List(1, 8)
    last(list) shouldBe 8
  }

  it should "fail if the list is empty" in {
    intercept[NoSuchElementException] {
      last(List())
    }
  }

}

@RunWith(classOf[JUnitRunner])
class P02Spec extends FlatSpec with ShouldMatchers {
  "Penultimate()" should "retrieve the penultimate element in a list" in {
    penultimate(List(1, -1, 5)) shouldBe -1
  }
  it should "do the same in a two element list" in {
	  penultimate(List(-1, 5)) shouldBe -1
  }
  it should "fail in an empty list" in {
    intercept[NoSuchElementException]{
	  penultimate(List())
    }
  }
  it should "fail in a one element list" in {
	  intercept[NoSuchElementException]{
		  penultimate(List(1))
	  }
  }
}


@RunWith(classOf[JUnitRunner])
class P03Spec extends FlatSpec with ShouldMatchers{
  "Kth element" should "return the correct element from a list" in {
    kth(2, List(1,1,2,5,8,13)) shouldBe 2
  }
}