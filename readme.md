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
{
  "name": "John Doe",
  "cpf": "12345678920",
  "car": "",
  "birthDate": "",
  "createdAt": "",
  "updatedAt": ""
}
```

## Creating a Car (POST Method)

To create a car associated with a client, you can send a POST request with the car information and the client's ID in the request body. Here's an example of JSON data for creating a car:

```json
{
  "model": "Kombi",
  "brand": "Ford",
  "createdDate": "2024-04-15T10:00:00"
}
```

## Deleting a Car

To delete a car, follow these steps:

1. Open the `CarController` class.
2. Call the `deleteCar` method in the `CarController` class and pass the `Car` instance as a parameter.

Here's an example Java code:

```java
Car carToDelete = // get the Car instance to delete
CarController.deleteCar(carToDelete);
```

In this JSON data, clientId refers to the ID of the client to whom the car belongs. You would use the POST method to send this JSON data to the server endpoint responsible for creating cars.

## Deleting a Client

To delete a client, follow these steps:

1. Open the `ClientController` class.
2. Call the `deleteClient` method in the `ClientController` class and pass the `Client` instance as a parameter.

Deleting a Car (DELETE Method)
To delete a car, you would send a DELETE request to the server with the car's ID as a parameter. Here's an example of how you would send a DELETE request to delete a car:

```json
DELETE /clients/1
```

In this example, 1 is the ID of the client you want to delete.
By implementing these endpoints in your Java application and handling the corresponding HTTP methods (POST, DELETE), you can achieve the functionality of creating and deleting clients and cars using JSON data.
