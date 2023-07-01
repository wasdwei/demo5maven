package com.example.demo;

import com.example.demo.configbean.Person;
import com.example.demo.mybatiscatalog.Article;
import com.example.demo.mybatiscatalog.ArticleMapper;
import com.example.demo.mybatiscatalog.Comment;
import com.example.demo.mybatiscatalog.CommentMapper;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo5ApplicationTests {

    @Autowired
    Person person;
    @Autowired(required = false)
    User user;
    @Value("${student.id}")
    int id;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void contextLoads() {
//        System.out.println("单元测试返回的数据---" + id);
//        System.out.println("单元测试返回的数据---" + user);
//        System.out.println("单元测试返回的数据---" + person);
        Comment comment=commentMapper.findById(3);
        System.out.println("单元测试返回的数据---" + comment);
        Article article=articleMapper.findById(2);
        System.out.println("单元测试返回的数据--- "+article);
//        Myproperties myproperties = (Myproperties) applicationContext.getBean("xmlproperties");
//        if (myproperties != null) {
//            myproperties.getResult();
//            System.out.println();
//        }
    }
}

