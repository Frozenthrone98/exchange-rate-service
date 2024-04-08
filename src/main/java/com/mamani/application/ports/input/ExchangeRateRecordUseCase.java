package com.mamani.application.ports.input;

import com.mamani.domain.model.ExchangeRateRecord;

import java.util.List;

public interface ExchangeRateRecordUseCase {
    List<ExchangeRateRecord> findAll();
    ExchangeRateRecord save(ExchangeRateRecord exchangeRateRecord);
}
