![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

# Backend Jr Challenge

This is a Java application that allows you to manage clients and cars.

## Getting Started

To get started with this application, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Build the project using Maven (mvn clean install).
4. Run the application (java -jar your-application.jar).

## Creating a Client (POST Method)

To create a client using JSON data, you can send a POST request to the server with the client information in the request body. Here's an example of JSON data for creating a client:

```json
// the default address using a local database is: http://localhost:8080/clients

{
  "name": "John Doe",
  "cpf": "12345678920",
  // You can leave the car argument blank, and add a car later for this client
  "birthDate": "1990-12-12"
}
```

## Creating a Car (POST Method)

To create a car associated with a client, you can send a POST request with the car information and the client's ID in the request body. Here's an example of JSON data for creating a car:

```json
// the default address using a local database is: http://localhost:8080/cars
{
  "model": "Kombi",
  "brand": "Ford"
}
```

## Deleting a Car (DELETE Method)

To delete a car that is not associated with a client, you can send a DELETE request with the car information in the adress directly.

```json
  http://localhost:8080/cars/{carID}
```

## Deleting a Client (DELETE Method)

To delete a client that is not associated with a car, you can send a DELETE request with the client information in the request body. Here's an example of JSON data for deleting a client:

```json
  http://localhost:8080/clients/{clientID}
```

## Adding a existing car to an existing client (PATCH Method)

To add or update a existing car to an existing user, simple use the PATCH method with the followings arguments in the adress:

```json
// The client id that you want to add the car and the car ID of the car that you want to add to the client
  http://localhost:8080/clients/{clientID}/cars/{carID}
```
