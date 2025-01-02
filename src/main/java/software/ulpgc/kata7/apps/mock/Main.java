package software.ulpgc.kata7.apps.mock;

import software.ulpgc.kata7.architecture.control.Command;
import software.ulpgc.kata7.architecture.control.ExchangeCommand;
import software.ulpgc.kata7.architecture.model.Currency;
import software.ulpgc.kata7.architecture.persistence.ExchangeRateLoader;
import software.ulpgc.kata7.architecture.view.CurrencyDialog;
import software.ulpgc.kata7.architecture.view.MoneyDialog;
import software.ulpgc.kata7.architecture.view.MoneyDisplay;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MoneyDialog moneyDialog = new MockMoneyDialog(currencies);
        CurrencyDialog currencyDialog = new MockCurrencyDialog(currencies);
        ExchangeRateLoader exchangeRateLoader = new MockExchangeRateLoader();
        MoneyDisplay moneyDisplay = new MockMoneyDisplay();
        Command command = new ExchangeCommand(
                moneyDialog,
                currencyDialog,
                exchangeRateLoader,
                moneyDisplay
        );
        command.execute();
    }
}
