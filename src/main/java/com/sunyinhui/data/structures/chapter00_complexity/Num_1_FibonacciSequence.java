package com.sunyinhui.data.structures.chapter00_complexity;

import com.sunyinhui.data.structures.utils.Times;

/**
 * @description: 算法复杂度
 * <p>
 * 斐波那契数列
 * @author: yinhui.sun
 * @date: 2019-10-17 13:47
 */
public class Num_1_FibonacciSequence {


    /**
     *  0 1 2 3 4 5 6 7
     *  0 1 1 2 3 5 8 13
     *
     *  递归的算法不能用啊
     *  算法复杂度:
     * @param n
     * @return
     */
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }


    public static int fib2(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < n -1 ; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }

    /**
     * 精简代码
     * public static int fib2(int n) {
     *         int first = 0;
     *         int second = 1;
     *         for (int i = 1; i < n ; i++) {
     *             second = first + second;
     *             first = second - first;
     *         }
     *
     *         return second;
     *
     *     }
     */


    /**
     * 直接递归很慢
     * @param args
     */
    public static void main(String[] args) {

        Times.test("fib1", new Times.Task() {
            public void execute() {
                // 4s
                System.out.println(fib1(45));
            }
        });


        Times.test("fib2", new Times.Task() {
            public void execute() {
                System.out.println(fib2(45));
            }
        });


    }


}
