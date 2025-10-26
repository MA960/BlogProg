# PostController

## Overview
`PostController` is a Spring Boot REST controller that manages blog posts.
It handles all CRUD operations (Create, Read, Update, Delete) via HTTP requests.

## Endpoints

| Method | URL             | Description                    |
|--------|----------------|--------------------------------|
| GET    | /posts          | List all posts                 |
| GET    | /posts/{id}     | Get a single post by ID        |
| POST   | /posts          | Create a new post              |
| PUT    | /posts/{id}     | Update an existing post        |
| DELETE | /posts/{id}     | Delete a post by ID            |

## How It Works
- Uses `PostRepository` to interact with the database.
- Automatically converts Java objects to JSON responses.
- Validates existence of posts before updating or deleting.
