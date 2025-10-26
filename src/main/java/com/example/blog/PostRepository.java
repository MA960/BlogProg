package com.example.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks this as a Spring-managed bean
public interface PostRepository extends JpaRepository<Post, Long> {
    // No implementation needed; JpaRepository gives us CRUD methods:
    // save, findAll, findById, deleteById, etc.
}
