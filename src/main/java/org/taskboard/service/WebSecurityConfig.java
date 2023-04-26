package org.taskboard.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests((request) -> request
                .requestMatchers("/dashboard").authenticated()
        )
        .formLogin((form) -> form
                .loginPage("/login")
                .defaultSuccessUrl("/")
        )
        .logout((logout) -> logout.logoutUrl("/login"));
        return http.build();
    }
}
