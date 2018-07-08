import org.scalatest.FunSpec

class PrimeFactorsTest extends FunSpec {
  val testCases = List(
    (1, Nil),
    (2, List(2)),
    (3, List(3)),
    (4, List(2, 2)),
    (6, List(3, 2)),
    (9, List(3, 3)),
    (27, List(3, 3, 3)),
    (625, List(5, 5, 5, 5))
  )

  describe("of") {
    testCases.foreach { testCase => {
      it(s"${testCase._1} is ${testCase._2}") {
        assert(PrimeFactors.of(testCase._1) === testCase._2)
      }
    }
    }
  }
}
