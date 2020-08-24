package com.Chen.Config;

import com.Chen.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Chen.pojo")
public class MyConfig2 {

    //注册一个bean，就相当于xml里面的bean标签
    //这个方法的名字，就相当于bean的id
    //返回值就相当于class属性
    @Bean
    public User getUser(){
        return new User();  //返回要注入到bean的对象
    }
}
