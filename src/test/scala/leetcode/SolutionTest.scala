package leetcode

import yspec.YSpecSuite

class SolutionTest extends YSpecSuite {

  type Input = TwoSumInput
  type Output = List[Int]

  YSpec
    .fromResource[Input, Output]("two-sum-spec.yaml")
    .run(
      { case TwoSumInput(nums, target) => new Solution().twoSum(nums.toArray, target) },
      _.toArray
    )
}

case class TwoSumInput(nums: List[Int], target: Int)
