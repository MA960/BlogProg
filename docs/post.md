# Post

## Overview
`Post` is a Java class that represents a blog post in the application.
It serves as the entity model for the database.

## Fields
| Field   | Type   | Description                   |
|---------|--------|-------------------------------|
| id      | Long   | Unique identifier of the post |
| title   | String | Title of the post             |
| content | String | Content of the post           |
| author  | String | Author's name                 |

## Notes
- Annotated with `@Entity` (if using JPA) to map to a database table.
- The `id` field is typically `@GeneratedValue` for auto-increment.
