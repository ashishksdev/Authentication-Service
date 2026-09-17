package com.across.authentication.auth.controller;

import com.across.authentication.auth.dto.LoginDTO;
import com.across.authentication.core.util.Input;

public class LoginForm {
    public LoginDTO loginCredentials(){
        // Input login credentials (userID and Password) for login.
        System.out.print("User ID: ");
        String inputUserID = Input.sc.next().trim().toLowerCase(); // User ID input in String format.
        System.out.print("Password: ");
        String inputPassword = Input.sc.next().trim(); // Password input.

        return new LoginDTO(inputUserID, inputPassword);
    }
}