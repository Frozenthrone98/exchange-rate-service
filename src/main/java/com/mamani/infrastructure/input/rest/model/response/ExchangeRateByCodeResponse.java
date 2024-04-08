package com.mamani.infrastructure.input.rest.model.response;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateByCodeResponse {
    private BigDecimal amount;
    private BigDecimal amountWithExchangeRate;
    private String sourceCurrency;
    private String destinationCurrency;
    private BigDecimal exchangeRate;
}
