package com.example.demo;

import com.example.demo.configbean.Person;
import com.example.demo.mybatiscatalog.ArticleMapper;
import com.example.demo.mybatiscatalog.CommentMapper;
import com.example.demo.mybatiscatalog.redis.Address;
import com.example.demo.mybatiscatalog.redis.Family;
import com.example.demo.mybatiscatalog.redis.Personn;
import com.example.demo.mybatiscatalog.redis.PersonRepository;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo5ApplicationTests {
    @Autowired
    Person person;
    @Autowired
    private PersonRepository repository;
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
//    @Autowired
//    private DiscussRepository repository;
    @Test
    void contextLoads() {
//        System.out.println("单元测试返回的数据---" + id);
//        System.out.println("单元测试返回的数据---" + user);
//        System.out.println("单元测试返回的数据---" + person);
//        Comment comment=commentMapper.findById(3);
//        System.out.println("单元测试返回的数据---" + comment);
//        Article article=articleMapper.findById(2);
//        System.out.println("单元测试返回的数据--- "+article);
//
//        //更新数据库字段
//        comment.setaId(1);
//        comment.setAuthor("aaaa");
//        comment.setContent("dad");
//        commentMapper.updateComment(comment);
//        //插入数据库字段
//        Comment comment1=new Comment();
//        comment1.setaId(2);
//        comment1.setAuthor("aihjuha");
//        comment1.setContent("dad");
//        commentMapper.insertComment(comment1);
//        System.out.println(comment1);
//        System.out.println("-----------------------------------");
//
//
//        //删除数据库字段
//        commentMapper.deleteComment(6);
//        Myproperties myproperties = (Myproperties) applicationContext.getBean("xmlproperties");
//        if (myproperties != null) {
//            myproperties.getResult();
//            System.out.println();
//        }
//        Jap编写测试方法
//        List<Discuss> list = repository.findByAuthorNotNull();
//        System.out.println(list);
//        redis编写测试方法
        Personn personn=new Personn("01","张","有才");
        Personn personn1=new Personn("02","jim","ruike");
        Address address=new Address("北京","chaina");
        personn.setAddress(address);
        List<Family> list=new ArrayList<>();
        Family dad =new Family("爹","老逼登");
        Family mom =new Family("妈","妈");
        list.add(dad);
        list.add(mom);
        personn.setFamilyList(list);

        Personn save = repository.save(personn);
        Personn save1 = repository.save(personn1);
//        System.out.println(save);
//        System.out.println(save1);
        List<Personn> list3 = repository.findByAddress_City("北京");
        System.out.println(list3);
    }
}

