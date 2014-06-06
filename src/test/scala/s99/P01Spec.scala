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
}