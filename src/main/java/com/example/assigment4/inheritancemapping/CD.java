package com.example.assigment4.inheritancemapping;

import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class CD extends Product {
    private String artist;
}

