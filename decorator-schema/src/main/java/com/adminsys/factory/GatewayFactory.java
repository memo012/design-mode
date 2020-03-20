package com.adminsys.factory;

import com.adminsys.GatewayComponent;
import com.adminsys.decorator.BaseComponentGateway;
import com.adminsys.decorator.LimitDecorator;
import com.adminsys.decorator.LogDecorator;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-27 08-15
 **/

public class GatewayFactory {
    public static GatewayComponent getFirstDecorator() {
//        BaseComponentGateway baseComponentGateway = new BaseComponentGateway();
//        LimitDecorator limitDecorator = new LimitDecorator();
//        LogDecorator logDecorator = new LogDecorator();
//        logDecorator.setGatewayComponent(limitDecorator);
//        limitDecorator.setGatewayComponent(baseComponentGateway);
        return new LogDecorator(new LimitDecorator(new BaseComponentGateway()));
    }
    public static void main(String[] args) {
        GatewayComponent firstDecorator = GatewayFactory.getFirstDecorator();
        firstDecorator.service();
    }
}
