package com.adminsys.decorator;

import com.adminsys.GatewayComponent;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-27 08-03
 **/
public class AbstractDecorator extends GatewayComponent {

    public GatewayComponent gatewayComponent;

    public AbstractDecorator(GatewayComponent gatewayComponent){
        this.gatewayComponent = gatewayComponent;
    }

    @Override
    public void service() {
        if(gatewayComponent != null){
            gatewayComponent.service();
        }
    }
//    public void setGatewayComponent(GatewayComponent gatewayComponent) {
//        this.gatewayComponent = gatewayComponent;
//    }
}
