package com.example.blog.repository;

import com.example.blog.entity.Post;
import com.example.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByAuthor(User author);

    List<Post> findByCategory(Locale.Category category);

    Optional<Post> findByTittle(String tittle);

    boolean existsByTittle(String tittle);

    List<Post> findByContentContaining(String keyword);

    List<Post> findByAuthorAndCategory(User author, Locale.Category category);

    List<Post> findByCreatedAtAfter(LocalDateTime date);

    List<Post> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);


}
