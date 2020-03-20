package com.adminsys.handler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-52
 **/

public interface AbstractWomen {

    //状态等级，将决定由谁来处理她的请求
    int getLevel();

    // 请假理由
    String getRequest();

}
