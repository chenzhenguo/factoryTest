package com.czg.pattern.factory.FuncFactory;

import com.czg.pattern.factory.entity.IPhone;
import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 */
public class IPhonePhoneFactory implements AbstractPhoneFactory {

    public Phone makePhone() {
        return new IPhone();
    }
}
