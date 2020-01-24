package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Adres {

    @Id
    private Long id;

    private String straatnaam;

    private int huisnummer;

    private String stad;

    public static Adres createAdres(String inputString){
        // TODO
        return null;
    }
}
