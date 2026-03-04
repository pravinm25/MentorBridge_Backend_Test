package com.example.bankapplication.service;

import com.example.bankapplication.entity.BankEntity;
import com.example.bankapplication.mapper.BankMapper;
import com.example.bankapplication.model.BankDto;
import com.example.bankapplication.repository.BankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository bankRepository;
    private final BankMapper bankMapper;

    public ResponseEntity<String> openAccount(BankDto bankDto){
        BankEntity bankEntity= bankMapper.dtoToEntity(bankDto);
        bankRepository.save(bankEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Account Created Successfully");
    }

    public ResponseEntity<List<BankDto>> getAllAccount() {
        List<BankEntity> bankEntity = bankRepository.findAll();

        List<BankDto> bankDtoList = bankEntity.stream()
                .map(account->bankMapper.entityToDto(account))
                .toList();
        return ResponseEntity.ok(bankDtoList);
    }


    public ResponseEntity<String> depositAmount(String accountNumber, Double amount) {
        BankEntity bankAccount = bankRepository
                .findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account Not Found"));
        if(amount<=0){
            return ResponseEntity.badRequest().body("Invalid Deposit Amount");
        }
        bankAccount.setAccountBalance(bankAccount.getAccountBalance()+amount);
        bankRepository.save(bankAccount);
        return ResponseEntity.ok("Amount Deposited Successfully");
    }

    public ResponseEntity<String> withdrawAmount(String accountNumber, Double amount) {
        BankEntity bankAccount = bankRepository
                .findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account Not Found"));
        if(amount<=0){
            return ResponseEntity.badRequest().body("Invalid withdraw Amount");
        }
        bankAccount.setAccountBalance(bankAccount.getAccountBalance()-amount);
        bankRepository.save(bankAccount);
        return ResponseEntity.ok("Amount withdrawal Successfully");
    }
}
