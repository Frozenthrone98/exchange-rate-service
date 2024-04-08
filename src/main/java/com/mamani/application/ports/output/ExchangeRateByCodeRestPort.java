package com.mamani.application.ports.output;

import com.mamani.infrastructure.input.rest.model.request.ExchangeRateByCodeRequest;
import com.mamani.infrastructure.input.rest.model.response.ExchangeRateByCodeResponse;
import org.springframework.http.ResponseEntity;

public interface ExchangeRateByCodeRestPort {
    ResponseEntity<ExchangeRateByCodeResponse> processChangeRateByCode(ExchangeRateByCodeRequest request);
}
