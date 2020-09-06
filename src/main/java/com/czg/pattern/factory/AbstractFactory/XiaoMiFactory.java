package com.czg.pattern.factory.AbstractFactory;

import com.czg.pattern.factory.entity.MiPC;
import com.czg.pattern.factory.entity.MiPhone;
import com.czg.pattern.factory.entity.PC;
import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 */
public class XiaoMiFactory implements AbstractFactory{


    public Phone makePhone() {
        return new MiPhone();
    }

    public PC makePC() {
        return new MiPC();
    }
}
