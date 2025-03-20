package com.rebellion.blogging_platform_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Post;
import com.rebellion.blogging_platform_api.service.PostServiceImpl;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/v1/api")
public class ApiController {

    private PostServiceImpl postServiceImpl;

    public ApiController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping("")
    public String getApiStatus() {
        return new String("<h1 style=\"text-align: center; color: green;\">API is up!</h1>");
    }

    // CREATE
    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@Valid @RequestBody PostDao postDao) {
        Post post = postDao.toPost();
        return postServiceImpl.createPost(post);
    }

    // READ
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(@RequestParam(required = false) String term) {
        if(term == null) {
            return postServiceImpl.getPosts();
        } else {
            return postServiceImpl.getPostsBySearchTerm(term);
        }
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<?> getPostById(@PathVariable int id) {
        return postServiceImpl.getPostById(id);
    }

    // UPDATE
    @PutMapping("/posts/{id}")
    public ResponseEntity<?> updatePostById(@PathVariable int id, @RequestBody PostDao postDao) {
        return postServiceImpl.updatePostById(id, postDao);
    }

    // DELETE
    @DeleteMapping("/posts/{id}")
    public ResponseEntity<?> deletePostById(@PathVariable int id) {
        return postServiceImpl.deletePostById(id);
    }
    
}
