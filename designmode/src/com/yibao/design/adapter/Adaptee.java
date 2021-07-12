package com.yibao.design.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author liyi
 * @create 2021 -07 -12 -22:36
 */
public class Adaptee {
    public void surf() {
        System.out.println("这是网线，提供上网的功能...");
    }
}

// 用户目的：实现上网
interface Target {
    void toSurf();
}

// 用户
class Client {
    public void wantSurf(Target target) {
        target.toSurf();
    }
}

// 使用适配器
//class Adapter extends Adaptee implements Target {
//    @Override
//    public void toSurf() { // 重写方法
//        System.out.println("执行上往前的适配工作...");
//        super.surf();
//    }
//}

// 对象适配器
class Adapter implements Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void toSurf() { // 重写方法
        System.out.println("执行上往前的适配工作【对象适配器】...");
        adaptee.surf();
    }
}

// 测试类
class Test {
    public static void main(String[] args) {
        new Client().wantSurf(new Adapter(new Adaptee()));
        // IO流 中的适配器体现
        new BufferedReader(new InputStreamReader(System.in));

    }
}
