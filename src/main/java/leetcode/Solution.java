package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffIdxMap = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer j = diffIdxMap.get(nums[i]);

            if (j != null) {
                return new int[]{j, i};
            }

            diffIdxMap.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
