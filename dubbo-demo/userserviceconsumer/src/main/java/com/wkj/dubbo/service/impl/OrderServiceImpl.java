package com.wkj.dubbo.service.impl;

import com.wkj.dubbo.bean.UserAddress;
import com.wkj.dubbo.service.OrderService;
import com.wkj.dubbo.service.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress>addressList = userService.getUserAddressList(userId);

        System.out.println(addressList.toString());
    }
}
