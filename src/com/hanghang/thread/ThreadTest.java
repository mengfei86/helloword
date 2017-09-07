package com.hanghang.thread;

/**
 * Created by zjm on 2017/9/7.
 */
public class ThreadTest {
    /**
     * 注意：start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
     从程序运行的结果可以发现，多线程程序是乱序执行。因此，只有乱序执行的代码才有必要设计为多线程。
     Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
     实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。

     但是start方法重复调用的话，会出现java.lang.IllegalThreadStateException异常。
     * @param args
     */
    public static void main(String[] args) {
        Thread1 mTh1=new Thread1("A");
        Thread1 mTh2=new Thread1("B");
        mTh1.start();
        mTh2.start();

    }
}
