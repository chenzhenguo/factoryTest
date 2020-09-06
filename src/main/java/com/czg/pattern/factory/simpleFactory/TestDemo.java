package com.czg.pattern.factory.simpleFactory;

import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 */
public class TestDemo {
    //简单工厂模式
    // 小作坊生产， 没有一个标准
    // 如果有新的产品就需要修改工厂make方法
    public static void main(String[] args) {
        PhoneFactory pf =new PhoneFactory();
        Phone phone = pf.makePhone("apple");
        phone.make();
        Phone xiaomi = pf.makePhone("xiaomi");
        xiaomi.make();
    }
}
