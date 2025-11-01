# Employee Management System

A full-stack CRUD web application for managing employee records, built with Spring Boot and Thymeleaf.

## 📋 Overview

This application provides a simple and intuitive interface to manage employee information. It demonstrates core Spring Boot concepts including MVC architecture, JPA/Hibernate integration, and RESTful API design.

## ✨ Features

- **List Employees** - View all employees in a clean, organized table
- **Add Employee** - Create new employee records with form validation
- **Update Employee** - Edit existing employee information
- **Delete Employee** - Remove employee records from the system
- **RESTful API** - Full CRUD API endpoints for programmatic access

## 🛠️ Technologies Used

- **Backend Framework:** Spring Boot 3.3.0
- **Template Engine:** Thymeleaf
- **ORM:** Spring Data JPA (Hibernate)
- **Database:** MySQL 8.3
- **Build Tool:** Maven
- **Java Version:** Java 17
- **Database Migration:** Flyway

## 📊 Database Schema

### Employee Table
| Column      | Type         | Description           |
|-------------|-------------|-----------------------|
| id          | BIGINT (PK) | Auto-generated ID     |
| first_name  | VARCHAR     | Employee's first name |
| last_name   | VARCHAR     | Employee's last name  |
| email       | VARCHAR     | Employee's email      |

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+
- (Optional) Docker for running MySQL

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/employee-management-system.git
   cd employee-management-system
   ```


2. **Build and Run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. **Access the Application**

   Open your browser and navigate to: `http://localhost:8081`

### Docker Setup (Optional)

Run MySQL using Docker:
```bash
docker run --name mysql-employee -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=employee_directory -p 3306:3306 -d mysql:8.3
```

## 🔗 API Endpoints

| Method | Endpoint              | Description          |
|--------|-----------------------|----------------------|
| GET    | `/api/employees`      | Get all employees    |
| GET    | `/api/employees/{id}` | Get employee by ID   |
| POST   | `/api/employees`      | Create new employee  |
| PUT    | `/api/employees`      | Update employee      |
| DELETE | `/api/employees/{id}` | Delete employee      |

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/aizen/springboot/cruddemo/
│   │       ├── controller/      # MVC Controllers
│   │       ├── entity/          # JPA Entities
│   │       ├── repository/      # Spring Data Repositories
│   │       ├── service/         # Business Logic Layer
│   │       └── CruddemoApplication.java
│   └── resources/
│       ├── templates/           # Thymeleaf Templates
│       ├── static/              # CSS, JS, Images
│       ├── db/migration/        # Flyway SQL Scripts
│       └── application.properties
└── test/
```

## 🧪 Running Tests

```bash
mvn test
```

## 📝 Configuration

Key configuration properties in `application.properties`:

```properties
# Server Port
server.port=8081

# Database Configuration
sspring.datasource.password=root
spring.datasource.url=jdbc:mysql://localhost:3308/employee_directory
spring.datasource.username=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=none
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Mohammed Tamer**
- GitHub: [@ma7amed123x](https://github.com/ma7amed123x)
- LinkedIn: [mohammed-tamer](https://www.linkedin.com/in/mohammed-tamer-a5a61a28a/)

## 🙏 Acknowledgments

- Spring Boot Documentation
- Spring Data JPA
- Thymeleaf Documentation

---

⭐ Star this repo if you find it helpful!