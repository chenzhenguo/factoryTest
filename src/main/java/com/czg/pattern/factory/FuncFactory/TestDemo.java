package com.czg.pattern.factory.FuncFactory;

import com.czg.pattern.factory.entity.Phone;

/**
 * 工厂方法模式
 * Created by Administrator on 2020/9/6.
 */
public class TestDemo {
    public static void main(String[] args) {
        Phone phone = new XiaoMiPhoneFactory().makePhone();
        Phone iphone = new IPhonePhoneFactory().makePhone();
        Phone huaweiphone = new HuaWeiPhonePhoneFactory().makePhone();
        phone.make();
        iphone.make();
        huaweiphone.make();

    }
}
