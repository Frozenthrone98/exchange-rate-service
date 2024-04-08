package com.mamani.infrastructure.input.openfeign.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateFeignResponse {
    private String result;
    private String provider;
    private String documentation;
    private String termsOfUse;
    private Long timeLastUpdateUnix;
    private String timeLastUpdateUtc;
    private Long timeNextUpdateUnix;
    private String timeNextUpdateUtc;
    private Long timeEolUnix;
    private String baseCode;
    private Map<String, BigDecimal> rates;
}
