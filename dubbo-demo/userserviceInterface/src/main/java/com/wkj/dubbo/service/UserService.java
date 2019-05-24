package com.wkj.dubbo.service;

import com.wkj.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);

}
