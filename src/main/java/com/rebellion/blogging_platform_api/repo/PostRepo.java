package com.rebellion.blogging_platform_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rebellion.blogging_platform_api.entity.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{
    
}
