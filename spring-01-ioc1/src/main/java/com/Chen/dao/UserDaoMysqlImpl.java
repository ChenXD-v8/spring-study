package com.Chen.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUsers() {
        System.out.println("Mysql获取所有用户");
    }
}
