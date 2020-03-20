package com.adminsys.service.test;

import com.adminsys.service.OrderService;
import com.adminsys.service.cglib.proxy.CglibMethodInterceptor;
import com.adminsys.service.jdk.proxy.JdkInvocationHandler;
import com.adminsys.service.impl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2020-03-02 10-25
 **/

public class proxyApp {
    public static void main(String[] args) {
//        OrderProxy orderProxy = new OrderProxy(new OrderServiceImpl());
//        orderProxy.order();
        // 1. 使用jdk动态代理
//        OrderService orderService = new JdkInvocationHandler(new OrderServiceImpl()).getProxy();
//        orderService.order();
        // 2. 使用cglib动态代理
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setCallback(cglibMethodInterceptor);
        OrderServiceImpl o = (OrderServiceImpl) enhancer.create();
        o.order();
    }
}
