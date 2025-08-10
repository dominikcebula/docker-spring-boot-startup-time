package com.dominikcebula.sample.exchange.rates.db;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "exchange_rate")
@Data
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private BigDecimal exchangeRate;
    private LocalDate date;
}
