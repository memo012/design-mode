package com.adminsys.dao;

import com.adminsys.entity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentChannelDao {

    @Select("select * from payment_channel where channel_id = #{payCode}")
    public PaymentChannelEntity getPaymentChannel(String payCode);

}
