package com.Chen.service;

import com.Chen.dao.UserDao;
import com.Chen.dao.UserDaoImpl;
import com.Chen.dao.UserDaoMysqlImpl;
import com.Chen.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserServive{

//    UserDao UserDao=new UserDaoOracleImpl();
    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUsers();
    }
}
