package com.it.test;

import com.it.domain.User;
import com.it.mapper.UserMapper;
import com.it.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    /*@Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = app.getBean("accountService",AccountService.class);
     //   service.save();


    }*/
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){
        User user = new User();
        user.setName("tianqi");
        user.setGender("男");
        user.setAge(96);
        user.setAddress("上海");
        user.setQq("668888886");
        user.setEmail("ttt@qq.com");
        userMapper.save(user);

        System.out.println(">>>>>>>>>>>>>>>>>>>==================++++++++++++"+user.getId());
    }

}
