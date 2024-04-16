package com.dionissa.desafiobackendjr;

import com.dionissa.desafiobackendjr.core.Client;
import com.dionissa.desafiobackendjr.core.Car;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Route("client-list")
public class ClientListView extends VerticalLayout {

    private Grid<Client> clientGrid = new Grid<>(Client.class);
    private Grid<Car> carGrid = new Grid<>(Car.class);

    private final RestTemplate restTemplate;

    @Autowired
    public ClientListView(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

        // Fetch client data from the API
        Client[] clients = restTemplate.getForObject("http://localhost:8080/api/clients", Client[].class);

        // Fetch car data from the API
        Car[] cars = restTemplate.getForObject("http://localhost:8080/cars", Car[].class);

        // Set up the clientGrid to display client data
        clientGrid.setItems(clients);
        clientGrid.setColumns("id", "name", "cpf", "birthDate", "car");

        // Set up the carGrid to display car data
        carGrid.setItems(cars);
        carGrid.setColumns("id", "model", "brand");

        // Add buttons for CRUD operations
        Button addButton = new Button("Add Client");
        addButton.addClickListener(e -> {
            // Logic to open a form for adding a new client
        });

        Button editButton = new Button("Edit Client");
        editButton.addClickListener(e -> {
            // Logic to open a form for editing a client
        });

        Button deleteButton = new Button("Delete Client");
        deleteButton.addClickListener(e -> {
            // Logic to delete a client
        });

        // Add the grids and buttons to the layout
        add(addButton, editButton, deleteButton, clientGrid, carGrid);
    }
}
