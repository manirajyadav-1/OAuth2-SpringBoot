# OAuth2 Authentication in Spring Boot

This project demonstrates how to integrate OAuth2 authentication in a Spring Boot application. It includes user authentication with OAuth2 providers like Google, GitHub, and more.

## Features
- OAuth2 authentication with third-party providers
- Secure API endpoints
- Spring Security integration
- Configuration-based setup

## Prerequisites
- Java 17 or later
- Maven 3+
- A registered OAuth2 client (Google, GitHub, etc.)

## Getting Started

### 1. Clone the repository
```sh
git clone https://github.com/your-username/your-repo.git](https://github.com/manirajyadav-1/OAuth2-SpringBoot.git
cd OAuth2-SpringBoot
```

### 2. Configure OAuth2 Credentials
Create an `application.properties` file in `src/main/resources/` and add your OAuth2 credentials:
```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_GOOGLE_CLIENT_ID
            client-secret: YOUR_GOOGLE_CLIENT_SECRET
          github:
            client-id: YOUR_GITHUB_CLIENT_ID
            client-secret: YOUR_GITHUB_CLIENT_SECRET
```

### 3. Build and Run
```sh
mvn clean install
mvn spring-boot:run
```


## Contributing
Feel free to submit issues or pull requests.


