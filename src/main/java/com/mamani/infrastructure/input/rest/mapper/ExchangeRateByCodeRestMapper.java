package com.mamani.infrastructure.input.rest.mapper;

import com.mamani.domain.model.dto.request.ExchangeRateRequest;
import com.mamani.domain.model.dto.response.ExchangeRateResponse;
import com.mamani.infrastructure.input.rest.model.request.ExchangeRateByCodeRequest;
import com.mamani.infrastructure.input.rest.model.response.ExchangeRateByCodeResponse;

public class ExchangeRateByCodeRestMapper {

    public static ExchangeRateRequest toExchangeRateRequest(ExchangeRateByCodeRequest request){
        return ExchangeRateRequest.builder()
                .amount(request.getAmount())
                .sourceCurrency(request.getSourceCurrency())
                .destinationCurrency(request.getDestinationCurrency())
                .build();
    }

    public static ExchangeRateByCodeResponse toExchangeRateByCodeResponse(ExchangeRateResponse response){
        return ExchangeRateByCodeResponse.builder()
                .amount(response.getAmount())
                .amountWithExchangeRate(response.getAmountWithExchangeRate())
                .sourceCurrency(response.getSourceCurrency())
                .destinationCurrency(response.getDestinationCurrency())
                .exchangeRate(response.getExchangeRate())
                .build();
    }
}
