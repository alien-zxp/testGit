package com.ruoyi.sync.executors;

/**
 * @Author:zxp
 * @Date:2019/2/18 9:48
 */
public class MyThread  extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行中");;
    }
}
