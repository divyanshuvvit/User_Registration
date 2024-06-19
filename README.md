# Spring Boot User Registration

This is a Spring Boot application for user registration and fetching user details.

## Requirements

- Java 11 or later
- Maven

## Running the Application
1. Open the Terminal in VS Code
First, ensure you have the integrated terminal open in VS Code:

You can open the terminal by selecting View > Terminal from the top menu, or by pressing Ctrl+` (Control + backtick).
2. Navigate to the Project Directory
Make sure your terminal is pointing to the root directory of your Spring Boot project. If you just opened the terminal, it should already be in the project root. You should see files like pom.xml, src/, mvnw, and mvnw.cmd in the directory listing.

If not, you can navigate to the project directory using the cd command. For example:
cd path/to/your/project

Replace path/to/your/project with the actual path to your Spring Boot project directory.

3. Run the Application using Maven Wrapper
Spring Boot projects generated from Spring Initializr include Maven Wrapper scripts (mvnw and mvnw.cmd). These scripts allow you to run Maven commands without needing to have Maven installed globally on your machine.

To run the application, use the following command in your terminal:

On Unix-based systems (Linux, macOS):
./mvnw spring-boot:run

On Windows:
mvnw.cmd spring-boot:run

## Testing the Endpoints
Once the application is running, you can test the endpoints.

Using Postman
Postman is a popular tool for testing REST APIs.

Register a User:

Open Postman and create a new POST request.
Set the URL to http://localhost:8080/api/user/register.
In the Body tab, select raw and set the type to JSON.
Enter the following JSON data:
{
  "username": "testuser",
  "email": "testuser@example.com",
  "password": "password"
}

Click Send. You should receive a response indicating whether the user registration was successful.

Fetch a User:

Create a new GET request.
Set the URL to http://localhost:8080/api/user/fetch?username=testuser.
Click Send. You should receive a response with the user's details if the user exists.
Using curl
curl is a command-line tool for making HTTP requests. Here are the equivalent curl commands for testing the endpoints:

1.Register a User:
curl -X POST http://localhost:8080/api/user/register -H "Content-Type: application/json" -d '{"username":"testuser", "email":"testuser@example.com", "password":"password"}'

2.Fetch a User:
curl http://localhost:8080/api/user/fetch?username=testuser

## Summary
To summarize:

Open the terminal in VS Code.

Ensure you are in the root directory of your project.

Use the Maven Wrapper to run your Spring Boot application with ./mvnw spring-boot:run or mvnw.cmd spring-boot:run on Windows.

Test your API endpoints using tools like Postman or curl.

This process will allow you to see your Spring Boot application in action and verify that the endpoints are functioning as expected.


