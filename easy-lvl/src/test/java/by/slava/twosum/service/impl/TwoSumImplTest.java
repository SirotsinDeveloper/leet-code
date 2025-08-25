package by.slava.twosum.service.impl;

import by.slava.twosum.service.TwoSumService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumImplTest {

    private final TwoSumService service = new TwoSumImpl();

    @Test
    void testTwoSumBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSumWithNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void testTwoSumWithDuplicates() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSumNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[0], result);
    }

    @Test
    void testTwoSumEmptyArray() {
        int[] nums = {};
        int target = 5;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[0], result);
    }

    @Test
    void testTwoSumNullArray() {
        int[] result = service.twoSum(null, 5);
        assertArrayEquals(new int[0], result);
    }

    @Test
    void testTwoSumSingleElement() {
        int[] nums = {5};
        int target = 10;
        int[] result = service.twoSum(nums, target);
        assertArrayEquals(new int[0], result);
    }
}
