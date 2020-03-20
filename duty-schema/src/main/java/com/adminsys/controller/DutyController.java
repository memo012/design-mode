package com.adminsys.controller;

import com.adminsys.factory.FactoryHandler;
import com.adminsys.handler.AbstractWomen;
import com.adminsys.handler.AbstractWomenImpl;
import com.adminsys.impl.CurrentLimitHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-25 04-14
 **/
@RestController
public class DutyController {


    @GetMapping("clientHandler")
    public String clientHandler(){
        CurrentLimitHandler firstGatewayHandler = FactoryHandler.getFirstGatewayHandler();
        Random random = new Random();
        List<AbstractWomen> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(new AbstractWomenImpl(random.nextInt(4), "比赛"));
        }
        for(AbstractWomen women : list){
           firstGatewayHandler.handleMessage(women);
        }
        return "success";
    }

}
