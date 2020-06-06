package com.chinasoft.test;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public SqlSessionFactory factory = SessionUtil.getSession();

    public UserTest() throws IOException {
    }

    @Test
    public void addUser(){
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(16,"xiaom","lll","666","haxi","12121",1);
        mapper.addUserByPar(user);
        session.commit();
        session.close();
    }

    @Test
    public void selectAllUser(){
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users =  mapper.selectAll();
        for (User user:users){
            System.out.println(user);
        }
        //could not commit
        session.close();
    }

    @Test
    public void selectOneByPar(){
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user =  mapper.selectOneByPar(2);
        System.out.println(user);
        //could not commit
        session.close();
    }

    @Test
    public void selectLogin(){
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("sichuan");
        user.setPassword("123456");
        User user1 = mapper.selectLogin(user);
        System.out.println(user1);
        session.close();
    }

    @Test
    public void selectSomeUser(){
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<User> users = mapper.selectSomeUser(list);
        for (User user:users){
            System.out.println(user);
        }
         session.close();
    }
}

