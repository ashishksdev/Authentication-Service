package com.across.authentication.customer.factory;

import com.across.authentication.customer.dto.CustomerPersonalInfoDTO;
import com.across.authentication.customer.model.Customer;

public class CustomerFactory {
    public Customer create(CustomerPersonalInfoDTO personalInfo){
        Customer newCustomer = new Customer(
            personalInfo.uniqueID(),
            personalInfo.name(),
            personalInfo.gender(),
            personalInfo.age(),
            personalInfo.mobileNo()
        );
        return newCustomer;
    }
}