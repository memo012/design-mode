package com.adminsys.factory;

import com.adminsys.impl.BlackListHandler;
import com.adminsys.impl.ConversationHandler;
import com.adminsys.impl.CurrentLimitHandler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-09
 **/

public class FactoryHandler {

    public static CurrentLimitHandler getFirstGatewayHandler(){
        CurrentLimitHandler currentLimitHandler = new CurrentLimitHandler();
        BlackListHandler blackListHandler = new BlackListHandler();
        ConversationHandler conversationHandler = new ConversationHandler();
        currentLimitHandler.setNextGatewayHandler(blackListHandler);
        blackListHandler.setNextGatewayHandler(conversationHandler);
        return currentLimitHandler;
    }
}
