package com.example.demo.security;

import com.example.demo.repository.GebruikerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GebruikerRepositoryUserDetailsService { //} implements UserDetailsService {
    private GebruikerRepository gebrRepo;

    @Autowired
    public GebruikerRepositoryUserDetailsService(GebruikerRepository gebrRepo) {
        this.gebrRepo = gebrRepo;
    }

    // load Gebruiker of load User?
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Gebruiker gebruiker = gebrRepo.findByUsername(username);
//
//        if (gebruiker != null) {
//            return gebruiker;
//        }
//
//        throw new UsernameNotFoundException(
//                "Gebruiker '" + username + "' niet gevonden.");
//    }
}
