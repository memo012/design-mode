package com.adminsys.handler;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-53
 **/

public class AbstractWomenImpl implements AbstractWomen {

    private int level;

    private String request;

    public AbstractWomenImpl(int level, String request) {
        this.level = level;
        this.request = request;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
