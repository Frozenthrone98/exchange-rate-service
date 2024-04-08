package com.mamani.infrastructure.output.persistence.mapper;

import com.mamani.domain.model.ExchangeRateRecord;
import com.mamani.domain.model.dto.response.ExchangeRateResponse;
import com.mamani.infrastructure.output.persistence.entity.ExchangeRateRecordEntity;

import java.time.LocalDateTime;

public class ExchangeRateRecordMapper {
    public static ExchangeRateRecordEntity toExchangeRateRecordEntity(ExchangeRateRecord model){
        return ExchangeRateRecordEntity.builder()
                .amount(model.getAmount())
                .amountWithExchangeRate(model.getAmountWithExchangeRate())
                .sourceCurrency(model.getSourceCurrency())
                .destinationCurrency(model.getDestinationCurrency())
                .exchangeRate(model.getExchangeRate())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static ExchangeRateRecord toExchangeRateRecord(ExchangeRateRecordEntity entity){
        return ExchangeRateRecord.builder()
                .id(entity.getId())
                .amount(entity.getAmount())
                .amountWithExchangeRate(entity.getAmountWithExchangeRate())
                .sourceCurrency(entity.getSourceCurrency())
                .destinationCurrency(entity.getDestinationCurrency())
                .exchangeRate(entity.getExchangeRate())
                .createdAt(entity.getCreatedAt())
                .build();
    }

    public static ExchangeRateRecord toExchangeRateRecord(ExchangeRateResponse response){
        return ExchangeRateRecord.builder()
                .amount(response.getAmount())
                .amountWithExchangeRate(response.getAmountWithExchangeRate())
                .sourceCurrency(response.getSourceCurrency())
                .destinationCurrency(response.getDestinationCurrency())
                .exchangeRate(response.getExchangeRate())
                .build();
    }
}
