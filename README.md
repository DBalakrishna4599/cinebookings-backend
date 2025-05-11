# CineBookings - Backend API

This is the Spring Boot backend API for the CineBookings movie ticket booking application.

## Features

*   User authentication (registration, login) with JWT.
*   Password reset request endpoint (to be fully implemented with email).
*   (Future: Endpoints for movies, theatres, screenings, bookings, payments).

## Technologies Used

*   Java (Version you used, e.g., 17)
*   Spring Boot (Version you used)
*   Spring Security (JWT Authentication)
*   Spring Data JPA
*   Maven (or Gradle)
*   MySQL (as the primary database)

## Prerequisites

*   JDK (e.g., 17 or newer)
*   Maven (or Gradle)
*   MySQL Server installed and running.

## Setup and Running

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/YOUR_USERNAME/YOUR_BACKEND_REPOSITORY_NAME.git
    cd YOUR_BACKEND_REPOSITORY_NAME
    ```

2.  **Database Setup (MySQL):**
    *   Ensure MySQL server is running.
    *   Create a database named `cinebookings_db` (or whatever you configured).
        ```sql
        CREATE DATABASE IF NOT EXISTS cinebookings_db;
        ```
    *   The application uses JPA and Hibernate. Set `spring.jpa.hibernate.ddl-auto` in `src/main/resources/application.properties`.
        *   For the first run, `create` or `create-drop` can be used to generate the schema:
          `spring.jpa.hibernate.ddl-auto=create`
        *   For subsequent runs, change to `update` or `validate`:
          `spring.jpa.hibernate.ddl-auto=update`
        *   **Alternatively, use the provided schema script (see next section).**

3.  **Configure Database Connection:**
    Open `src/main/resources/application.properties` and update the following properties with your MySQL details:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/cinebookings_db
    spring.datasource.username=your_mysql_username
    spring.datasource.password=your_mysql_password
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```
    **(Note: If you ignored `application.properties`, refer users to the `.template` file).**

4.  **Build and Run (using Maven):**
    ```bash
    mvn spring-boot:run
    ```
    **(Or using Gradle):**
    ```bash
    gradle bootRun
    ```

5.  The backend API will be available at `http://localhost:8089`.

## API Endpoints (Auth)

*   `POST /api/auth/register`
*   `POST /api/auth/login`
*   `POST /api/auth/request-password-reset`

*(Add more details as the project grows)*