package com.Chen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//将user类注册到容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("赛丽亚")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
