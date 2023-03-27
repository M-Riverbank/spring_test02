package dsy.dao.Impl;

import dsy.dao.userDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//<bean id="userDao" class="dsy.dao.Impl.userDaoImpl"></bean>
//@Repository("userDao")//dao层常用
//@Service("userDao")//Service层常用
//@Controller("userDao")//Controller层常用(springMVC)
//效果与Component一样
@Component("userDao")
@Scope("singleton")
@Lazy(false)
public class userDaoImpl implements userDao {
    @Value("zhangsan")
    private String userName;

    public void show() {
        System.out.println(userName);
    }

    //    public String getUserName() {
//        return userName;
//    }
    @Value("lisi")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //    public userDaoImpl() {
//        System.out.println("userDaoImpl创建");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("初始化方法");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("销毁方法");
//    }
}
