package com.czg.pattern.factory.AbstractFactory;

/**
 * 抽象工厂模式
 * Created by Administrator on 2020/9/6.
 */
public class TestDemo {
    public static void main(String[] args) {
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        xiaoMiFactory.makePhone().make();
        xiaoMiFactory.makePC().make();
        appleFactory.makePC().make();
        appleFactory.makePhone().make();
    }
}
