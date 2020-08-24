package com.Chen.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MybatilsUtils {
    public static SqlSession getSqlSession() throws IOException {
        String resources="mybatis-config.xml";
        InputStream in= Resources.getResourceAsStream(resources);
        return   new SqlSessionFactoryBuilder().build(in).openSession(true);
    }
}
