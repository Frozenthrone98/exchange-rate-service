package com.mamani.infrastructure.input.rest.adapter;

import com.mamani.application.ports.input.ExchangeRateByCodeUseCase;
import com.mamani.application.ports.input.ExchangeRateRecordUseCase;
import com.mamani.application.ports.output.ExchangeRateByCodeRestPort;
import com.mamani.domain.model.dto.request.ExchangeRateRequest;
import com.mamani.domain.model.dto.response.ExchangeRateResponse;
import com.mamani.infrastructure.input.rest.mapper.ExchangeRateByCodeRestMapper;
import com.mamani.infrastructure.input.rest.model.request.ExchangeRateByCodeRequest;
import com.mamani.infrastructure.input.rest.model.response.ExchangeRateByCodeResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/exchange-rate")
@RequiredArgsConstructor
public class ExchangeRateByCodeRestAdapter implements ExchangeRateByCodeRestPort {

    private final ExchangeRateByCodeUseCase exchangeRateByCodeUseCase;

    @PostMapping(value = "/by-code")
    @Override
    public ResponseEntity<ExchangeRateByCodeResponse> processChangeRateByCode(@Valid @RequestBody ExchangeRateByCodeRequest request) {

        ExchangeRateRequest model = ExchangeRateByCodeRestMapper.toExchangeRateRequest(request);
        ExchangeRateResponse response = exchangeRateByCodeUseCase.processChangeRateByCode(model);
        ExchangeRateByCodeResponse rateByCodeResponse = ExchangeRateByCodeRestMapper.toExchangeRateByCodeResponse(response);

        return ResponseEntity.ok(rateByCodeResponse);
    }
}
