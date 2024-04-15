package com.dionissa.desafiobackendjr;

import com.dionissa.desafiobackendjr.core.Client;
import com.dionissa.desafiobackendjr.core.Car;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.web.client.RestTemplate;

@Route("client-list")
public class ClientListView extends VerticalLayout {

    private Grid<Client> clientGrid = new Grid<>(Client.class);
    private Grid<Car> carGrid = new Grid<>(Car.class);

    public ClientListView() {
        // Fetch client data from the API
        RestTemplate restTemplate = new RestTemplate();
        Client[] clients = restTemplate.getForObject("http://localhost:8080/api/clients", Client[].class);

        // Fetch car data from the API
        Car[] cars = restTemplate.getForObject("http://localhost:8080/cars", Car[].class);

        // Set up the clientGrid to display client data
        clientGrid.setItems(clients);
        clientGrid.setColumns("id", "name", "cpf", "birthDate");

        // Set up the carGrid to display car data
        carGrid.setItems(cars);
        carGrid.setColumns("id", "model", "brand");

        // Add the grids to the layout
        add(clientGrid, carGrid);
    }
}
