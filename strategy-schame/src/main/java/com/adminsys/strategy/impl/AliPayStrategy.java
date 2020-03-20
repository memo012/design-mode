package com.adminsys.strategy.impl;

import com.adminsys.strategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 10-08
 **/
@Service
public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用支付宝接口";
    }
}
