package com.Chen.Dao;


import org.junit.validator.ValidateWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于<!-- 指定要扫描的包，这个包下的注解就会生效-->
//@Compotent 组件
@Component
@Scope("singleton")  //生命周期单例模式
public class User {
    public String name;

    @Value("大哥哥")
    public void setName(String name) {
        this.name = name;
    }
}
