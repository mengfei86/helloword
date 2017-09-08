package com.hanghang.thread;

/**
 * *
 * yield
 * 休眠当前线程, 是线程编程可执行状态,以便其他相同优先级的线程有机会执行,
 *  注意: 再次执行调度程序决定的， 可以立刻会再次执行。。。
 *
 *  yield会释放资源锁吗？
 *     yield不会释放资源所,当暂停后,等待调度程序再次调用,走完同步区域代码后才释放锁
 */
public class YieldExample {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
        consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Producer : Produced Item " + i);
            Thread.yield();
        }
    }
}

class Consumer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Consumer : Consumed Item " + i);
            Thread.yield();
        }
    }
}