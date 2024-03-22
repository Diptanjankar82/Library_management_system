README.md:

# Library Management System

## Introduction
The Library Management System is designed to facilitate the management of books available in a college library. It allows students to register as users, browse available books, and issue or return books hassle-free. The backend of the system is built using a Monolithic Architecture with a focus on simplicity and scalability.

## Technologies and Dependencies Used
- **Maven**: Dependency management tool.
- **Spring Boot**: Framework for building web applications and writing REST APIs.
- **Spring Security**: Provides authentication and authorization functionalities.
- **Spring Data JPA (Hibernate)**: Simplifies database interactions and improves code readability.
- **MySQL**: Java persistence store for storing data.
- **Project Lombok**: Reduces boilerplate Java code.

## How to Use
### Using CLI:
1. Clone the repository: `git clone https://github.com/saikat021/Library-Management-System.git`
2. Navigate to the project directory: `cd Library-Management-System`
3. Build the project using Maven: `mvn package`
4. Run the application: `java -jar target/Student-library-0.0.1-SNAPSHOT.jar`

### Using Intellij/Eclipse:
1. Let Maven resolve dependencies.
2. Run the SpringBootApplication.

## Backend Design
### Entities
- **Student**: Represents a student with attributes such as student_id, country, emailId, name, age, and card_id.
- **Card**: Represents a card with attributes like card_id, createdOn, updatedOn, and status.
- **Book**: Represents a book with attributes such as book_id, isAvailable, genre, and author_id.
- **Author**: Represents an author with attributes like author_id, country, name, and emailId.
- **User**: Used for authentication and authorization with attributes like user_id, Authorization, Username, and Password.

### Relationships Between Entities and ER Diagram
- An additional SQL table called Transaction is created to map the N:M relationship between Card and Book entities.
- Transaction table includes attributes like transaction_id, UUID, card_id, book_id, isIssue, Transaction status, date, and fine amount.

## Functionalities Exposed
### Student Controller
- Exposes CRUD APIs for creating, updating, and deleting student information.
- Provides an API for changing passwords.

### Book and Author Controller
- Exposes CRUD operations for managing books and authors.

### Transaction Controller
- Provides APIs for issuing and returning books.
- Handles operations like checking card activation, book availability, and maximum book issuance limit.

## Security
- **Spring Security** is used for authentication and authorization.
- For each API call, it validates the entity's cookies and ensures the Username matches the details of the entity being changed.
- Example APIs: `/student/all` (ADMIN), `/student/changePassword` (STUDENT), `/transaction/issueBook` (STUDENT).

## Branches
- The `Security` branch includes security-related enhancements.

## Conclusion
The Library Management System offers a robust backend solution for managing library resources efficiently. Built with Java, Spring Boot, Hibernate, and MySQL, it provides a user-friendly interface for students and administrators to manage library operations seamlessly.
