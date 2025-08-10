package com.dominikcebula.sample.exchange.rates.web;

import com.dominikcebula.sample.exchange.rates.db.ExchangeRate;
import com.dominikcebula.sample.exchange.rates.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/exchange-rates")
@RequiredArgsConstructor
public class ExchangeRateController {
    private final ExchangeRateService exchangeRateService;

    @GetMapping
    public ResponseEntity<ExchangeRatesResponseDto> getExchangeRates() {
        List<ExchangeRate> exchangeRates = exchangeRateService.getLatestRates();

        List<ExchangeRateDto> exchangeRateDtos = exchangeRates.stream()
                .map(rate -> new ExchangeRateDto(rate.getCode(), rate.getExchangeRate(), rate.getDate()))
                .toList();

        ExchangeRatesResponseDto exchangeRatesResponseDto = new ExchangeRatesResponseDto(
                "PLN",
                exchangeRateDtos
        );

        return ResponseEntity.ok(exchangeRatesResponseDto);
    }
}
