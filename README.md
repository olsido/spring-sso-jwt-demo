# Spring SSO JWT Demo

This repository contains a demo project that demonstrates how to implement Single Sign-On (SSO) using JSON Web Tokens (JWT) between two Spring Boot applications.

## Overview

The project consists of two Spring Boot applications:
- **App1**: Handles user authentication with a username and password, generates a JWT token upon successful login, and provides a link to redirect to App2 with the JWT token.
- **App2**: Accepts the JWT token, verifies it, and establishes a session for the user without requiring re-authentication.

## Features

- Secure user authentication using Spring Security
- JWT token generation and verification
- Seamless SSO between two separate applications
- Example code for real-world applications

## Project Structure

- `app1/`: First Spring Boot application (App1) for user authentication and JWT token generation.
- `app2/`: Second Spring Boot application (App2) for JWT token verification and session establishment.

## Getting Started

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/spring-sso-jwt-demo.git
   cd spring-sso-jwt-demo
   
2. **Build and Run App1:**
- Navigate to the app1 directory.
- Build the project using Maven or Gradle.
- Run the application.

3. **Build and Run App2:**
- Navigate to the app2 directory.
- Build the project using Maven or Gradle.
- Run the application.

4. **Testing the SSO:**
- Open your browser and navigate to App1.
- Log in with the provided credentials.
- Click the link to navigate to App2.
- You should be logged in to App2 without re-entering your credentials.

## License

This project is licensed under the MIT License.

## Contributing

Feel free to fork this repository and contribute by submitting pull requests. For major changes, please open an issue first to discuss what you would like to change.

## Contact

For any questions or feedback, please contact [Olga Strijewski] at [olsido@gmail.com].
