package com.ruoyi.sync.acount;

/**
 * 主测试方法，演示银行卡疯狂存钱，存折疯狂取钱
 * @Author:zxp
 * @Date:2019/2/18 10:24
 */
public class ThreadDemo {

    public static void main(String[] args) {
        //开个银行账号
        Acount acount=new Acount();
        //开银行账号后给张银行卡
        Card card=new Card("card", acount);
        //开银行账号后给张存折
        Paper paper=new Paper("存折", acount);

        Thread t1=new Thread(card);
        Thread t2=new Thread(paper);
        t1.start();//开始存钱
        t2.start();//开始取钱


    }
}
