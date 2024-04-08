package com.mamani.application.service;

import com.mamani.application.ports.input.ExchangeRateByCodeUseCase;
import com.mamani.domain.model.dto.request.ExchangeRateRequest;
import com.mamani.domain.model.dto.response.ExchangeRateResponse;
import com.mamani.infrastructure.input.openfeign.client.ExchangeRateFeignClient;
import com.mamani.infrastructure.input.openfeign.dto.ExchangeRateFeignResponse;
import com.mamani.infrastructure.output.persistence.adapter.ExchangeRateRecordPersistenceAdapter;
import com.mamani.infrastructure.output.persistence.mapper.ExchangeRateRecordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ExchangeRateByCodeService implements ExchangeRateByCodeUseCase {

    private final ExchangeRateFeignClient exchangeRateFeignClient;
    private final ExchangeRateRecordPersistenceAdapter exchangeRateRecordPersistenceAdapter;

    @Override
    public ExchangeRateResponse processChangeRateByCode(ExchangeRateRequest request) {

        ExchangeRateFeignResponse feignResponse = exchangeRateFeignClient.getExchangesCodesAndValues(request.getSourceCurrency());
        BigDecimal currencyRateExchange = feignResponse.getRates().get(request.getDestinationCurrency());
        BigDecimal conversionResult = request.getAmount().multiply(currencyRateExchange);

        ExchangeRateResponse modelResponse = ExchangeRateResponse.builder()
                .amount(request.getAmount())
                .amountWithExchangeRate(conversionResult)
                .sourceCurrency(request.getSourceCurrency())
                .destinationCurrency(request.getDestinationCurrency())
                .exchangeRate(currencyRateExchange)
                .build();

        exchangeRateRecordPersistenceAdapter.save(ExchangeRateRecordMapper.toExchangeRateRecord(modelResponse));

        return modelResponse;
    }
}
