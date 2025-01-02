package software.ulpgc.kata7.apps.windows.view;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.model.Money;
import software.ulpgc.kata7.architecture.view.MoneyDialog;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SwingMoneyDialog extends JPanel implements MoneyDialog {
    private final TextField amount;
    private final SwingCurrencyDialog currencyDialog;
    private final List<Currency> currencies;

    public SwingMoneyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.add(amount = createAmount());
        this.add(currencyDialog = new SwingCurrencyDialog(currencies));
    }

    private TextField createAmount() {
        TextField amount = new TextField();
        amount.setColumns(4);
        return amount;
    }

    @Override
    public Money get() {
        return new Money(toDouble(amount.getText()), currencyDialog.get());
    }

    private double toDouble(String text) {
        return Double.parseDouble(text);
    }
}
