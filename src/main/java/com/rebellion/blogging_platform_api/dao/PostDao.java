package com.rebellion.blogging_platform_api.dao;

import java.util.List;

import com.rebellion.blogging_platform_api.entity.Post;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PostDao {

    @NotEmpty(message = "Title is mandatory")
    @Size(min = 5, max = 50, message = "Title should be 5 to 50 characters long.")
    private String title;
    @NotEmpty(message = "Contecnt is mandatory")
    @Size(min = 5, max = 1000, message = "Contecnt should be 50 to 1000 characters long.")
    private String content;
    @NotEmpty(message = "Category is mandatory")
    @Size(min = 3, max = 25, message = "Category should be 3 to 10 characters long.")
    private String category;
    @NotEmpty(message = "List of tags is mandatory")
    @Size(min = 1, max = 5, message = "List of tags should have 1 to 5 tags.")
    private List<String> tags;

    public PostDao(String title, String content, String category, List<String> tags) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.tags = tags;
    }

    public PostDao() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Post [title=" + title + ", content=" + content + ", category=" + category + ", tags=" + tags + "]";
    }

    public Post toPost() {
        return new Post(title, content, category, tags);
    }

}
