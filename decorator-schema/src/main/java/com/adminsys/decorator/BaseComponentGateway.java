package com.adminsys.decorator;

import com.adminsys.GatewayComponent;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-27 08-01
 **/

public class BaseComponentGateway extends GatewayComponent {

    @Override
    public void service() {
        System.out.println("第一关>>>");
    }

}
