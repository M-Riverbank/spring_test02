package dsy.services.Impl;

import dsy.dao.userDao;
import dsy.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("userService")
public class userServiceImpl implements userService {
    //依赖注入
    @Autowired //根据类型注入,同类型Bean有多个会根据名称二次匹配
//    @Qualifier("userDao")//与@Autowired配合使用可以根据名称注入相称的Bean
//    @Resource(name = "userDao")//不指定名称根据类型注入，指定名称根据名称注入(一般不用)
    private userDao userDao;

    public void show() {
        System.out.println(userDao);
    }
}
