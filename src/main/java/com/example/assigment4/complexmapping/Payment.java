package com.example.assigment4.complexmapping;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Data
public class Payment {
    @Id
    private Long id;
    private String paydate;
    private double amount;
}

