package nicebank;

public class Account {
    int balance;
    public Account(){
        balance=0;
    }
    public void deposit(int amount) {
        balance = balance+ amount;
    }

    public int balance() {
        return balance;
    }

    public void debit(int amount) {
        balance= balance-amount;
    }
}
