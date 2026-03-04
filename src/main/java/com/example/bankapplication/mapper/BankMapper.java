package com.example.bankapplication.mapper;

import com.example.bankapplication.entity.BankEntity;
import com.example.bankapplication.model.BankDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BankMapper {

    private final ModelMapper modelMapper;

    public BankEntity dtoToEntity(BankDto bankDto){
        return modelMapper.map(bankDto, BankEntity.class);
    }

    public BankDto entityToDto(BankEntity bankEntity){
        return modelMapper.map(bankEntity, BankDto.class);
    }
}
