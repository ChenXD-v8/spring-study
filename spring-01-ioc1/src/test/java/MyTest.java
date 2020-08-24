import com.Chen.dao.UserDaoImpl;
import com.Chen.dao.UserDaoMysqlImpl;
import com.Chen.dao.UserDaoOracleImpl;
import com.Chen.service.UserServiceImpl;
import com.Chen.service.UserServive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//         UserServive userServive=new UserServiceImpl();
//         //控制权不在程序员手上，程序不再具有主动性 而是被动的接受对象
//        ((UserServiceImpl) userServive).setUserDao(new UserDaoOracleImpl());
//         userServive.getUser();
        //获取ApplicationContext;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = context.getBean("UserServiceImpl", UserServiceImpl.class);
        userServiceImpl.getUser();
    }
}