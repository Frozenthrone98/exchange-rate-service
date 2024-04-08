package com.mamani.infrastructure.output.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exchange_rate_records")
public class ExchangeRateRecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @Column(name = "amount_with_exchange_rate")
    private BigDecimal amountWithExchangeRate;

    @Column(name = "source_currency")
    private String sourceCurrency;

    @Column(name = "destination_currency")
    private String destinationCurrency;

    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
