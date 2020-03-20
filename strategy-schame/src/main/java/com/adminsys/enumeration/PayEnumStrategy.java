package com.adminsys.enumeration;

/**
 *  策略枚举类  能够实现的所有枚举类
 */
public enum PayEnumStrategy {

    /**
     *  支付宝支付
     */
    ALI_PAY("com.adminsys.strategy.impl.AliPayStrategy"),

    /**
     *  微信支付
     */
    WECHAT_PAY("com.adminsys.strategy.impl.WeChatPayStrategy");

    /**
     * class 完整地址
     */
    private String className;

    PayEnumStrategy(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
