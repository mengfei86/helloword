package com.hanghang.thread.join;

/**
 * Created by zjm on 2017/9/7.
 */
public class ThreadJoin extends Thread{
    public void run() {
        System.out.println("join start");
        try {
            Thread.sleep(9000);
            for (int i = 0; i < 5; i++) {
                System.out.println("sub thread:" + i);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("join end");
    }
}
