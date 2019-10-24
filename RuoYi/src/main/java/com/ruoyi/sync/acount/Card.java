package com.ruoyi.sync.acount;

/**
 * 银行卡负责存钱
 * @Author:zxp
 * @Date:2019/2/18 10:06
 */
public class Card implements Runnable{

    private String name;
    private Acount acount=new Acount();

    public Card(String name, Acount acount) {
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
            acount.addAcount(name, 100);
        }
    }
}
