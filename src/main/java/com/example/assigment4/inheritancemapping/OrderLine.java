package com.example.assigment4.inheritancemapping;


import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;
}

