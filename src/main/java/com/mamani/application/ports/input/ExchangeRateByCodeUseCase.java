package com.mamani.application.ports.input;

import com.mamani.domain.model.dto.request.ExchangeRateRequest;
import com.mamani.domain.model.dto.response.ExchangeRateResponse;

public interface ExchangeRateByCodeUseCase {
    ExchangeRateResponse processChangeRateByCode(ExchangeRateRequest request);
}
