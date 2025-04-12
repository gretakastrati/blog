package com.example.blog.service;

import com.example.blog.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, Comment comment);

    List<Comment> getCommentsByPost(Long postId);

    Comment updateComment(Long commentId, Comment updatedComment);

    void deleteComment(Long commentId);
}
