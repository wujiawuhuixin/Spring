import SpringStudy.ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @org.junit.Test
    public void test(){
        String xmlPath= "IocBeans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService) applicationContext.getBean("UserServiceImpl");
        userService.say();
    }
}
