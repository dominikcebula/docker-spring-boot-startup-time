package com.dominikcebula.sample.exchange.rates.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateDto {
    private String code;
    private BigDecimal exchangeRate;
    private LocalDate date;
}
