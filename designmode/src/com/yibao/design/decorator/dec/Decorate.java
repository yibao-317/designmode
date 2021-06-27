package com.yibao.design.decorator.dec;

import com.yibao.design.decorator.MakeCake;

/**
 * @author liyi
 * @create 2021 -06 -27 -21:08
 */
public class Decorate implements MakeCake { // 二级父类：修饰蛋糕
    // 用顶层接口对象，表示修饰谁
    private MakeCake mc;

    // 使用构造器为属性赋值
    public Decorate(MakeCake mc) {
        this.mc = mc;
    }

    // 实现重写方法，使用上面的对象
    @Override
    public void make() {
        mc.make();
    }
}
