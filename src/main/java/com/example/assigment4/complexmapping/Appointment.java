package com.example.assigment4.complexmapping;



import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date appdate;
    private Date paydate;
    private double amount;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    @OneToOne
    private Payment payment;
}

