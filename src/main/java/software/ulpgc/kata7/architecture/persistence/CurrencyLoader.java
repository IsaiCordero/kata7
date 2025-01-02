package software.ulpgc.kata7.architecture.persistence;

import software.ulpgc.kata7.architecture.model.Currency;

import java.util.List;

public interface CurrencyLoader {
    List<Currency> load();
}
