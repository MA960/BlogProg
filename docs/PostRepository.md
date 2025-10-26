# PostRepository

## Overview
`PostRepository` is an interface that handles database access for `Post` entities.
It extends `JpaRepository` provided by Spring Data JPA.

## Features
- Provides CRUD methods like `save()`, `findAll()`, `findById()`, `deleteById()`.
- No need to implement methods manually; Spring Data JPA generates them automatically.

## Example Usage
```java
List<Post> posts = postRepository.findAll();
Post post = postRepository.findById(1L).orElseThrow(...);
postRepository.save(newPost);
postRepository.deleteById(2L);
