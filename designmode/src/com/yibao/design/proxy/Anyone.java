package com.yibao.design.proxy;

/**
 * @author liyi
 * @create 2021 -07 -12 -23:07
 */
public class Anyone implements Pursued {  // 其余被追求的任何人
    @Override
    public void flower() {
        System.out.println("追求其他人，买其他人喜欢的花");
    }

    @Override
    public void lipstick() {
        System.out.println("追求其他人，买其他人喜欢的口红");
    }
}
