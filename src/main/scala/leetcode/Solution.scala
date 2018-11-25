package leetcode

object Solution {

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var diffs = Map.empty[Int, Int]

    for {
      (x, i) <- nums.zipWithIndex
    } {
      diffs.get(x) match {
        case None =>
          diffs = diffs + ((target - x) -> i)
        case Some(j) =>
          return Array(j, i)
      }
    }

    Array.emptyIntArray
  }
}
