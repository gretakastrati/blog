package com.example.blog.service;

import com.example.blog.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    List<Post> getAllPosts();

    Post getPostById(Long id);

    Post updatePost(Long id, Post updatedPost);

    void deletePost(Long id);

    List<Post> getPostsByCategory(Long categoryId);

}
