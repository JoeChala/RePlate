# RePlate Development Setup

This guide explains how to set up RePlate for local development.

## Prerequisites

Install the following:

- Git
- Java 21
- Docker
- Docker Compose

### Verify Java

```bash
java -version
javac --version
```
RePlate currently uses Java 21.

### Verify Docker
```bash
docker --version
docker compose version
```

## Clone Repo
```bash
git clone https://github.com/JoeChala/RePlate.git
cd RePlate
```

## Start MongoDB
RePlate uses MongoDB for application data.

MongoDB is provided through Docker Compose.
```bash
docker compose up -d
```
Verify that the container is running using
```bash
docker compose ps
```
MongoDB is exposed locally on: http://localhost:27018

## Start the Spring Boot backend
In a terminal 
```bash
cd backend
```
### Linux
```bash
./mvnw spring-boot:run
```
### Windows
```bash
.\mvnw.cmd spring-boot:run
```

The backend runs on: http://localhost:8080

## Verify the backend
Test health endpoints
```bash
curl http://localhost:8080/api/v1/health
```
Expected response is: **RePlate backend is running**

## Running tests

From the backend directory:

### Linux
```bash
./mvnw clean verify
```
### Windows
```bash
.\mvnw.cmd clean verify
```
All tests should pass before pushing changes.

## Stopping MongoDB

From the database directory:
```bash
docker compose down
```
This stops and removes the container but preserves the MongoDB volume.

To remove the database data as well:
```bash
docker compose down -v
```