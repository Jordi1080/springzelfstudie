package com.example.demo.controller;

import com.example.demo.repository.GebruikerRepository;
import com.example.demo.security.RegistrationForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    private GebruikerRepository gebrRepo;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(GebruikerRepository gebrRepo, PasswordEncoder passwordEncoder) {
        this.gebrRepo = gebrRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        return "registratie";
    }

    @PostMapping
    public String processRegistration(RegistrationForm rf) {
        gebrRepo.save(rf.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
