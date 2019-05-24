package com.wkj.dubbo.service.impl;

import com.wkj.dubbo.bean.UserAddress;
import com.wkj.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> list = new ArrayList<UserAddress>();
        UserAddress address1 = new UserAddress(1,"222","222","2222","2222","Y");
        UserAddress address2 = new UserAddress(2,"333","333","333","333","Y");
        list.add(address1);
        list.add(address2);

        return list;
    }
}
