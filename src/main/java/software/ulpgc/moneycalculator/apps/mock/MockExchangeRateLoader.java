package software.ulpgc.moneycalculator.apps.mock;

import software.ulpgc.moneycalculator.architecture.model.Currency;
import software.ulpgc.moneycalculator.architecture.model.ExchangeRate;
import software.ulpgc.moneycalculator.architecture.persistence.ExchangeRateLoader;

import java.time.LocalDate;
import java.util.Objects;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to, LocalDate date) {
        if(Objects.equals(from.symbol(), "$") && Objects.equals(to.symbol(), "€")){
            return new ExchangeRate(from,to,0.96,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), "€") && Objects.equals(to.symbol(), "$")){
            return new ExchangeRate(from,to,1.04,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), "¥") && Objects.equals(to.symbol(), "€")){
            return new ExchangeRate(from,to,0.0061,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), "€") && Objects.equals(to.symbol(), "¥")){
            return new ExchangeRate(from,to,163.49,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), "¥") && Objects.equals(to.symbol(), "$")){
            return new ExchangeRate(from,to,0.0063,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), "$") && Objects.equals(to.symbol(), "¥")){
            return new ExchangeRate(from,to,157.64,LocalDate.now());
        }
        if(Objects.equals(from.symbol(), to.symbol())){
            return new ExchangeRate(from,to,1,LocalDate.now());
        }

        return null;
    }
}
