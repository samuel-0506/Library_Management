# 📚 Library Management System

A RESTful API developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL to manage books and library members.

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Swagger UI
* Postman

## ✨ Features

* Add, view, update, and delete books.
* Register and manage library members.
* Retrieve books and members by ID.
* Store data in a MySQL database.
* Test REST APIs using Swagger UI and Postman.

## ⚙️ Database Configuration

1. Create a MySQL database named `sbdata`.
2. Configure your MySQL username and password using environment variables:

   * `DB_USERNAME`
   * `DB_PASSWORD`
3. Start the MySQL server before running the application.

## 🚀 How to Run

1. Clone this repository.
2. Open the project in Eclipse or another Java IDE.
3. Configure the database credentials.
4. Run `LibraryManagementApplication.java`.

Application URL: `http://localhost:8080`

## 🔗 API Endpoints

### Book APIs

| Method | Endpoint      | Description      |
| ------ | ------------- | ---------------- |
| POST   | `/book`       | Add a book       |
| GET    | `/book/books` | Get all books    |
| GET    | `/book/{id}`  | Get a book by ID |
| PUT    | `/book/{id}`  | Update a book    |
| DELETE | `/book/{id}`  | Delete a book    |

### Member APIs

| Method | Endpoint          | Description        |
| ------ | ----------------- | ------------------ |
| POST   | `/member`         | Register a member  |
| GET    | `/member/members` | Get all members    |
| GET    | `/member/{id}`    | Get a member by ID |
| PUT    | `/member/{id}`    | Update a member    |
| DELETE | `/member/{id}`    | Delete a member    |

## 📘 Swagger UI

Explore and test the APIs using Swagger UI:

`http://localhost:8080/swagger-ui/index.html`

## 👨‍💻 Author

Samuel
