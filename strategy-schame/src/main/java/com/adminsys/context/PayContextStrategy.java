package com.adminsys.context;

import com.adminsys.dao.PaymentChannelDao;
import com.adminsys.entity.PaymentChannelEntity;
import com.adminsys.strategy.PayStrategy;
import com.adminsys.utils.SpringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 10-11
 **/
@Component
public class PayContextStrategy {

    @Resource
    private PaymentChannelDao paymentChannelDao;

    /**
     * 获取具体实现策略实现
     * @return
     */
    public String toPayHtml(String payCode){
       if(StringUtils.isEmpty(payCode)){
           return "payCode不能为空";
       }

       // 1. 查询数据库获取具体策略实现
        PaymentChannelEntity paymentChannel = paymentChannelDao.getPaymentChannel(payCode);
       if(paymentChannel == null){
           return "没有查询支付渠道";
       }
        String strategyBeanId = paymentChannel.getStrategyBeanId();
       if(StringUtils.isEmpty(strategyBeanId)){
            return "数据库中没有配置strategyBeanId";
       }
        PayStrategy payStrategy = SpringUtils.getBean(strategyBeanId, PayStrategy.class);
        return payStrategy.toPayHtml();
    }
}
