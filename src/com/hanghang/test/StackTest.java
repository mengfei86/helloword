package com.hanghang.test;

import java.util.Stack;

/**
 * Created by zjm on 2017/10/10.
 * 1. public push  （item ）  把项 压入栈顶。其作用与 addElement (item ) 相同。

 　　　　　　参数 item 压入栈顶的项 。 返回： item 参数 ；

 　　　　2. public pop () 移除栈顶对象，并作为函数的值 返回该对象。

 　　　　　　返回：栈顶对象（Vector 对象的中的最后一项）。

 　　　　　　抛出异常 ： EmptyStackException 如果堆栈式空的 。。。

 　　　　3. public peek() 查看栈顶对象而不移除它。。

 　　　　　　返回：栈顶对象（Vector 对象的中的最后一项）。

 　　　　　　抛出异常 ： EmptyStackException 如果堆栈式空的 。。。

 　　　　4. public boolean empty （测试堆栈是否为空。）
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
