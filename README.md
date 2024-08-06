# Breathe Easy : Real Time Weather condition and air quality information

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)

## Introduction

Developed a web application using Java for the backend and JavaScript for the frontend to display real-time weather and air quality information, integrating Google Maps API and AirVisual API. 

## Features

- Real-Time Data Display: Shows up-to-date weather conditions and air quality information.
- Interactive Map: Utilizes Google Maps API to display locations with varying air quality levels and Allows users to search for specific locations and view their air quality index (AQI).
- API Integration: Seamless integration with AirVisual API for accurate and reliable air quality data and Weather data integration for comprehensive environmental monitoring.
- User: User login and registration system.


## Tech Stack

- Java with Spring Boot for backend services.
- Maven for build and dependency management.
- MySQL as the database.
- HTML, CSS, and JavaScript for the frontend.
- Node.js and npm for managing frontend dependencies.
- Microservices architecture, indicated by multiple service directories (e.g., identity-service, notification-service, utility-service).


## Installation

1. **Clone the Repository:**
   ```sh
    git clone https://github.com/khantaha2112/breathe-easy.git
2. **Backend Setup (Java):**
- Navigate to the backend directory (e.g. utility-service
-       cd utility-service
3. **Install the required Java dependencies using Maven:**
-      ./mvnw clean install
  4.  **Configure MySQL Database:**
-     CREATE DATABASE breathe_easy_db;

- Update the application.properties file (usually located in src/main/resources/ directory) with your MySQL database credentials:
-     spring.datasource.url=jdbc:mysql://localhost:3306/breathe_easy_db
-     spring.datasource.username=your_mysql_username
-     spring.datasource.password=your_mysql_password

5. **Run the Backend Application:**
- Start the Spring Boot application:
-     ./mvnw spring-boot:run
  6. **Frontend Setup (JavaScript):**
- Navigate to the frontend directory (if separate from the backend)
-      cd ../frontend
- Install the required npm packages
-      npm install
7. **Configure API Keys:**
- Create a .env file in the frontend directory and add your API keys for Google Maps and AirVisual:

8. **Run the Frontend Application:**
- Start the frontend development server:
-     npm start
