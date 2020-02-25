package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Woning {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bagId;

    //    @OneToOne
    private String adres;

    private int oppervlakte;

    private int bouwjaar;


}
