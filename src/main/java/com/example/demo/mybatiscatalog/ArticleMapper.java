package com.example.demo.mybatiscatalog;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM t_article WHERE id =#{id}")
    public Article findById(Integer id);
    @Insert("INSERT INTO t_comment(content,author,a_id) " +
            "values (#{content},#{author},#{aId})")
    public int insertArticle(Article article);

    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateArticle(Article article);

    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int deleteArticle(Integer id);

}
