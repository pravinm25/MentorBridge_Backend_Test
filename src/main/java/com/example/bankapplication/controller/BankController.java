package com.example.bankapplication.controller;

import com.example.bankapplication.api.BankAccountApi;
import com.example.bankapplication.model.BankDto;
import com.example.bankapplication.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bankdetails")
public class BankController implements BankAccountApi {

    private final BankService bankService;


    @Override
    public ResponseEntity<String> depositAmount(String accountNumber,@RequestParam Double amount) {
        return bankService.depositAmount(accountNumber, amount);
    }

    @Override
    public ResponseEntity<List<BankDto>> getAllAccount() {
        return bankService.getAllAccount();
    }

    @Override
    public ResponseEntity<String> openAccount(BankDto bankDto) {
        return bankService.openAccount(bankDto);
    }

    @Override
    public ResponseEntity<String> withdrawAmount(String accountNumber,@RequestParam Double amount) {
        return bankService.withdrawAmount(accountNumber, amount);
    }

}
