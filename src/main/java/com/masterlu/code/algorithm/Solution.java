package com.masterlu.code.algorithm;

import static com.masterlu.code.utils.PrintUtils.print;

import java.util.HashMap;
import java.util.Map;


/**
 * @author lujiliang[lujiliang@aibank.com]
 * @Description: TODO
 * @date 2019/12/21
 */
public class Solution {

    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        print(ints);

    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @param nums   nums = [2, 7, 11, 15]
     * @param target target = 9
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] array = new int[2];

        //时间复杂度：(n-1)n/2 空间复杂度：未开辟额外空间

/*        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    array[0] = i;
                    array[1] = j;

                    return array;
                }
            }
        }*/

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                array[1] = i;
                array[0] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }

        return array;


    }
}
