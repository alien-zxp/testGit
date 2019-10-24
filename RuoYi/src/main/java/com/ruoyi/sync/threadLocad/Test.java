package com.ruoyi.sync.threadLocad;

/**
 * @Author:zxp
 * @Date:2019/2/16 10:21
 */
public class Test {
    public static void main(String[] args) {
        SequenceNumber sn=new SequenceNumber();
        TestClient t1=new TestClient(sn);
        TestClient t2=new TestClient(sn);
        TestClient t3=new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();


    }
}
