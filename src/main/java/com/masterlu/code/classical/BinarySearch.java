package com.masterlu.code.classical;


/**
 * @author masterlu163@163.com
 * @Description: 二分查找实现
 * @date 2020/4/27 0027
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] intArr = new int[]{2, 4, 6, 8, 10};

/*        int index = search(intArr, 10);
        System.out.println(index);*/

        int i = doSearch(intArr, 0, intArr.length, 10);
        System.out.println(i);
    }

    /**
     * 利用二分查找，查找给点数坐标，如果不存在返回-1
     *
     * @param intArr 排序数据
     * @param number 目标数据
     * @return 目标数据坐标
     */
    public static int search(int[] intArr, int number) {

        if (null == intArr || intArr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = intArr.length;
        int middle = intArr.length / 2;

        if (number == intArr[middle]) {
            return middle;
        } else if (number > intArr[middle]) {
            return doSearch(intArr, middle + 1, high, number);
        } else {
            return doSearch(intArr, low, middle, number);
        }

    }

    /**
     * 利用二分查找，查找给点数坐标，如果不存在返回-1
     *
     * @param intArr 排序数据
     * @param start  起始索引
     * @param end    终止索引
     * @param number 目标数据
     * @return 目标数据坐标
     */
    private static int doSearch(int[] intArr, int start, int end, int number) {

        if (start == end && intArr[start] != number) {
            return -1;
        }

        int middle = (start + end) / 2;
        int low = start;
        int high = end;

        if (number == intArr[(start + end) / 2]) {
            return middle;
        } else if (number > intArr[middle]) {
            return doSearch(intArr, middle + 1, high, number);
        } else {
            return doSearch(intArr, low, middle, number);
        }

    }
}
