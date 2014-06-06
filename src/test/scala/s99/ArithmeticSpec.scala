

package s99

import org.specs2.mutable._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ArithmeticSpec extends Specification {
  "Arithmetic2" should {
    "add" in {
      "two numbers" in {
        1 + 2 mustEqual 4
      }
      "three numbers" in {
        1 + 1 + 1 mustEqual 3 
      }
    }
  }
}