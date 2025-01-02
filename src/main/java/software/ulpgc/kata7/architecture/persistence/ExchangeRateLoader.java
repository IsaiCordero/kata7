package software.ulpgc.kata7.architecture.persistence;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.model.ExchangeRate;

import java.time.LocalDate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to, LocalDate date);
}
