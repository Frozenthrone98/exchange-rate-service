package com.mamani.domain.model.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateRequest {
    private BigDecimal amount;
    private String sourceCurrency;
    private String destinationCurrency;
}
