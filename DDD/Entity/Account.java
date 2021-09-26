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

        
        return this;
    }

    public void setBalance(Money value){
        this.balance.add(0);
        this.balance.add(value);
    }

    public void deposit(Money value) {
        this.balance.add(value);
       
    }

    public void withdraw(Money value) {
        this.balance.add(value);
        
    }

    public void close() {
        this.closed = true;
        
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

    
}
