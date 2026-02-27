package com.fiasco.Fridge.controller;

import com.fiasco.Fridge.model.Client;
import com.fiasco.Fridge.repository.ClientRepository;
import com.fiasco.Fridge.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @PostMapping
    public void create(@RequestBody Client client) {
        clientService.save(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }

     @PostMapping("/eat/{clientId}/{foodId}")
    public void eat(@PathVariable Long clientId, @PathVariable Long foodId) {
        clientService.eat(clientId, foodId);
    }


}
