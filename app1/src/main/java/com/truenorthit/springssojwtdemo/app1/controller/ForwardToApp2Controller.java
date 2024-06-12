package com.truenorthit.springssojwtdemo.app1.controller;

import com.truenorthit.springssojwtdemo.app1.security.JwtTokenGenerator;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardToApp2Controller {

    @GetMapping("/app2")
    public ResponseEntity<Void> redirectToExternalSite() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String jwtToken = "";
        if (authentication != null) {
            String username = authentication.getName();
            jwtToken = JwtTokenGenerator.generateToken(username);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "http://localhost:8081?token=" + jwtToken);

        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }

}
