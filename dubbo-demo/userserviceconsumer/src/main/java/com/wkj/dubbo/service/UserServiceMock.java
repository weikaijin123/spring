package com.wkj.dubbo.service;

import com.wkj.dubbo.bean.UserAddress;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceMock implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"444","444","444","444","Y");
        UserAddress address2 = new UserAddress(2,"333","333","333","333","Y");
        return Arrays.asList(address1,address2);
    }
}
