package com.across.authentication.user.factory;

import com.across.authentication.auth.service.security.PasswordHash;
import com.across.authentication.user.model.User;

public class UserFactory {

    public User create(String userID, String hashedPassword, String salt, PasswordHash passwordHash){
        User newUser = new User(userID, hashedPassword, salt, passwordHash);
        return newUser;
    }
}
