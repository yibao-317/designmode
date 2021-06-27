package com.yibao.design.decorator.cake;

import com.yibao.design.decorator.MakeCake;

/**
 * @author liyi
 * @create 2021 -06 -27 -20:44
 */
public abstract class Cake implements MakeCake { // 二级父类：蛋糕 (继承顶级父类--->>做蛋糕)
    // 由于子类形态各异，所以此重写为 "抽象方法/抽象类"
    @Override
    public abstract void make();   //【草莓蛋糕、抹茶蛋糕、可可蛋糕...】

}
