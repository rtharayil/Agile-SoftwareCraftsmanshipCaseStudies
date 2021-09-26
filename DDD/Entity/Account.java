package com.pragmatists.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {

    private AccountId id;
    private String number;
    private String owner;
    private Money balance = 0;
    private boolean closed;
    private List<Event> changes = new ArrayList<>();

    Account() {
    }

    Account(AccountId accountId) {
        this.id = accountId;
    }

    
    public AccountId id() {
        return id;
    }

    public Account createAccount(String owner) {
        this.id = AccountId.generate();
        this.owner = owner;
 
        this.balance = 0;

        changes.add(new AccountCreated(id, owner));
        return this;
    }

    public void deposit(Money value) {
        this.balance.add(value);
        changes.add(new AccountDeposited(id, value));
    }

    public void withdraw(Money value) {
        this.balance.add(value);
        changes.add(new AccountWithdrawed(id, value));
    }

    public void close() {
        this.closed = true;
        changes.add(new AccountClosed(id));
    }

    public boolean isClosed() {
        return closed;
    }

   
    public String owner() {
        return owner;
    }

    public Integer balance() {
        return balance;
    }

    public List<Event> getChanges() {
        return changes;
    }
}
