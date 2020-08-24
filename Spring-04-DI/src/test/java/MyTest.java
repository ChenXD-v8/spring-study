import com.Chen.pojo.Student;
import com.Chen.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context= new ClassPathXmlApplicationContext("user.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
}
