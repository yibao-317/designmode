package com.yibao.design.decorator.dec;

import com.yibao.design.decorator.MakeCake;

/**
 * @author liyi
 * @create 2021 -06 -27 -21:36
 */
public class DecSweets extends Decorate {
    // 继承父类，使用父类构造器
    public DecSweets(MakeCake mc) {
        super(mc);
    }

    // 重写方法
    @Override
    public void make() {
        super.make();
        add();
    }

    // 在蛋糕中添加糖果
    public void add(){
        System.out.println("...在制作蛋糕中添加糖果...");
    }
}
