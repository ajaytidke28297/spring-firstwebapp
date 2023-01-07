package com.explanatory.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("ajay");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidPassword && isValidUserName;
    }

}
