package software.ulpgc.kata7.apps.mock;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.persistence.CurrencyLoader;

import java.util.List;

public class MockCurrencyLoader implements CurrencyLoader {
    @Override
    public List<Currency> load() {
        return List.of(
                new Currency("USD", "Dolar", "$"),
                new Currency("EUR", "Euro", "€"),
                new Currency("JPY", "Yen", "¥")
        );
    }
}
