package dsy;

import dsy.dao.Impl.userDaoImpl;
import dsy.services.Impl.userServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        userDaoImpl userDao = (userDaoImpl) applicationContext.getBean("userDao");
        userServiceImpl userService = (userServiceImpl) applicationContext.getBean("userService");
//        System.out.println(userDao);
//        System.out.println(userService);
//        applicationContext.close();
//        userDao.show();
            userService.show();
    }
}
