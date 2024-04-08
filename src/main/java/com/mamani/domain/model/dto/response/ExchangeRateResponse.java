package com.mamani.domain.model.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateResponse {
    private BigDecimal amount;
    private BigDecimal amountWithExchangeRate;
    private String sourceCurrency;
    private String destinationCurrency;
    private BigDecimal exchangeRate;
}
