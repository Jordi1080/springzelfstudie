package com.example.demo.controller;

import com.example.demo.entity.Woning;
import com.example.demo.repository.WoningRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/woningen")
public class WoningController {

    private WoningRepository woningRepo;

    public WoningController(WoningRepository woningRepo) {
        this.woningRepo = woningRepo;
    }

    @GetMapping
    public String getAlleWoningen(Model model) {
        model.addAttribute("woninglijst", woningRepo.findAll());
        return "index";
    }

    @GetMapping("{bagId}")
    public Optional<Woning> getWoningById(String bagId) {
        return woningRepo.findByBagId(bagId);
    }

    @GetMapping("{bouwjaar}")
    public Woning getWoningByName(int bouwjaar) {
        return woningRepo.findByBouwjaar(bouwjaar);
    }

}
