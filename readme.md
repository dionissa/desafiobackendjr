# Backend Jr Challenge

This is a Java application that allows you to manage clients and cars.

## Getting Started

To get started with this application, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Build the project using Maven.
4. Run the application.

## Adding a New Client

To add a new client, follow these steps:

1. Open the `ClientController` class.
2. Create a new instance of the `Client` class with the required fields (name, email, and phone).
3. Call the `createClient` method in the `ClientController` class and pass the `Client` instance as a parameter.

Here's an example Java code:

```java
Client newClient = new Client("John Doe", "john.doe@example.com", "555-555-5555");
ClientController.createClient(newClient);
```

## Adding a Car

To add a new car, follow these steps:

1. Open the `CarController` class.
2. Create a new instance of the `Car` class with the required fields (make, model, and year).
3. Set the `Client` instance for the car using the `setClient` method.
4. Call the `createCar` method in the `CarController` class and pass the `Car` instance as a parameter.

Here's an example Java code:

```java
Client client = new Client("John Doe", "john.doe@example.com", "555-555-5555");
Car newCar = new Car("Toyota", "Corolla", 2020);
newCar.setClient(client);
CarController.createCar(newCar);
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

## Deleting a Client

To delete a client, follow these steps:

1. Open the `ClientController` class.
2. Call the `deleteClient` method in the `ClientController` class and pass the `Client` instance as a parameter.

Here's an example Java code:

```java
Client clientToDelete = // get the Client instance to delete
ClientController.deleteClient(clientToDelete);
```
