package com.rebellion.blogging_platform_api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rebellion.blogging_platform_api.entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{

/* 
    SELECT * FROM posts
    WHERE title LIKE "%term%" OR content LIKE "%term%" OR category LIKE "%term%";
*/

    @Query("SELECT p FROM Post p WHERE p.title LIKE %:term% OR p.content LIKE %:term% OR p.category LIKE %:term%")
    List<Post> searchPosts(@Param("term") String term);
}
