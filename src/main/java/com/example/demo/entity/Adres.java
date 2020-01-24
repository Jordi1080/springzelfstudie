package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Adres {

    private String straatnaam;

    private int huisnummer;

    private String stad;
}
