package com.adminsys.service.proxy;

import com.adminsys.service.OrderService;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2020-03-02 10-22
 **/

public class OrderProxy implements OrderService {

    /**
     *  被代理对象
     */
    private OrderService orderService;
    public OrderProxy(OrderService orderService){
        this.orderService = orderService;
    }

    public void order() {
        System.out.println(">>>>打印订单日志开始");
        orderService.order();
        System.out.println(">>>>打印订单日志结束");
    }
}
