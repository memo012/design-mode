package com.adminsys.impl;

import com.adminsys.handler.AbstractWomen;
import com.adminsys.handler.GatewayHandler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-05
 **/

public class CurrentLimitHandler extends GatewayHandler {

    public CurrentLimitHandler() {
        super(GatewayHandler.CURRENT_LEVEL);
    }

    @Override
    public void service(AbstractWomen abstractWomen) {
        System.out.println("项目组长同意请假，请求等级为:" + abstractWomen.getLevel());
    }

}
