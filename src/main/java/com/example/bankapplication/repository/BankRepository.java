package com.example.bankapplication.repository;

import com.example.bankapplication.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<BankEntity,String> {
    Optional<BankEntity> findByAccountNumber(String accountNumber);
}
