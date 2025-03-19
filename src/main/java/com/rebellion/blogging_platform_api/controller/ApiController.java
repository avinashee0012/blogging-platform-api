package com.rebellion.blogging_platform_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Post;
import com.rebellion.blogging_platform_api.service.PostServiceImpl;

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
    public String createPost(@RequestBody PostDao postDao) {
        // TODO: CONTROLLER Implement createPost(PostDao postDao)
        return new String("createPost(PostDao postDao)");
    }

    // READ
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(@RequestParam(required = false) String term) {
        // TODO: CONTROLLER Implement getPosts(String term)
        return postServiceImpl.getPosts(term);
    }

    @GetMapping("/posts/{id}")
    public String getPostById(@PathVariable int id) {
        // TODO: CONTROLLER Implement getPostById(int id)
        return new String("getPostById(int id)");
    }

    // UPDATE
    @PutMapping("/posts/{id}")
    public String updatePostById(@PathVariable int id, @RequestBody PostDao postDao) {
        // TODO: CONTROLLER Implement updatePostById(int id, PostDao postDao)
        return new String("updatePostById(int id, PostDao postDao)");
    }

    // DELETE
    @DeleteMapping("/posts/{id}")
    public String deletePostById(@PathVariable int id) {
        // TODO: CONTROLLER Implement deletePostById(int id)
        return new String("deletePostById(int id)");
    }
    
}
