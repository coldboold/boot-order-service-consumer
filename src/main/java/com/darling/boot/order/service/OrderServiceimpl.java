package com.darling.boot.order.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.darling.pubIn.bean.User;
import com.darling.pubIn.service.OrderService;
import com.darling.pubIn.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/10/8 11:42
 *   @description
 */
@Service
public class OrderServiceimpl implements OrderService {

    @Reference(version = "*")
    UserService service;

    @Override
    public List<User> initOrder(String userId) {
        return service.getUserAddressList(userId);
    }
}
