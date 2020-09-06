package com.czg.pattern.factory.AbstractFactory;

import com.czg.pattern.factory.entity.PC;
import com.czg.pattern.factory.entity.Phone;

/**
 * Created by Administrator on 2020/9/6.
 *  定义抽象工厂，定义生产接口
 */
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
