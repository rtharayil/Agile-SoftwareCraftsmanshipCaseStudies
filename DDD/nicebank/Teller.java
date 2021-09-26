package nicebank;

public class Teller {
    CashSlot cashSlot;
    public Teller(CashSlot cashSlot) {
        this.cashSlot= cashSlot;
    }

    public void withdraw(Account myAccount, int amount) {
        myAccount.debit(amount);
        cashSlot.dispense(amount);
    }
}
