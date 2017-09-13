package com.hanghang.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zjm on 2017/9/13.
 */
public class Test
{
    public static void main(String[] args) {
        Map map = new HashMap();
        Thread a = new Thread(new WW(map));
        a.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Object key : map.keySet()) {
            System.out.println("Key = " + key);
        }

    }
}
class WW implements Runnable{
    Map map;
    WW( Map map){
        this.map = map;
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            map.put("do"+i,i);
        }

    }
}
