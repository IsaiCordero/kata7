package software.ulpgc.moneycalculator.apps.windows;

import software.ulpgc.moneycalculator.apps.mock.MockCurrencyLoader;
import software.ulpgc.moneycalculator.apps.mock.MockExchangeRateLoader;
import software.ulpgc.moneycalculator.architecture.control.ExchangeCommand;
import software.ulpgc.moneycalculator.architecture.model.Currency;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MainFrame mainFrame = new MainFrame(currencies);
        ExchangeCommand exchangeCommand = new ExchangeCommand(
                mainFrame.getMoneyDialog(),
                mainFrame.getCurrencyDialog(),
                new MockExchangeRateLoader(),
                mainFrame.getMoneyDisplay()
        );
        mainFrame.add("exchange", exchangeCommand);
        mainFrame.setVisible(true);
    }
}
