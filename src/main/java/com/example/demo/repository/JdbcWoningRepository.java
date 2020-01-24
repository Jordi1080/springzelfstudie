package com.example.demo.repository;

import com.example.demo.entity.Woning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


// TODO: niet meer String en int door elkaar gebruiken voor (bag)id
@Repository
public class JdbcWoningRepository implements WoningRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcWoningRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Woning> findAll(){
        return jdbcTemplate.query(
                "SELECT bagid, adres, oppervlakte, bouwjaar FROM WONING",
                this::mapRowToWoning);
    }

    @Override
    public Woning findOne(String id){
        return jdbcTemplate.queryForObject(
                "SELECT bagid, adres, oppervlakte, bouwjaar FROM WONING" +
                        "WHERE bagId = ?",
                this::mapRowToWoning, id);
    }

    private Woning mapRowToWoning(ResultSet rs, int rowNum) throws SQLException {
        return new Woning(
                rs.getInt("bagid"),
                rs.getObject("adres"),
                rs.getInt("oppervlakte"),
                rs.getInt("bouwjaar")
        );
    }
}
