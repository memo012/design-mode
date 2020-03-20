package com.adminsys.strategy.impl;

import com.adminsys.strategy.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 10-09
 **/
@Service
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "调用微信支付接口";
    }
}
