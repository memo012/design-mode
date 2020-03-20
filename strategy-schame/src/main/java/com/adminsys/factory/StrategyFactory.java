package com.adminsys.factory;

import com.adminsys.enumeration.PayEnumStrategy;
import com.adminsys.strategy.PayStrategy;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 10-24
 **/
public class StrategyFactory {

    // 使用策略工厂获取具体策略实现
    public static PayStrategy getPayStrategy(String strategyType){
        // 获取 具体的策略class地址
        String className = PayEnumStrategy.valueOf(strategyType).getClassName();
        try {
            return (PayStrategy)Class.forName(className).newInstance();
        } catch (Exception e) {
           return null;
        }
    }

    // 工厂负责对象初始化
}
