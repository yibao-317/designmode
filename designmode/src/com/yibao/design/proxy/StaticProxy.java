package com.yibao.design.proxy;

/**
 * @author liyi
 * @create 2021 -07 -12 -22:33
 */
public class StaticProxy implements Pursued{  // 代理模式：静态代理   --->> 这是代理类【怡宝】
    // 根据不同的对象，进行不同的代理，所以实现的顶层接口
    private Pursued pursued;

    // 构造器
    public StaticProxy(Pursued pursued) {
        this.pursued = pursued;
    }

    @Override
    public void flower() {
        pursued.flower();
    }

    @Override
    public void lipstick() {
        pursued.lipstick();
    }

}
