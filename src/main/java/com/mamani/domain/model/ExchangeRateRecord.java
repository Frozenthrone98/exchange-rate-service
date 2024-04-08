package com.mamani.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateRecord {
    private Long id;
    private BigDecimal amount;
    private BigDecimal amountWithExchangeRate;
    private String sourceCurrency;
    private String destinationCurrency;
    private BigDecimal exchangeRate;
    private LocalDateTime createdAt;
}
