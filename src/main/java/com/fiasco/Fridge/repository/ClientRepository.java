package com.fiasco.Fridge.repository;


import com.fiasco.Fridge.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
