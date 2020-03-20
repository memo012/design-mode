package com.adminsys.decorator;

import com.adminsys.GatewayComponent;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-27 08-06
 **/
public class LimitDecorator extends AbstractDecorator {

    public LimitDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第二关>>>");
    }
}



