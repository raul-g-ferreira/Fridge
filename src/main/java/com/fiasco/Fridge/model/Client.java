package com.fiasco.Fridge.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client_tb")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private Integer foodAte;

    public Client() {
    }

    public void eating() {
        this.setFoodAte(this.getFoodAte() + 1);
    }

}
