package com.rebellion.blogging_platform_api.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Post;

public interface PostService {
    ResponseEntity<?> createPost(Post post);
    ResponseEntity<List<Post>> getPosts();
    ResponseEntity<List<Post>> getPostsBySearchTerm(String term);
    ResponseEntity<?> getPostById(int id);
    ResponseEntity<?> updatePostById(int id, PostDao postDao);
    ResponseEntity<?> deletePostById(int id);
}
