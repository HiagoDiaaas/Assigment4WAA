package com.example.assigment4.complexmapping;


import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String doctortype;
    private String firstname;
    private String lastname;
}

