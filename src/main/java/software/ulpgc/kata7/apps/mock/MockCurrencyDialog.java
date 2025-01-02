package software.ulpgc.kata7.apps.mock;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.view.CurrencyDialog;

import java.util.List;

public class MockCurrencyDialog implements CurrencyDialog {
    private final List<Currency> currencies;

    public MockCurrencyDialog(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public Currency get() {
        return currencies.getFirst();
    }
}
