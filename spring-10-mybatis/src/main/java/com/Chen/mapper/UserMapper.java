package com.Chen.mapper;

import com.Chen.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    public int addUser(User user);

    public int deleteUser(int id);
}
