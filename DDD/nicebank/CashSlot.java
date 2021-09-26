package nicebank;

public class CashSlot {
    int money;
    public int getMoney() {
        return money;
    }

    public void dispense(int amount) {
        money =amount;
    }
}
