package com.across.internetbanking.account.model;

public class CurrentAccount extends Account{
    double overDraft;

    public CurrentAccount(String accountNumber){
        super(accountNumber);
    }
}