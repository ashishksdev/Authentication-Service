package com.across.authentication.user.repository;

import com.across.authentication.user.model.User;

public interface UserRepository {
    void update(User user);
    boolean exists(String userID);
    boolean validate(String userID, String password);
    User getUser(String userID);
}