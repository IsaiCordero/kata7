package software.ulpgc.kata7.apps.mock;

import software.ulpgc.kata7.architecture.model.Money;
import software.ulpgc.kata7.architecture.view.MoneyDisplay;

public class MockMoneyDisplay implements MoneyDisplay {
    @Override
    public void show(Money money) {
        System.out.println(money);
    }
}
