package com.ruoyi.sync.acount;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程同步：也就是按照预定的先后顺序运行，即“你先，我等，你做完，我再做”
 * 银行账户对象，封装存取、取钱方法
 * @Author:zxp
 * @Date:2019/2/18 9:58
 */
public class Acount {

    private int count=0;
    //创建私有的ReentrantLock对象，调用lock()方法，同步执行体执行完毕后，需要用unLock()释放锁。
    private ReentrantLock lock=new ReentrantLock();

    /**
     * 存钱
     */
    //同步方法
    public synchronized void  addAcount2(String name ,int money){
            count += money;
            System.out.println(name + "...存入" + money + "..." + Thread.currentThread().getName());
            selectAcount(name);

    }
    public void addAcount1(String name ,int money){
        //同步代码块
        synchronized (this) {
            count += money;
            System.out.println(name + "...存入" + money + "..." + Thread.currentThread().getName());
            selectAcount(name);
        }
    }
    //同步锁
    public void addAcount(String name ,int money){
        lock.lock();
        try {
            count += money;
            System.out.println(name + "...存入" + money + "..." + Thread.currentThread().getName());
            selectAcount(name);
        }finally {//执行体执行完毕，释放锁
            lock.unlock();
        }

    }


    /**
     * 取款
     */
    public synchronized void subAcount2(String name,int moeny) {
            if (count - moeny < 0) {
                System.out.println("账户余额不足");
                return;
            } else {
                count -= moeny;
                System.out.println(name + "取出" + moeny + "..." + Thread.currentThread().getName());
                selectAcount(name);
            }
    }
    public void subAcount1(String name,int moeny) {
        synchronized (this) {
            if (count - moeny < 0) {
                System.out.println("账户余额不足");
                return;
            } else {
                count -= moeny;
                System.out.println(name + "取出" + moeny + "..." + Thread.currentThread().getName());
                selectAcount(name);
            }
        }
    }

    public void subAcount(String name,int moeny) {
        lock.lock();
        try {

            if (count - moeny < 0) {
                System.out.println("账户余额不足");
                return;
            } else {
                count -= moeny;
                System.out.println(name + "取出" + moeny + "..." + Thread.currentThread().getName());
                selectAcount(name);
            }
        }finally {
            lock.unlock();
        }
    }
    /**
     * 查询余额
     */
    public void selectAcount(String name){
        System.out.println(name+"余额"+count);
    }
}
