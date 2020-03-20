package com.adminsys.handler;

public abstract class GatewayHandler {

    public final static int CURRENT_LEVEL = 1;
    public final static int BLACK_LEVEL = 2;
    public final static int CONVERSATION_LEVEL = 3;

    //处理者可处理等级
    private int level;

    public GatewayHandler(int level) {
        this.level = level;
    }

    /**
     * 下一个handler
     */
    private GatewayHandler nextGatewayHandler;

    /**
     * 使用抽象类定义共同方法的行为
     */
    public abstract void service(AbstractWomen abstractWomen);

    /**
     * 执行下一个handler
     */
    protected void nextService(AbstractWomen abstractWomen) {
        if (nextGatewayHandler != null) {
            nextGatewayHandler.handleMessage(abstractWomen);
        } else {
            System.out.println("没人处理");
        }
    }

    /**
     * 设置下一个handler
     *
     * @param nextGatewayHandler
     */
    public void setNextGatewayHandler(GatewayHandler nextGatewayHandler) {
        this.nextGatewayHandler = nextGatewayHandler;
    }

    public void handleMessage(AbstractWomen abstractWomen) {
        //责任链模式，责任传递
        if (abstractWomen.getLevel() == level) {
            this.service(abstractWomen);
        } else {
            nextService(abstractWomen);
        }
    }

}
