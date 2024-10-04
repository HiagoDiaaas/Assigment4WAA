package com.example.assigment4.inheritancemapping;



import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "`Order`")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderid;
    private Date date;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private Set<OrderLine> orderLines;
}

