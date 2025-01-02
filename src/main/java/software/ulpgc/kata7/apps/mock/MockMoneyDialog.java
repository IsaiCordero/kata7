package software.ulpgc.kata7.apps.mock;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.model.Money;
import software.ulpgc.kata7.architecture.view.MoneyDialog;

import java.util.List;

public class MockMoneyDialog implements MoneyDialog {
    private final List<Currency> currencies;

    public MockMoneyDialog(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public Money get() {
        return new Money(100, currencies.getLast());
    }
}
