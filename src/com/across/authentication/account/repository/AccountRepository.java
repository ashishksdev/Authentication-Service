package com.across.authentication.account.repository;

import com.across.authentication.account.model.Account;

public interface AccountRepository {
    public void update(Account account);
    public boolean exists(String accountNumber);
    public Account getAccount(String accountNumber);
}
