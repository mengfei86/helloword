package com.hanghang.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                //休眠后 就会使用同一个线程了。
                Thread.sleep(index * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.submit(new Runnable() {
                public void run() {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(index+"-1111-"+Thread.currentThread().getName());
                }
            });
            cachedThreadPool.execute(new Runnable() {
                public void run() {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(index+"--"+Thread.currentThread().getName());
                }
            });
        }
    }
} 