package com.mamani.infrastructure.input.rest.mapper;

import com.mamani.domain.model.ExchangeRateRecord;
import com.mamani.infrastructure.input.rest.model.response.ExchangeRateRecordResponse;

public class ExchangeRateRecordRestMapper {

    public static ExchangeRateRecordResponse toExchangeRateRecordResponse(ExchangeRateRecord model){
        return ExchangeRateRecordResponse.builder()
                .id(model.getId())
                .amount(model.getAmount())
                .amountWithExchangeRate(model.getAmountWithExchangeRate())
                .sourceCurrency(model.getSourceCurrency())
                .destinationCurrency(model.getDestinationCurrency())
                .exchangeRate(model.getExchangeRate())
                .createdAt(model.getCreatedAt())
                .build();
    }

}
