package com.adminsys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 14-03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "payment_channel")
public class PaymentChannelEntity {

    /**
     *  id
     */
    private Integer id;

    /**
     *  渠道名称
     */
    private String channelName;

    /**
     *  渠道Id
     */
    private String channelId;

    /**
     *  策略执行beanId
     */
    private String strategyBeanId;

}
