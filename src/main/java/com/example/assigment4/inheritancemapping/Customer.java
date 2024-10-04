package com.example.assigment4.inheritancemapping;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders;
}
