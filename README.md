# Cinema-RedisAPI

This is a demo project showcasing the use of Spring Boot with Spring Data JPA and Spring Data Redis for a simple Cinema API.

## Technologies Used

* **Spring Boot:** Framework for creating stand-alone, production-grade Spring based Applications.
* **Spring Data JPA:** Part of the larger Spring Data family, makes it easy to easily implement JPA based repositories.
* **Spring Data Redis:** Provides easy configuration and access to Redis from Spring applications.
* **H2 Database:** An in-memory database.
* **Maven:** Dependency Management.
* **Docker:** For running Redis in a container.

## Prerequisites

* Java 21 or later
* Maven
* Docker

## How to Run

1.  **Start Redis using Docker:**
    ```bash
    docker run -p 6379:6379 redis
    ```
2.  **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/Cinema-RedisAPI.git
    ```
3.  **Navigate to the project directory:**
    ```bash
    cd Cinema-RedisAPI
    ```
4.  **Run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
5.  The application will be available at `http://localhost:8080`.

## API Endpoints

The following endpoints are available:

*   `GET /movies`: Get all movies.
*   `GET /movies/{id}`: Get a movie by its ID.
*   `POST /movies`: Add a new movie.
*   `PUT /movies/{id}`: Update an existing movie.
*   `DELETE /movies/{id}`: Delete a movie by its ID.

## Caching

This application uses Redis for caching the movie data. When a request is made to get a movie, the application first checks if the data is available in the Redis cache. If it is, the data is returned from the cache. Otherwise, the data is fetched from the H2 database, stored in the cache, and then returned.
