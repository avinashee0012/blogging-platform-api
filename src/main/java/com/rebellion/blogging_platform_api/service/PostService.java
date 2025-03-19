package com.rebellion.blogging_platform_api.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Post;

public interface PostService {
    ResponseEntity<Post> createPost(PostDao postDao);
    ResponseEntity<List<Post>> getPosts(String term);
    ResponseEntity<Post> getPostById(int id);
    ResponseEntity<Post> updatePostById(int id, PostDao postDao);
    ResponseEntity<String> deletePostById(int id);
}
