package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

//    @Bean
//    @Profile("dev")
//    public CommandLineRunner dataLoader(GebruikerRepository repo, PasswordEncoder encoder){
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
