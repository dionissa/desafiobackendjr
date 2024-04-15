package com.dionissa.desafiobackendjr.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dionissa.desafiobackendjr.core.Car;
import com.dionissa.desafiobackendjr.core.Client;
import com.dionissa.desafiobackendjr.repository.CarRepository;
import com.dionissa.desafiobackendjr.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CarRepository carRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public Client updateClient(Long id, Client updatedClient) {
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            client.setNome(updatedClient.getNome());
            client.setCpf(updatedClient.getCpf());
            client.setCarro(updatedClient.getCarro());
            client.setDataNascimento(updatedClient.getDataNascimento());
            client.setCreatedAt(updatedClient.getCreatedAt());
            client.setUpdatedAt(updatedClient.getUpdatedAt());
            return clientRepository.save(client);
        }
        return null;
    }

    public void createClientWithExistingCar(String nome, String cpf, Long carId, Date dataNascimento) {
        Car car = carRepository.findById(carId).orElseThrow(() -> new RuntimeException("Car not found"));

        Client client = new Client();
        client.setNome(nome);
        client.setCpf(cpf);
        client.setCarro(car);
        client.setDataNascimento(dataNascimento);
        client.setCreatedAt(new Date());
        client.setUpdatedAt(new Date());

        clientRepository.save(client);
    }
}
