package com.example.assigment4.complexmapping;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String zip;
    private String city;
}

