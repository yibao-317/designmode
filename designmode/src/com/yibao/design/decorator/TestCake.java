package com.yibao.design.decorator;

import com.yibao.design.decorator.cake.CocoaCake;
import com.yibao.design.decorator.dec.DecCookie;
import com.yibao.design.decorator.dec.DecSweets;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author liyi
 * @create 2021 -06 -27 -21:27
 */
public class TestCake {
    public static void main(String[] args) throws Exception{
        // 购买一个可可蛋糕 + 饼干 + 糖果
        new DecSweets(new DecCookie(new CocoaCake())).make();
        // IO流
        new BufferedInputStream(new FileInputStream(new File("C:/a.txt")));


    }
}
