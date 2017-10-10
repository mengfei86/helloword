package com.hanghang.test;

import java.util.Stack;

/**
 * Created by zjm on 2017/10/10.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> sc=new Stack<String>();
        sc.push("aa");
        sc.push("bb");
        sc.push("cc");
        for (int i = 0; i < sc.size(); i++) {
            System.out.println( sc.peek());
            sc.pop();
            System.out.println( sc.peek());
        }
    }
}
