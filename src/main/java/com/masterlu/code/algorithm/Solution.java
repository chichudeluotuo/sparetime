package com.masterlu.code.algorithm;

import static com.masterlu.code.utils.PrintUtils.print;

import java.util.HashMap;
import java.util.Map;


/**
 * @author masterlu
 * @Description: TODO
 * @date 2019/12/21
 */
public class Solution {

    public static void main(String[] args) {

        //问题1
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        print(ints);

        //问题2

    }

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * 示例：
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num = 123;

        return createListNode(num);
    }

    private static ListNode createListNode(int num) {
        String numStr = String.valueOf(num);
        char[] chars = numStr.toCharArray();

        ListNode listNode = new ListNode(Integer.parseInt(String.valueOf(chars[chars.length - 1])));
        for (int i = chars.length - 2; i > 0; i--) {
            listNode.next = new ListNode(Integer.parseInt(String.valueOf(chars[i])));
        }

        return listNode;
    }


    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
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
                array[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }

        return array;


    }


}
