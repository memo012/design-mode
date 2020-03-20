package com.adminsys.service.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2020-03-02 10-33
 **/
public class JdkInvocationHandler implements InvocationHandler {

    /**
     *  被代理类对象
     */
    private Object target;

    public JdkInvocationHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>打印订单日志开始");
        // java 的反射机制执行方法 目标对象方法
        Object invoke = method.invoke(target, args);
        System.out.println(">>>>打印订单日志结束");
        return invoke;
    }

    /**
     *  获取代理对象接口
     * @param <T>
     * @return
     */
    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
