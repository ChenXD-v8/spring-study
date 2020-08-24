package com.Chen.mapper;

import com.Chen.pojo.User;
import org.apache.ibatis.jdbc.SQL;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUsers() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUsers();
    }

    @Override
    public int addUser(User user) {
       UserMapper mapper=getSqlSession().getMapper(UserMapper.class);
       return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper=getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
