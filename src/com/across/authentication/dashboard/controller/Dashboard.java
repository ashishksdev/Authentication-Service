package com.across.authentication.dashboard.controller;

import com.across.authentication.account.model.Account;
import com.across.authentication.account.repository.AccountRepository;
import com.across.authentication.account.validator.AccountStatusValidator;
import com.across.authentication.core.util.AppConstants;
import com.across.authentication.core.util.Input;
import com.across.authentication.customer.model.Customer;
import com.across.authentication.customer.repository.CustomerRepository;
import com.across.authentication.dashboard.exception.AccountNotActiveException;
import com.across.authentication.dashboard.model.LoginAction;
import com.across.authentication.user.model.User;

public class Dashboard {

    private final User user;
    private Account account;
    private Customer customer;
    private final AccountRepository ACCOUNT_DATA;
    private final CustomerRepository CUSTOMER_DATA;

    public Dashboard(User user, AccountRepository ACCOUNT_DATA, CustomerRepository CUSTOMER_DATA){
        this.user = user;
        this.ACCOUNT_DATA = ACCOUNT_DATA;
        this.CUSTOMER_DATA = CUSTOMER_DATA;
    }

    public void start(){
        String accountNumber = user.accountNumber();
        account = ACCOUNT_DATA.getAccount(accountNumber); // Fetch account

        AccountStatusValidator validator = new AccountStatusValidator(account);
        if(!validator.validateActive()){
            throw new AccountNotActiveException("Account is not active.");
        }

        customer = CUSTOMER_DATA.getCustomer(account.customerID()); // Fetch Customer
    
        printWelcomeMessage(customer.name()); // Welcome message

    }

    private void printWelcomeMessage(String name){
        System.out.printf("Hello %s!%n", name);
    }
   
}