package com.example.assigment4.inheritancemapping;


import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class Book extends Product {
    private String title;
}

