package com.example.springbootjpa.jjj.test;

import com.example.springbootjpa.jjj.entity.User;
import com.example.springbootjpa.SpringbootJpaApplication;
import com.example.springbootjpa.jjj.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class DemoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User();
        user.setName("费杨洋");
        user.setPassword("123");
        userDao.save(user);

    }

    @Test
    public void look() {
        List<User> list=userDao.findAll();
       for(User uu: list){
           System.out.println(uu);
           System.out.println("6666");
       }
    }
}
