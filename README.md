
# Spring Boot CRUD Application with RESTful APIs

This is a Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing categories and products. The application follows RESTful principles and uses Spring Data JPA for data persistence.

## Features

- CRUD operations for categories
- CRUD operations for products
- One-to-many relationship between categories and products
- Server-side pagination for efficient data retrieval
- Fetching category details along with product details
- Uses Spring Boot, Spring Web, Spring Data JPA, and MYSQL Database 

## Installation

1. Clone the repository:
git clone https://github.com/sakshideo29/spring-boot-crud.git

2. Navigate to the project directory:

## Usage

 Categories API

- GET /api/categories?page={pageNumber}: Get all categories with pagination support.
- POST /api/categories: Create a new category.
- GET /api/categories/{id}: Get a category by its ID.
- PUT /api/categories/{id}: Update a category by its ID.
- DELETE /api/categories/{id}: Delete a category by its ID.

## Products API

- GET /api/products?page={pageNumber}: Get all products with pagination support.
- POST /api/products: Create a new product.
- GET /api/products/{id}: Get a product by its ID.
- PUT /api/products/{id}: Update a product by its ID.
- DELETE /api/products/{id}: Delete a product by its ID.
  
 ## Configuration

- Database configuration: You can configure your preferred RDBMS connection details in `application.properties`.
- Spring Boot application properties can be customized in `application.properties`.

spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=db_username
spring.datasource.password=db_password




## Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

