package com.across.authentication.auth.validator;

import com.across.authentication.auth.dto.LoginDTO;
import com.across.authentication.user.repository.UserRepository;

public class LoginValidation {
    UserRepository userRepository;

    public LoginValidation(UserRepository USER_DATA){
        this.userRepository = USER_DATA;
    }

    public boolean validateUser(LoginDTO loginDTO) {
        return userRepository.exists(loginDTO.userIDInput());
    }

    public boolean validateCredentials(LoginDTO loginDTO){
        return userRepository.validate(loginDTO.userIDInput(), loginDTO.passwordInput());
    }
}