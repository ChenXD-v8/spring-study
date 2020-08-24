import com.Chen.pojo.Hello;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println("hello = " + hello);
    }
}
