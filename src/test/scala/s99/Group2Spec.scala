package s99;

import org.junit.runner.RunWith

import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack;
import s99.P10._
import s99.P11._

@RunWith(classOf[JUnitRunner])
class PSpec extends FlatSpec with ShouldMatchers {

}

class P10Spec extends PSpec {
  "encode()" should "encode a list using run-length format" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
  }
}

class P11Spec extends PSpec {
  "encodeModified" should "encode a list using run-length format but preserve single elements" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List((4, 'a), 'b, (2, 'c), (2, 'a), 'd, (4, 'e))
  }
}

class P12Spec extends PSpec {
  "decode" should "decode a run-length codified list" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) shouldBe List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }
}