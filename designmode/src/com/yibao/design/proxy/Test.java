package com.yibao.design.proxy;

/**
 * @author liyi
 * @create 2021 -07 -12 -23:11
 */
public class Test {  // 测试类：静态代理
    public static void main(String[] args) {
        // 创建代理对象，根据传入对象的不同，实现不同的代理
        StaticProxy staticProxy = new StaticProxy(new MoBei());  // 追求陌北
        staticProxy.flower();
        staticProxy.lipstick();
        System.out.println("--------------------------------------");
        StaticProxy staticProxy1 = new StaticProxy(new Anyone());  // 追求其他人
        staticProxy1.flower();
        staticProxy1.lipstick();

    }
}
