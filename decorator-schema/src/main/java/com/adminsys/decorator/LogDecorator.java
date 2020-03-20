package com.adminsys.decorator;

import com.adminsys.GatewayComponent;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-27 08-06
 **/
public class LogDecorator extends AbstractDecorator {

    public LogDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第三关>>>");
    }

}



