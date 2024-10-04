package com.example.assigment4.inheritancemapping;


import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class DVD extends Product {
    private String genre;
}

