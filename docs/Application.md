
---

### **4. Application.md**

```markdown
# BlogProgApplication

## Overview
`BlogProgApplication` is the main entry point of the Spring Boot application.

## Features
- Annotated with `@SpringBootApplication`.
- Runs the embedded Tomcat server.
- Starts the application context and scans for components (`@RestController`, `@Repository`, etc.)

## How It Works
```java
@SpringBootApplication
public class BlogProgApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogProgApplication.class, args);
    }
}

---

### **5. README.md (inside docs/ for overview)**

```markdown
# Documentation for Mubeen's Blog

This folder contains detailed documentation for the Spring Boot blog project.

## Files

- **Post.md** → Explains the `Post` entity.
- **PostController.md** → Explains the REST controller and endpoints.
- **PostRepository.md** → Explains the database repository.
- **Application.md** → Explains the main application entry point.

## Usage
- All classes follow Spring Boot conventions.
- REST API endpoints are documented in `PostController.md`.
- Markdown files are meant for developers and maintainers to understand the codebase.
