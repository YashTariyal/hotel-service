# Hotel Service

A Spring Boot microservice for managing hotel data, including creation, retrieval, and storage in a PostgreSQL database.

## Features
- Create a new hotel
- Retrieve a single hotel by ID
- Retrieve all hotels
- Stores data in PostgreSQL using Spring Data JPA
- Lombok for boilerplate code reduction

## Technologies Used
- Java 17
- Spring Boot 2.7.5
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Getting Started

### Prerequisites
- Java 17+
- Maven
- PostgreSQL

### Setup
1. **Clone the repository:**
   ```bash
   git clone <your-repo-url>
   cd hotel-service
   ```
2. **Configure the database:**
   - Edit `src/main/resources/application.properties` or `application.yml` with your PostgreSQL credentials.

3. **Build the project:**
   ```bash
   ./mvnw clean install
   ```
4. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```
   The service will start on port `8081` by default.

## API Endpoints

### Create Hotel
- **POST** `/hotels`
- **Body:**
  ```json
  {
    "name": "Hotel Name",
    "location": "City, Country",
    "about": "Description of the hotel."
  }
  ```
- **Response:** `201 Created` with the created hotel object

### Get All Hotels
- **GET** `/hotels`
- **Response:** List of all hotels

### Get Hotel by ID
- **GET** `/hotels/{hotelId}`
- **Response:** Hotel object with the given ID

## Project Structure
- `controllers/` - REST controllers
- `entities/` - JPA entities
- `services/` - Service interfaces and implementations
- `respositories/` - Spring Data JPA repositories
- `exceptions/` - Exception handling

## Notes
- Lombok is used for getters/setters. Make sure your IDE supports Lombok.
- Update the database configuration as needed for your environment.

## License
This project is for educational/demo purposes. 