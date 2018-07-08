object PrimeFactors {

  def of(i: Int): List[Int] = {

    def isDivisible(possibleFactor: Int, number: Int): Boolean = {
      number % possibleFactor == 0
    }

    def calculate(divisor: Int, number: Int, factors: List[Int]): List[Int] = {
      if (number < 2) factors
      else {
        if (isDivisible(divisor, number)) calculate(divisor, number / divisor, divisor :: factors)
        else calculate(divisor + 1, number, factors)
      }
    }
    calculate(2, i, Nil)
  }
}

