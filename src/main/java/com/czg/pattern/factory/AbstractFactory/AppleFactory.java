package com.czg.pattern.factory.AbstractFactory;

import com.czg.pattern.factory.entity.IPhone;
import com.czg.pattern.factory.entity.MAC;
import com.czg.pattern.factory.entity.PC;
import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 */
public class AppleFactory implements AbstractFactory {

    public Phone makePhone() {
        return new IPhone();
    }

    public PC makePC() {
        return new MAC();
    }
}
