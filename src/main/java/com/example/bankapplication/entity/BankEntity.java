package com.example.bankapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="banktable")
public class BankEntity {
    @Id
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
}
