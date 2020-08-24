import com.Chen.mapper.UserMapper;
import com.Chen.mapper.UserMapperImpl;
import com.Chen.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mytest {

    @Test
    public void testMybatis() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper=context.getBean("userMapper",UserMapperImpl.class);
        User user =new User();
        user.setId(9);
        user.setName("邓太阿");
        user.setPwd("123456");
        userMapper.addUser(user);
    }
}
