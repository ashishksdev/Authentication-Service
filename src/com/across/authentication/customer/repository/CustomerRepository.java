package com.across.authentication.customer.repository;

import com.across.authentication.customer.model.Customer;

public interface CustomerRepository {
    void update(Customer customer);
    boolean exists(String uniqueID);
    Customer getCustomer(String customerID);
}