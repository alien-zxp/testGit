package com.ruoyi.sync.threadLocad;

/**
 * @Author:zxp
 * @Date:2019/2/16 10:15
 */
public class TestClient extends Thread{

    private SequenceNumber sn;

    public TestClient(SequenceNumber sn) {
        this.sn = sn;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("thread["+Thread.currentThread().getName()+"]sn["+sn.getNextNum()+"]");
        }
    }
}
