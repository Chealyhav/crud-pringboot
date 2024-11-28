
## Table of Contents
- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Testing](#testing)
- [License](#license)

## Project Structure

### 1. Web Layer (Controller)
- Contains REST API controllers that handle HTTP requests and responses.
- Example files:
  - `EmployeeController.java` – Handles Employee-related APIs.
  - `DepartmentController.java` – Handles Department-related APIs.

### 2. Service Layer (Business Logic)
- Contains the business logic of the application and interacts with the repositories to perform CRUD operations.
- Example files:
  - `EmployeeService.java` – Manages employee-related logic.
  - `DepartmentService.java` – Manages department-related logic.

### 3. Data Access Layer (Repository)
- Interfaces with the database to perform CRUD operations on entities.
- Example files:
  - `EmployeeRepository.java` – Repository for Employee entity.
  - `DepartmentRepository.java` – Repository for Department entity.

### 4. Domain Layer (Model)
- Defines the entities (models) that represent database tables.
- Example files:
  - `Employee.java` – Entity representing an Employee.
  - `Department.java` – Entity representing a Department.

### 5. DTO Layer (Data Transfer Object)
- DTOs are used to transfer data between the web layer (controller) and the service layer.
- Example files:
  - `EmployeeDTO.java` – DTO for Employee data.
  - `DepartmentDTO.java` – DTO for Department data.

### 6. Exception Handling
- Custom exceptions to handle application-specific errors.
- Example:
  - `ResourceNotFoundException.java` – Custom exception for handling 404 errors.

### 7. Configuration Layer
- Contains configuration classes like database settings, security configurations, and CORS settings.
- Example:
  - `WebConfig.java` – Web configurations and CORS settings.

## Features

- **Employee Management**: Add, view, update, and delete employees.
- **Department Management**: Add, view, and update departments.
- **RESTful API**: Fully functional APIs for employee and department management.
- **Error Handling**: Custom exception handling for resource not found errors.

## Technologies Used

- **Spring Boot**: The core framework used to build the application.
- **Spring Data JPA**: For data access and CRUD operations with the database.
- **H2 Database**: In-memory database for development and testing (can be replaced with other databases such as MySQL or PostgreSQL).
- **Maven**: Build tool and dependency management.

## Setup and Installation

### Prerequisites

- **Java 8+**: Make sure you have Java 8 or later installed.
- **Maven**: Maven should be installed for building the project.

### Steps to Set Up

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/employee-management.git
   cd employee-management

