package com.ruoyi.sync.acount;

/**
 * 存折对象，负责取钱
 * @Author:zxp
 * @Date:2019/2/18 10:10
 */
public class Paper implements Runnable {

    private String name;
    private Acount acount=new Acount();

    public Paper(String name, Acount acount) {
        this.name = name;
        this.acount = acount;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            acount.subAcount(name, 50);
        }
    }
}
