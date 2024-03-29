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
1. Clone the repository: `git clone https://github.com/Diptanjankar82/Library_management_system.git`
2. Navigate to the project directory: `cd Library-Management-System`
3. Build the project using Maven: `mvn package`
4. Run the application: `java -jar target/Student-library-0.0.1-SNAPSHOT.jar`

### Using Intellij/Eclipse:
1. Let Maven resolve dependencies.
2. Run the SpringBootApplication.

## Backend Design
### Entities
- **Student**: Represents a student with attributes such as rollId, name, branch, age, cgpa, emailId.
- **LibraryCard**: Represents a card with attributes like cardNo, cardStatus, noOfBookIssued, and validity.
- **Book**: Represents a book with attributes such as book_id, title, noOfPages, genre,isIssued, and Price.
- **Author**: Represents an author with attributes like author_id, name, age, rating, noOfBooks and emailId.
- **Transaction**: Represents the Transaction Ststus like TransactionId, issueDate, returnDate, fineDate and fineAmount.
- **User**: Used for authentication and authorization with attributes like user_id, Authorization, Username, and Password.



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

![Screenshot (393)](https://github.com/Diptanjankar82/Library_management_system/assets/117863856/bcf412f6-b434-4a35-888e-3639f6642afe)

![Screenshot (394)](https://github.com/Diptanjankar82/Library_management_system/assets/117863856/5fe232da-98a9-4e70-b5c7-d8d3ba1155d2)

![Screenshot (395)](https://github.com/Diptanjankar82/Library_management_system/assets/117863856/d3e7f041-b54b-4b45-8c2a-c29daa609dd9)

![Screenshot (396)](https://github.com/Diptanjankar82/Library_management_system/assets/117863856/21209239-6667-42f4-8ac3-f59c276247fc)

## Conclusion
NOT COMPLETED ........ 

--The Library Management System offers a robust backend solution for managing library resources efficiently. Built with Java, Spring Boot, Hibernate, and MySQL, it provides a user-friendly interface for students and administrators to manage library operations seamlessly.



##Author

DIPTANJAN KAR
