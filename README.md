# EcoBazaarX – Carbon Footprint Aware Shopping Assistant

EcoBazaarX is a full-stack web application developed as part of the Infosys Springboard Internship. This project establishes a secure system foundation using Java Spring Boot, JWT authentication, and role-based access control. It includes both backend APIs and a Bootstrap frontend for user interaction.

This repository contains Milestone-1 implementation: System Foundation, Authentication, and Role Setup.

---

## Features

### Authentication and Security

* User Registration with encrypted password (BCrypt)
* User Login with JWT token generation
* Secure password storage
* JWT-based authentication and protected routes
* Logout functionality

### Role-Based Access Control (RBAC)

* Three roles supported:

  * ADMIN
  * USER
  * ANALYST
* Role-based dashboard access
* Secure API protection using Spring Security

### Backend

* Java Spring Boot REST API
* Spring Security configuration
* JWT authentication filter
* MySQL database integration
* Maven project structure

### Frontend

* Bootstrap-based responsive UI
* Register page
* Login page
* Dashboard page
* JWT stored in browser localStorage

---

## Tech Stack

Backend:

* Java 17
* Spring Boot
* Spring Security
* JWT
* Maven

Frontend:

* HTML
* Bootstrap
* JavaScript

Database:

* MySQL

Tools:

* VS Code
* Git
* GitHub

---

## Project Structure

EcoBazaarX
│
├── src/
│   └── main/java/com/ecobazaarx/
│       ├── controller/
│       ├── model/
│       ├── repository/
│       ├── config/
│       └── jwt/
│
├── frontend/
│   ├── register.html
│   ├── login.html
│   └── dashboard.html
│
├── pom.xml
├── mvnw
└── README.md

---

## Prerequisites

Install the following software before running the project:

* Java 17 or higher
* MySQL Server
* Maven (or use included mvnw)
* Git
* VS Code (recommended)

---

## Database Setup

Open MySQL and run:

CREATE DATABASE ecobazaarx;

Then update database credentials in:

src/main/resources/application.properties

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/ecobazaarx
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

---

## How to Run the Backend

Step 1: Open terminal in project folder

cd EcoBazaarX

Step 2: Run Spring Boot application

Windows:

mvnw spring-boot:run

OR

./mvnw spring-boot:run

Step 3: Backend will start at:

http://localhost:8080

---

## How to Run the Frontend

Step 1: Open project folder

EcoBazaarX/frontend/

Step 2: Open file in browser:

login.html

Step 3: Use the application:

* Register a new user
* Login with credentials
* Access dashboard

---

## API Endpoints

Authentication:

POST /api/auth/register
POST /api/auth/login
POST /api/auth/logout

Role Dashboards:

GET /api/user/dashboard
GET /api/admin/dashboard
GET /api/analyst/dashboard

---

## How Authentication Works

1. User registers and logs in
2. Server generates JWT token
3. Token stored in browser localStorage
4. Token sent in Authorization header
5. Server validates token before allowing access

---

## Milestone-1 Completion

This project successfully implements:

* Secure user authentication
* JWT authorization
* Role-based access control
* Spring Boot backend setup
* MySQL database integration
* Bootstrap frontend setup

---

## How Someone Can Run This Project

1. Clone repository:

git clone https://github.com/YOUR_USERNAME/REPOSITORY_NAME.git

2. Open project folder:

cd EcoBazaarX

3. Create MySQL database:

CREATE DATABASE ecobazaarx;

4. Configure database credentials in application.properties

5. Run backend:

mvnw spring-boot:run

6. Open frontend:

Open frontend/login.html in browser

7. Register and login to use the system.

---

## Author

Aman Kumar
Infosys Springboard Internship Project
EcoBazaarX – Carbon Footprint Aware Shopping Assistant

---

## Future Improvements

* Product management module
* Carbon footprint integration
* AI/ML recommendation system
* Analytics dashboard
