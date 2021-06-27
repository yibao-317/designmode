package com.yibao.design.decorator.dec;

import com.yibao.design.decorator.MakeCake;

/**
 * @author liyi
 * @create 2021 -06 -27 -21:18
 */
public class DecCookie extends Decorate { // 蛋糕修饰：加饼干
    // 继承父类，使用父类的构造器
    public DecCookie(MakeCake mc) {
        super(mc);
    }

    // 重写做蛋糕的方法【增加做饼干的操作】
    @Override
    public void make() {
        super.make();
        add();
    }

    // 添加饼干
    public void add(){
        System.out.println("...在蛋糕中加入饼干...");
    }
}
