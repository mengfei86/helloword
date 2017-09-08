package com.hanghang.thread.join;


/**
 *  join是当前程序等线程的时间，如果参数是0就是等线程执行完成后继续执行当前线程
 * Created by zjm on 2017/9/7.
 */
public class ThreadTest {

    public static void main(String[] args) {

        ThreadJoin mTh2=new ThreadJoin();
        try {
            mTh2.start();
            Thread.sleep(1000);
            System.out.println("main join start");
            mTh2.join(1000);
            System.out.println("main join end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
