package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (r == c || c == 0)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(count: Int, chars: List[Char]): Boolean = {
      if (count < 0)
        return false
      if (chars.isEmpty) {
        if (count > 0)
          return false
        return true
      }
      if (chars.head.equals('('))
        loop(count + 1, chars.tail)
      else if (chars.head.equals(')'))
        loop(count - 1, chars.tail)
      else loop(count, chars.tail)
    }

    loop(0, chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def CountOfWays(money: Int, index: Int): Int = {
      if(money < 0 || index < 0) return 0
      if(money == 0) return 1
      CountOfWays(money, index - 1) + CountOfWays(money - coins(index), index)
    }
    CountOfWays(money, coins.sorted.length - 1)
  }
}
