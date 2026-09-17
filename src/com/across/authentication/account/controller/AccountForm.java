package com.across.authentication.account.controller;

import com.across.authentication.account.model.AccountType;
import com.across.authentication.core.util.Input;

public class AccountForm {
    
    public AccountType promptForAccountDetail(){
        System.out.print("Saving | Current\n>> ");
        AccountType accountTypeInput = AccountType.valueOf(Input.sc.next().toUpperCase().trim());
        Input.sc.nextLine();

        return accountTypeInput;
    }
}