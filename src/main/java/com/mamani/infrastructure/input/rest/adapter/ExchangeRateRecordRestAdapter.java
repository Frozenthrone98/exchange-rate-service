package com.mamani.infrastructure.input.rest.adapter;

import com.mamani.application.ports.input.ExchangeRateRecordUseCase;
import com.mamani.infrastructure.input.rest.mapper.ExchangeRateRecordRestMapper;
import com.mamani.infrastructure.input.rest.model.response.ExchangeRateRecordResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/exchange-records")
@RequiredArgsConstructor
public class ExchangeRateRecordRestAdapter {

    private final ExchangeRateRecordUseCase exchangeRateRecordUseCase;

    @GetMapping
    public ResponseEntity<List<ExchangeRateRecordResponse>> getAllExchangeRateRecords(){
        return ResponseEntity.ok(
            exchangeRateRecordUseCase.findAll().stream()
                .map(ExchangeRateRecordRestMapper::toExchangeRateRecordResponse)
                .toList());
    }

}
