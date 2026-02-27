package com.fiasco.Fridge.service;

import com.fiasco.Fridge.model.Client;
import com.fiasco.Fridge.model.Food;
import com.fiasco.Fridge.repository.ClientRepository;
import com.fiasco.Fridge.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {


    private final FoodRepository foodRepository;

    private final ClientRepository clientRepository;

    public ClientService(FoodRepository foodRepository, ClientRepository clientRepository) {
        this.foodRepository = foodRepository;
        this.clientRepository = clientRepository;
    }


    public void eat(Long clientId, Long foodId) {
        foodRepository.deleteById(foodId);
        Client client = clientRepository.findById(clientId).orElseThrow(() -> new RuntimeException("Client not found"));
        client.eating();
        clientRepository.save(client);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
