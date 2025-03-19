package com.rebellion.blogging_platform_api.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Post;
import com.rebellion.blogging_platform_api.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService{

    private PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public ResponseEntity<Post> createPost(PostDao postDao) {
        // TODO SERVICE createPost(PostDao postDao)
        return null;
    }

    @Override
    public ResponseEntity<List<Post>> getPosts(String term) {
        // TODO SERVICE getPosts(String term)
        return new ResponseEntity<>(postRepo.findAll(), HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Post> getPostById(int id) {
        // TODO SERVICE getPostById(int id)
        return null;
    }

    @Override
    public ResponseEntity<Post> updatePostById(int id, PostDao postDao) {
        // TODO SERVICE updatePostById(int id, PostDao postDao)
        return null;
    }

    @Override
    public ResponseEntity<String> deletePostById(int id) {
        // TODO SERVICE deletePostById(int id)
        return null;
    }

}
