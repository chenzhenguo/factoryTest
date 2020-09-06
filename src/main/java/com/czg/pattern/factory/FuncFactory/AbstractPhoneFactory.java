package com.czg.pattern.factory.FuncFactory;

import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 *  定义抽象工厂，定义生产接口
 */
public interface AbstractPhoneFactory {
    Phone makePhone();
}
