package com.ruoyi.sync.threadLocad;

/**当使用ThreadLocal维护变量时，ThreadLocal为每个使用该变量的线程提供独立的变量副本，所以每一个线程都可以独立地改变自己的副本，

 而不会影响其它线程所对应的副本。ThreadLocal类中有一个map，用于存储每一个线程的变量的副本，Map中元素的键为线程对象，

 而值对应线程的变量副本，由于Key值不可重复，每一个“线程对象”对应线程的“变量副本”，而到达了线程安全。

 同步与ThreadLocal是两种思路，前者是数据共享的思路，后者是数据隔离的思路。同步是以时间换空间，ThreadLocal是以空间换时间。

 synchronized利用锁的机制，让变量或者代码块在同一时间内只能被某一个线程访问，ThreadLocal为每一个线程保存自己独立的副本，

 使得每个线程在同一时刻访问的并不是同一个对象。
 *
 * @Author:zxp
 * @Date:2019/2/16 10:05
 */
public class SequenceNumber {

    //定义匿名子类创建threadLocal的变量
    private static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
        //覆盖初始化方法
        protected Integer initialValue() {
            return 0;
        }
    };

    //下一个序列号
    public int getNextNum(){
        //set()将此线程局部变量的当前线程副本中的值设置为指定值
        //get()返回此线程局部变量的当前线程副本中的值。如果变量没有用于当前线程的值，则将其初始化为调用initialValue()方法返回的值。
        seqNum.set(seqNum.get()+1);
        //线程第一次使用 get()  方法访问变量时将调用此方法，
        //但如果线程之前调用了 set(T)  方法，则不会对该线程再调用 initialValue  方法
        return seqNum.get();
    }
}
