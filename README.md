# Library_Student_Fee_Portal

Library_Student_Fee_Portal is a Spring Boot application designed to manage student fees efficiently within a library system. It provides endpoints to create, retrieve, update, and delete student and fee information.

## Features

- Manage student information
- Track and manage student fees
- RESTful API for integration with other systems
- In-memory H2 database for development and testing

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven

### Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/yourusername/Library_Student_Fee_Portal.git
    cd Library_Student_Fee_Portal
    ```

2. Build the project:

    ```sh
    mvn clean install
    ```

3. Run the application:

    ```sh
    mvn spring-boot:run
    ```

### Configuration

The application is configured to use an in-memory H2 database by default. You can find the configuration in the `src/main/resources/application.properties` file.

```properties
# Enable H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.datasource.platform=h2

# Hibernate DDL Auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto=update
