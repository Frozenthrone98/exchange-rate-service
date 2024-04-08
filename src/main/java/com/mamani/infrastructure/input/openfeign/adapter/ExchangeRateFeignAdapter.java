package com.mamani.infrastructure.input.openfeign.adapter;

import com.mamani.application.ports.output.ExchangeRateFeignPort;
import com.mamani.infrastructure.input.openfeign.client.ExchangeRateFeignClient;
import com.mamani.infrastructure.input.openfeign.dto.ExchangeRateFeignResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExchangeRateFeignAdapter implements ExchangeRateFeignPort {

    private final ExchangeRateFeignClient exchangeRateFeignClient;

    @Override
    public ExchangeRateFeignResponse getExchangesCodesAndValues(String code) {
        return exchangeRateFeignClient.getExchangesCodesAndValues(code);
    }
}
