package com.example.demo.security;

import com.example.demo.entity.Gebruiker;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private final String username;
    private final String password;
    private final String fullname;
    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    private final String phone; //phoneNumber?? zie Gebruiker class

    public Gebruiker toUser(PasswordEncoder passwordEncoder) {
        return new Gebruiker(
                username,
                passwordEncoder.encode(password),
                fullname,
                street,
                city,
                state,
                zip,
                phone
        );
    }

}
