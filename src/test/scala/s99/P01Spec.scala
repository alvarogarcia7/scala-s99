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
import com.example.kata.scala.s99.P04.len


@RunWith(classOf[JUnitRunner])
class PSpec extends FlatSpec with ShouldMatchers {

}

class P01Spec extends PSpec {
  "Last()" should "retrieve the last element in a list" in {
    last(List(1, 8)) shouldBe 8
  }

  it should "fail if the list is empty" in {
    intercept[NoSuchElementException] {
      last(List())
    }
  }

}

class P02Spec extends PSpec {
  "Penultimate()" should "retrieve the penultimate element in a list" in {
    penultimate(List(1, -1, 5)) shouldBe -1
  }

  it should "do the same in a two element list" in {
    penultimate(List(-1, 5)) shouldBe -1
  }
  
  it should "fail in an empty list" in {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }
  
  it should "fail in a one element list" in {
    intercept[NoSuchElementException] {
      penultimate(List(1))
    }
  }
}

class P03Spec extends PSpec {
  "Kth element" should "return the first element from a list" in {
    kth(1, List(1, 1, 2, 5, 8, 13)) shouldBe 1
  }

  it should "do the same with an intermediate element" in {
    kth(5, List(1, 1, 2, 5, 8, 13)) shouldBe 8
  }

  it should "do the same with the last element" in {
    kth(6, List(1, 1, 2, 5, 8, 13)) shouldBe 13
  }

  it should "fail with an index over the list size " in {
    intercept[IndexOutOfBoundsException] {
      kth(1, List())
    }
  }
  it should "fail with the index 0" in {
    intercept[NoSuchElementException] {
      kth(0, List())
    }
  }
}

class P04Spec extends PSpec {
  "length()" should "Find the number of elements of a one element list" in {
    len(List(7)) shouldBe 1
  }
  "length()" should "Find the number of elements of in any size list" in {
    len(List(1,2,3,4,5,6)) shouldBe 6
  }
}