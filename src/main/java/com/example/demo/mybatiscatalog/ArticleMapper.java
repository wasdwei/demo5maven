package com.example.demo.mybatiscatalog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM t_article WHERE id =#{id}")
    public Article findById(Integer id);
}
