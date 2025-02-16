# Banking-Application

## Project Overview
The **Banking-Application** is a full-stack web application designed to manage user bank accounts. The application allows users to create bank accounts and manage them efficiently. It follows a **microservices architecture**, where the **Spring Boot backend** handles the business logic and **React frontend** provides an intuitive user interface.

## Technologies Used
### Backend (Spring Boot)
- **Spring Boot** – For building RESTful APIs
- **Spring Data JPA & Hibernate** – For database interactions
- **MySQL** – Relational database management system
- **Spring Security (optional)** – For authentication and security
- **Maven** – Dependency management
- **HikariCP** – Database connection pooling

### Frontend (React)
- **React.js** – UI framework for creating components
- **Axios** – HTTP client for making API requests
- **React Router** – For navigation between pages
- **Bootstrap / Tailwind CSS (if used)** – For styling

## Features
- User **account creation** with unique account numbers
- RESTful API endpoints for **CRUD operations**
- **User authentication & validation**
- Frontend UI to **view and manage accounts**
- **Database persistence** using MySQL
- **Spring Boot & React integration** for seamless communication

## Setup Instructions
1. **Clone the repository** to your local machine.
2. **Setup MySQL Database** and update `application.properties` with correct credentials.
3. **Run the Backend** using Spring Boot.
4. **Run the Frontend** using React.
5. Access the application in the browser.

## API Endpoints
### User Management
- `POST /api/user/create-account` – Creates a new bank account
- `GET /api/user/all-users` – Fetches all users

### Common Issues & Solutions
#### 1. **CORS Policy Error**
   - The frontend cannot access backend APIs due to security restrictions.
   - **Solution:** Enable CORS in Spring Boot (`@CrossOrigin` annotation).

#### 2. **Database Connection Fails**
   - Backend cannot connect to MySQL.
   - **Solution:** Check database credentials in `application.properties`.

#### 3. **Frontend Not Connecting to Backend**
   - Network issues between React and Spring Boot.
   - **Solution:** Ensure both servers are running on `localhost` with correct ports.

## Expected Output
Once set up correctly:
- Users should be able to create bank accounts.
- The frontend should display account details.
- The backend should handle API requests efficiently.

## Contributing
Contributions are welcome! Feel free to **fork the repository**, create a new branch, and submit a **pull request**.

---
### Author:  
**Pauravi Nagarkar**  
📍 **Location:** Seattle, WA  
🚀 **Tech Stack:** Java | Spring Boot | React.js | PostgreSQL | AWS  
