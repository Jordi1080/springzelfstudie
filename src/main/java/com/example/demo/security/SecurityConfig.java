package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    DataSource dataSource;
//
//    @Autowired
//    private UserDetailsService uds;
//


//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                // secure dingen moeten bovenaan, pas onderaan de permit all
//                .authorizeRequests()
//                // voor deze urls moet je role user hebben om erbij te kunnen
//                // TODO: urls hier aanpassen naar bestaande links
//                .antMatchers("/test", "/orders")
//                // mag niet "ROLE_USER" zijn, waarom?
//                .hasRole("USER")
//                // hier mag iedereen bij
//                .antMatchers("/", "/**")
//                .permitAll()
//
//                // test
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//
//    }

    // Password Encoder
//    @Override
//    protected void configure(AuthenticationManagerBuilder amb) throws Exception {
//        amb
//                .userDetailsService(uds)
//                .passwordEncoder(encoder());
//    }


    // LDAP
//    @Override
//    protected void configure(AuthenticationManagerBuilder amb) throws Exception {
//        amb
//                .ldapAuthentication()
//
//                .userSearchBase("ou = people")
//                .userSearchFilter("(uid = {0} )")
//
//                .groupSearchBase("ou = groups")
//                .groupSearchFilter("member = {0} ")
//
//                .passwordCompare()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .passwordAttribute("passcode")
//                .and()
//                .contextSource()
//                .root("dc=tacocloud,dc=com")
//                .ldif("classpath:users.ldif");
//    }

    // JDBC-based
//    @Override
//    protected void configure(AuthenticationManagerBuilder amb) throws Exception {
//        amb.
//                jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery(
//                        "SELECT username, password, enabled FROM Users " +
//                                "WHERE username = ?")
//                .authoritiesByUsernameQuery(
//                        "SELECT username, authority FROM UserAuthorities" +
//                                "WHERE username = ?")
//                // DEPRECATED:
//                .passwordEncoder(new StandardPasswordEncoder("Welkom01"));
//    }

    // In-memory user store
    @Override
    protected void configure(AuthenticationManagerBuilder amb) throws Exception {

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        amb.inMemoryAuthentication()
                .withUser("Freddy")
                .password(encoder.encode("123"))
                .authorities("ROLE_USER")
                .and()
                .withUser("Loebas")
                .password(encoder.encode("123"))
                .authorities("ROLE_USER");
    }
}
