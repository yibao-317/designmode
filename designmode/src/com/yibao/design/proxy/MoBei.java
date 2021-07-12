package com.yibao.design.proxy;

/**
 * @author liyi
 * @create 2021 -07 -12 -23:05
 */
public class MoBei implements Pursued{ // 陌北：被追求的人
    @Override
    public void flower() {
        System.out.println("追求陌北，买陌北喜欢的花");
    }

    @Override
    public void lipstick() {
        System.out.println("追求陌北，买陌北喜欢的口红");
    }
}
