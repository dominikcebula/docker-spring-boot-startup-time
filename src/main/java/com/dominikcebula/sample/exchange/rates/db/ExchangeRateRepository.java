package com.dominikcebula.sample.exchange.rates.db;

import org.springframework.data.repository.ListCrudRepository;

public interface ExchangeRateRepository extends ListCrudRepository<ExchangeRate, Long> {
}
