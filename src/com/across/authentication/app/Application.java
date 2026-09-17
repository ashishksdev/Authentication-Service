package com.across.authentication.app;

import com.across.authentication.core.MainController;
import com.across.authentication.core.util.AppConstants;

public class Application {

    public static void main(String[] args) {

        System.out.println(AppConstants.WELCOME_MESSAGE); // Welcome message.
        MainController mainController = new MainController();
        mainController.start();
    
    }
}