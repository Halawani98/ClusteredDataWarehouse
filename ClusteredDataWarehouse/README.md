# ClusteredDataWarehouse

## Overview
ClusteredDataWarehouse is a Spring-based project that aims to provide a scalable and efficient data warehousing solution for managing and analyzing large volumes of clustered data. It leverages the power of Spring Boot and related frameworks to create a robust and flexible platform for storing, processing, and retrieving data.
## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Gradle build tool
- MySQL database

## Installation
1. Clone the project repository: `git clone <https://github.com/Halawani98/ClusteredDataWarehouse.git>`
2. Build the project: `gradle build`
3. Configure the database connection in the `application.properties` file.
4. Start the application: `gradle bootRun`

## Configuration
- Database configuration: Modify the `application.properties` file to set the database URL, username (root), and password (7114).

## Project Structure
- `src/main/java`: Contains the Java source code.
- `src/main/resources`: Contains the configuration files and static resources.

## Usage
- To run the application, execute the following command: `gradle bootRun`
- Access the application at: `http://localhost:8080`

## Features and Functionality
1. Persist Transaction data into DB

## Troubleshooting
- If you encounter database connection issues, make sure the MySQL server is running and the credentials are correct.

## Testing
- To run the tests, execute the following command: `gradle test`

