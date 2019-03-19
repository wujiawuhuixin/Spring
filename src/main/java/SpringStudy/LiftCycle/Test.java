package SpringStudy.LiftCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        String xmlPath= "LifeCycleBeans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService) applicationContext.getBean("UserServiceImpl");
        userService.say();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
