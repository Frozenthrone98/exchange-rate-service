package com.mamani.infrastructure.output.persistence.adapter;

import com.mamani.application.ports.output.ExchangeRateRecordPersistencePort;
import com.mamani.domain.model.ExchangeRateRecord;
import com.mamani.infrastructure.output.persistence.mapper.ExchangeRateRecordMapper;
import com.mamani.infrastructure.output.persistence.repository.JpaExchangeRateRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ExchangeRateRecordPersistenceAdapter implements ExchangeRateRecordPersistencePort {

    private final JpaExchangeRateRecordRepository jpaExchangeRateRecordRepository;
    @Override
    public List<ExchangeRateRecord> findAll() {
        return jpaExchangeRateRecordRepository.findAll().stream()
                .map(ExchangeRateRecordMapper::toExchangeRateRecord)
                .toList();
    }

    @Override
    public ExchangeRateRecord save(ExchangeRateRecord exchangeRateRecord) {
        return ExchangeRateRecordMapper.toExchangeRateRecord(
                jpaExchangeRateRecordRepository.save(ExchangeRateRecordMapper.toExchangeRateRecordEntity(exchangeRateRecord)));
    }
}
