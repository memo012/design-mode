package com.adminsys.impl;

import com.adminsys.handler.AbstractWomen;
import com.adminsys.handler.GatewayHandler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-05
 **/

public class ConversationHandler extends GatewayHandler {

    public ConversationHandler(){
        super(GatewayHandler.CONVERSATION_LEVEL);
    }

    @Override
    public void service(AbstractWomen abstractWomen) {
        System.out.println("总经理同意请假，请求等级为:" + abstractWomen.getLevel());
    }



}
