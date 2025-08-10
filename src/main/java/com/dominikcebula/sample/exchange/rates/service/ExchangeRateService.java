package com.dominikcebula.sample.exchange.rates.service;

import com.dominikcebula.sample.exchange.rates.db.ExchangeRate;
import com.dominikcebula.sample.exchange.rates.db.ExchangeRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExchangeRateService {
    private final ExchangeRateRepository exchangeRateRepository;

    public List<ExchangeRate> getLatestRates() {
        return exchangeRateRepository.findAll();
    }
}
