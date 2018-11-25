package leetcode

import yspec.YSpecSuite

class SolutionTest extends YSpecSuite {

  "two-sum-spec.yaml".run { input: TwoSumInput =>
    input match {
      case TwoSumInput(nums, target) =>
        Solution.twoSum(nums, target)
    }
  }
}

case class TwoSumInput(nums: Array[Int], target: Int)
