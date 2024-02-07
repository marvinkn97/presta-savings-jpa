package dev.marvin.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="t_customer")
public class Customer {
    private Integer customerId;
    private String customerName;

}
