package software.ulpgc.kata7.apps.windows;

import software.ulpgc.kata7.apps.mock.MockCurrencyLoader;
import software.ulpgc.kata7.apps.mock.MockExchangeRateLoader;
import software.ulpgc.kata7.architecture.control.ExchangeCommand;
import software.ulpgc.kata7.architecture.model.Currency;

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
