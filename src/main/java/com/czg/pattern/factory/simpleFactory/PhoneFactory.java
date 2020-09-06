package com.czg.pattern.factory.simpleFactory;

import com.czg.pattern.factory.entity.IPhone;
import com.czg.pattern.factory.entity.MiPhone;
import com.czg.pattern.factory.entity.Phone;

/**
 * 简单工厂 模式
 * Created by Administrator on 2020/9/6.
 */
public class PhoneFactory  {
    public Phone makePhone(String phoneType){
        if(phoneType.equals("xiaomi")){
            return new MiPhone();
        }
        else if(phoneType.equals("apple")){
            return  new IPhone();
        }
        return  null;
    }
}
