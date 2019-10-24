package com.ruoyi.sync.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:zxp
 * @Date:2019/2/18 9:50
 */
public class TestFixedThreadPool {
    public static void main(String[] args) {

        ExecutorService pool=Executors.newFixedThreadPool(5);
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        Thread t3=new MyThread();
        Thread t4=new MyThread();
        Thread t5=new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();


    }
}
