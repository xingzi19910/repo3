package com.it.test;

import com.it.domain.Account;
import com.it.domain.User;
import com.it.mapper.AccountMapper;
import com.it.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {


    @Test
    public void test3() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);


        Account account = new Account();

        account.setId(11);
        account.setName("aaaaa");
        account.setMoney(5555.3);

        mapper.save(account);

        sqlSession.commit();

        sqlSession.close();

    }


    @Test
    public void test2() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        Account account = new Account();
        account.setId(32);
        account.setName("jjjj");
        account.setMoney(5555.3);
        mapper.update(account);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setName("zhangsan");
        user.setGender("女");
        user.setAge(12);
        user.setAddress("兰州");
        user.setQq("147741");
        user.setEmail("zhangxing@qq.com");

        mapper.save(user);


    }

}
