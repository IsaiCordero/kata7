package software.ulpgc.kata7.apps.windows.view;

import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.view.CurrencyDialog;

import javax.swing.*;
import java.util.List;

public class SwingCurrencyDialog extends JPanel implements CurrencyDialog {
    private final List<Currency> currencies;
    private final JComboBox<Currency> selector;

    public SwingCurrencyDialog(List<Currency> currencies) {
        this.currencies = currencies;
        this.add(selector = createSelector());
    }

    private JComboBox<Currency> createSelector() {
        JComboBox<Currency> comboNew = new JComboBox<>();
        for(Currency currency : currencies) {
            comboNew.addItem(currency);
        }
        return comboNew;
    }

    @Override
    public Currency get() {
        return currencies.get(selector.getSelectedIndex());
    }
}
