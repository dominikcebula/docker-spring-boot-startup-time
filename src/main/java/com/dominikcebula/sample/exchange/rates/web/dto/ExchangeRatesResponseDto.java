package com.dominikcebula.sample.exchange.rates.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRatesResponseDto {
    private String base;
    private List<ExchangeRateDto> rates;
}
