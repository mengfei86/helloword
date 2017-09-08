package com.hanghang.thread.join;

/**在join()方法内设定超时，使得join()方法的影响在特定超时后无效。当超时时，主方法和任务线程申请运行的时候是平等的。
 * 然而，当涉及sleep时，join()方法依靠操作系统计时，所以你不应该假定join()方法将会等待你指定的时间。
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
