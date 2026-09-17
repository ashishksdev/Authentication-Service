package com.across.authentication.customer.repository.impl;

import com.across.authentication.customer.model.Customer;
import com.across.authentication.customer.repository.CustomerRepository;
import java.util.HashMap;

public class HashMapCustomerRepository implements CustomerRepository {
    private final HashMap<String, Customer> customerDataTable = new HashMap<>();

    @Override
    public void update(Customer customer){
        customerDataTable.put(customer.customerID(), customer);
    }

    @Override
    public boolean exists(String uniqueID){
        return customerDataTable.containsKey(uniqueID);
    }

    @Override
    public Customer getCustomer(String customerID){
        return customerDataTable.get(customerID);
    }
}