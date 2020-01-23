package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Woning {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bagId;

    @OneToOne
    private Adres adres;

    private int oppervlakte;

    private int bouwjaar;


}
