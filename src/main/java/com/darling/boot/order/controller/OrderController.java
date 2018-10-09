package com.darling.boot.order.controller;

import com.darling.pubIn.bean.User;
import com.darling.pubIn.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/10/8 11:44
 *   @description   订单Controller
 */
@RestController
public class OrderController {

    @Autowired
    OrderService service;


    @RequestMapping(value = "/getUserList/{userId}")
    public List<User> getUserList(@PathVariable String userId){
        return service.initOrder(userId);

    }
}
