package by.slava.twosum.service.impl;

import by.slava.twosum.service.TwoSumService;

import java.util.HashMap;
import java.util.Map;

public class TwoSumImpl implements TwoSumService {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];

        Map<Integer, Integer> map = twoSumMap(nums);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        return new int[0];
    }

    private Map<Integer, Integer> twoSumMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        return map;
    }
}