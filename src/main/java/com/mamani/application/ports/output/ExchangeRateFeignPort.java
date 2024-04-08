package com.mamani.application.ports.output;

import com.mamani.infrastructure.input.openfeign.dto.ExchangeRateFeignResponse;

public interface ExchangeRateFeignPort {
    ExchangeRateFeignResponse getExchangesCodesAndValues(String code);
}
