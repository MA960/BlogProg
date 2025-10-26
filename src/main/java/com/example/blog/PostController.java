package com.example.blog;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Handles HTTP requests and sends JSON responses
@RequestMapping("/posts") // Base URL for this controller
public class PostController {

    private final PostRepository postRepository;

    // Constructor injection (preferred way)
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    // GET /posts → list all posts
    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // GET /posts/{id} → get a single post
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found with id " + id));
    }

    // POST /posts → create a new post
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    // PUT /posts/{id} → update a post
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found with id " + id));

        post.setTitle(updatedPost.getTitle());
        post.setContent(updatedPost.getContent());
        post.setAuthor(updatedPost.getAuthor());

        return postRepository.save(post);
    }

    // DELETE /posts/{id} → delete a post
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return "Post with id " + id + " deleted successfully.";
    }
}
