package com.czg.pattern.factory.FuncFactory;

import com.czg.pattern.factory.entity.MiPhone;
import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 */
public class XiaoMiPhoneFactory implements AbstractPhoneFactory {

    public Phone makePhone() {
        return new MiPhone();
    }
}
