package com.rebellion.blogging_platform_api.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rebellion.blogging_platform_api.dao.PostDao;
import com.rebellion.blogging_platform_api.entity.Status;
import com.rebellion.blogging_platform_api.entity.StatusEnum;
import com.rebellion.blogging_platform_api.entity.Post;
import com.rebellion.blogging_platform_api.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService{

    private PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public ResponseEntity<Post> createPost(Post post) {
        Post savedPost = postRepo.save(post);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Post>> getPosts() {
        return new ResponseEntity<>(postRepo.findAll(), HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Post>> getPostsBySearchTerm(String term) {
        return new ResponseEntity<>(postRepo.searchPosts(term), HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<?> getPostById(int id) {
        Optional<Post> post = postRepo.findById(id);
        if(post.isPresent()) {
            return new ResponseEntity<>(post, HttpStatus.OK);
        }
        return new ResponseEntity<>(new Status(StatusEnum.ERROR, HttpStatus.NOT_FOUND, "No post found with Id: " + id), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<?> updatePostById(int id, PostDao postDao) {
        Optional<Post> post = postRepo.findById(id);
        if(post.isPresent()) {
            post.get().setTitle(postDao.getTitle());
            post.get().setContent(postDao.getContent());
            post.get().setCategory(postDao.getCategory());
            post.get().setTags(postDao.getTags());
            post.get().setUpdatedAt(LocalDateTime.now());
            return new ResponseEntity<>(postRepo.save(post.get()), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Status(StatusEnum.ERROR, HttpStatus.NOT_FOUND, "No post found with Id: " + id), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<?> deletePostById(int id) {
        Optional<Post> post = postRepo.findById(id);
        if(post.isPresent()) {
            postRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(new Status(StatusEnum.ERROR, HttpStatus.NOT_FOUND, "No post found with Id: " + id), HttpStatus.NOT_FOUND);
    }

}
