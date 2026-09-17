package com.across.authentication.customer.dto;

import com.across.authentication.customer.model.Gender;

public record CustomerPersonalInfoDTO(
    String uniqueID,
    String name,
    Gender gender,
    int age,
    String mobileNo)
{}