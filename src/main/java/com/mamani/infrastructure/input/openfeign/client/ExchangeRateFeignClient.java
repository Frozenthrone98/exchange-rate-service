package com.mamani.infrastructure.input.openfeign.client;

import com.mamani.infrastructure.input.openfeign.dto.ExchangeRateFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchange-rate", url = "${api.external-url}")
public interface ExchangeRateFeignClient {

    @GetMapping("/{code}")
    ExchangeRateFeignResponse getExchangesCodesAndValues(@PathVariable String code);
}
