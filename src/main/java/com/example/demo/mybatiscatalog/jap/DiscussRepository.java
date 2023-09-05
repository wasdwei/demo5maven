package com.example.demo.mybatiscatalog.jap;


import com.example.demo.mybatiscatalog.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface DiscussRepository extends JpaRepository<Discuss,Integer> {
    public List<Discuss> findByAuthorNotNull();
    @Query("SELECT c FROM t_comment c WHERE  c.aId = ?1")
    public List<Discuss> getDiscussPaged(Integer aid, Pageable pageable);

    @Query(value = "SELECT * FROM t_comment  WHERE  a_Id = ?1",nativeQuery = true)
    public List<Discuss> getDiscussPaged2(Integer aid,Pageable pageable);

    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE  c.id = ?2")
    public int updateDiscuss(String author,Integer id);

    @Transactional
    @Modifying
    @Query("DELETE t_comment c WHERE  c.id = ?1")
    public int deleteDiscuss(Integer id);
}
