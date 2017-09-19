package com.hanghang.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zjm on 2017/9/13.
 */
public class Test
{
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap<String,Integer>();
        map1.put("a",1);
        Thread a = new Thread(new WW(map1,"aaa"));
        Thread  b= new Thread(new WW(map1,"bbb"));
        Thread  c= new Thread(new WW(map1,"ccc"));
        Thread  d= new Thread(new WW(map1,"ddd"));
        a.start();
        b.start();
       c.start();
       d.start();
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (Object key : map.keySet()) {
//            System.out.println("Key = " + key);
//        }

    }
}
class WW implements Runnable{
    Map<String,Integer> map;
    String name="";
    WW( Map<String,Integer> map,String name){
        this.map = map;
        this.name =name;
    }
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            map.put("a",map.get("a")+1);
            System.out.println("name="+name+"--"+map.get("a"));
            //map.put("do"+i,i);
        }

    }
}
