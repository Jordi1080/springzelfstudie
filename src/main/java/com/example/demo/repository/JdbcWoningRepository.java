package com.example.demo.repository;

import com.example.demo.entity.Woning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.demo.entity.Adres.createAdres;


// TODO: niet meer String en int door elkaar gebruiken voor (bag)id
@Repository
public class JdbcWoningRepository implements WoningRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcWoningRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Woning> findAll(){
        return jdbc.query(
                "SELECT bagid, adres, oppervlakte, bouwjaar FROM WONING",
                this::mapRowToWoning);
    }

    @Override
    public Woning findOne(String id){
        return jdbc.queryForObject(
                "SELECT bagid, adres, oppervlakte, bouwjaar FROM WONING" +
                        "WHERE bagId = ?",
                this::mapRowToWoning, id);
    }

    @Override
    public Woning save(Woning woning){
//        jdbcTemplate.update(
//                "INSERT INTO woning(bagid, adres, oppervlakte, bouwjaar) VALUES (?, ?, ?)",
//                woning.getBagId(),
//                woning.getAdres(),
//                woning.getOppervlakte(),
//                woning.getBouwjaar());
//                return woning;
//        )
        return null;
    }

    private Woning mapRowToWoning(ResultSet rs, int rowNum) throws SQLException {
        return new Woning(
                rs.getInt("bagid"),
                createAdres(rs.getString("adres")),
                rs.getInt("oppervlakte"),
                rs.getInt("bouwjaar")
        );
    }


}
