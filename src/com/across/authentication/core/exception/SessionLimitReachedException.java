package com.across.authentication.core.exception;

public class SessionLimitReachedException extends RuntimeException {
    
    public SessionLimitReachedException(){}
    public SessionLimitReachedException(String message){
        super(message);
    }
    public SessionLimitReachedException(String message, Throwable cause){
        super(message,cause);
    }
}
