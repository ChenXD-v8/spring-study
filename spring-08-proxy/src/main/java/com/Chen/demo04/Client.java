package com.Chen.demo04;

import com.Chen.demo02.UserService;
import com.Chen.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        pih.setTarget(userService);  //设置要代理的的对象
        //动态生成代理类
        UserService proxy= (UserService) pih.getProxy();
        proxy.delete();
    }
}
