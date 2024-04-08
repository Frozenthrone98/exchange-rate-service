package com.mamani.application.ports.output;

import com.mamani.domain.model.ExchangeRateRecord;

import java.util.List;

public interface ExchangeRateRecordPersistencePort {
    List<ExchangeRateRecord> findAll();
    ExchangeRateRecord save(ExchangeRateRecord exchangeRateRecord);
}
