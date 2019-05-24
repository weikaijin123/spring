package com.wkj.dubbo.test;

import com.wkj.dubbo.bean.UserAddress;
import com.wkj.dubbo.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {
    @Test
    public void TestDubboMock(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
        List<UserAddress> hello = userService.getUserAddressList("111"); // 执行远程方法
        System.out.println(hello.toString()); // 显示调用结果
    }
}
