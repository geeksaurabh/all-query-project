# Spring Boot Application - Readme
This Spring Boot application is an example of a basic implementation of a RESTful API using Spring Boot, Spring Data JPA, and MySQL.

## Getting Started
- Clone the repository to your local machine
- Set up a MySQL database and update the application.properties file with your database configuration
- Build and run the application using Maven or your favorite IDE
- Structure
- The application follows a standard Spring Boot project structure:


# Model
- The model package contains the Student class, which is a simple POJO that represents a student.

# Repository
- The repository package contains the StudentRepository interface, which extends the JpaRepository interface. This allows us to use the built-in methods for interacting with the database, as well as write custom queries.

# Service
- The service package contains the StudentService class, which implements the StudentServiceInterface. This class contains the business logic for the application, and it uses the StudentRepository to interact with the database.

# Controller
- The controller package contains the StudentController class, which handles incoming HTTP requests and routes them to the appropriate StudentService methods. The controller also performs input validation and maps database entities to DTOs.

# Custom Queries
In addition to the standard JPA repository methods, this application includes several custom queries in the StudentRepository. These queries include:


#### findStudentsByFirstName: Finds all students whose first name matches the specified value
#### findStudentsByFirstNameStartingWith: Finds all students whose first name starts with the specified value
#### findStudentsByLastName: Finds all students whose last name matches the specified value
#### findStudentsByLastNameEndingWith: Finds all students whose last name ends with the specified value
 
In addition, this application also includes a native SQL query in the StudentRepository. This query selects all students whose first name starts with the specified value, ordered by last name:
