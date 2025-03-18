package com.rebellion.blogging_platform_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/")
    public String getApiStatus() {
        return new String("<h1 style=\"text-align: center; color: green;\">API is up!</h1>");
    }

    // CREATE
    @PostMapping("/posts")
    public String createPost(@RequestBody String entity) {
        // TODO: Implement createPost()
        return new String("createPost(String entity)");
    }

    // READ
    @GetMapping("/posts")
    public String getPosts() {
        // TODO: Implement getAllPosts()
        return new String("getAllPosts()");
    }

    @GetMapping("/posts/{id}")
    public String getPostById(@PathVariable int id) {
        // TODO: Implement getPostById(int id)
        return new String("getPostById(int id)");
    }

    // UPDATE
    @PutMapping("/posts/{id}")
    public String updatePostById(@PathVariable String id, @RequestBody String entity) {
        //TODO: Implement updatePostById(String id, String entity)
        return new String("updatePostById(String id, String entity)");
    }

    // DELETE
    @DeleteMapping("/posts/{id}")
    public String deletePostById(@PathVariable String id) {
        //TODO: Implement deletePostById(String id)
        return new String("deletePostById(String id)");
    }
    
}
