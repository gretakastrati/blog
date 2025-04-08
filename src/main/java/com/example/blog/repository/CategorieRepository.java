package com.example.blog.repository;

import com.example.blog.entity.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    Optional<Categorie> findByName(String name);

    boolean existsByName(String name);
}
