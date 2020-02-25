package com.example.demo;

import com.example.demo.controller.WoningController;
import com.example.demo.entity.Woning;
import com.example.demo.repository.WoningRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {WoningController.class, Woning.class,
        WoningRepository.class})
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
