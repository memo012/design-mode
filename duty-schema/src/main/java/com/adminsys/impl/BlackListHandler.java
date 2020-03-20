package com.adminsys.impl;

import com.adminsys.handler.AbstractWomen;
import com.adminsys.handler.GatewayHandler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-05
 **/

public class BlackListHandler extends GatewayHandler {

    public BlackListHandler(){
        super(GatewayHandler.BLACK_LEVEL);
    }

    @Override
    public void service(AbstractWomen abstractWomen) {
        System.out.println("项目经理同意请假，请求等级为:" + abstractWomen.getLevel());
    }

}
