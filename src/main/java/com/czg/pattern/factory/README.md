# 工厂模式 demo

## 简单工厂模式
    例子:  在simpleFactory 中
    PhoneFactory 工厂负责创建所有的对象，创建小米手机/苹果手机/华为手机
    优点：屏蔽具体实现/秩序关心产品接口
    缺点： 耦合度高，违反开闭原则，如果需要添加手机，则需要修改代码
    
    
    
## 方法工厂模式
    例子在 FuncFactory
    创建AbstractPhoneFactory 不负责生产，负责定义生产规范
    由HuaweiphoneFactory/ IphonePhoneFactory 负责实现创建AbstractPhoneFactory的接口。
    优点： 如果有新的手机类型需要生产则只需要实现factory的接口定义
        无需修改源码，符合开闭原则/继承了简单工厂优点
    缺点： 增加产品/需要增加新的工厂类/导致系统类的个数成对增加/提升复杂性
    https://www.cnblogs.com/yssjun/p/11102162.html
    
## 抽象工厂模式
    例子在AbstractFatory
    如所有的产品线如pc/phone 等类型都由AbstractFactory  工厂定义和方法
    
    XiaoMiFactory 和 AppleFactory 生产多个相同的品牌不同的产品类型的产品
    
    相当于按照品牌建立工厂，不同品牌的工厂生产多个类型的产品
    
    这些品牌的工厂共同实现工厂类， makePhone 和makePC 的方法
    
    优点/ 隔离具体类的生成/不需要知道什么被创建
          可以通过具体的工厂类创建多个产品对象/符合开闭原则
          
    缺点： 不是和增加产品的等级结构，如果修改产品结构，需要修改抽象工厂/和工厂的方法




