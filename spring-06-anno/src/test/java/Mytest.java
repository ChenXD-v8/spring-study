import com.Chen.Dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext( "ApplicationConfig.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
