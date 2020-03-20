package com.adminsys.controller;

import com.adminsys.context.PayContextStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qiang
 * @Description:
 * @Create: 2019-12-21 10-41
 **/

@RestController
public class PayController {

    @Autowired
    private PayContextStrategy payContextStrategy;

    @GetMapping("toPayHtml")
    public String toPayHtml(String payCode){
        return payContextStrategy.toPayHtml(payCode);
    }

}
