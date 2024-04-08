package com.mamani.infrastructure.input.rest.model.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateByCodeRequest {

    @NotNull(message = "Field amount cannot be empty or null.")
    @Min(value = 1, message = "amount must be at least 10")
    private BigDecimal amount;

    @NotBlank(message = "Field sourceCurrency cannot be empty or null.")
    @Pattern(regexp = "^[A-Z]{3}$", message = "Field sourceCurrency must contain only 3 uppercase letters")
    private String sourceCurrency;

    @NotBlank(message = "Field destinationCurrency cannot be empty or null.")
    @Pattern(regexp = "^[A-Z]{3}$", message = "Field destinationCurrency must contain only 3 uppercase letters")
    private String destinationCurrency;
}
