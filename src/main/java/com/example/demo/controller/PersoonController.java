package com.example.demo.controller;

import com.example.demo.entity.Persoon;
import com.example.demo.repository.PersoonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personen")
public class PersoonController {

    private PersoonRepository persoonRepo;

    public PersoonController(PersoonRepository persoonRepo) {
        this.persoonRepo = persoonRepo;
    }

    @GetMapping
    public List<Persoon> allePersonen() {
        return persoonRepo.findAll();
    }

    @GetMapping("{id}")
    public Persoon getPersoonById(Long id) {
        return persoonRepo.findById(id);
    }

    @GetMapping("{naam}")
    public Persoon getPersoonByNaam(String naam) {
        return persoonRepo.findByNaam(naam);
    }

}
