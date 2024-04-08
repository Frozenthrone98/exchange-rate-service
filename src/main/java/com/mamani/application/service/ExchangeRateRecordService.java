package com.mamani.application.service;

import com.mamani.application.ports.input.ExchangeRateRecordUseCase;
import com.mamani.application.ports.output.ExchangeRateRecordPersistencePort;
import com.mamani.domain.model.ExchangeRateRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExchangeRateRecordService implements ExchangeRateRecordUseCase {

    private final ExchangeRateRecordPersistencePort persistencePort;

    @Override
    public List<ExchangeRateRecord> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public ExchangeRateRecord save(ExchangeRateRecord exchangeRateRecord) {
        return persistencePort.save(exchangeRateRecord);
    }
}
