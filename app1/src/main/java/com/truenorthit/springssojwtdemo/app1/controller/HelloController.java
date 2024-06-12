package com.truenorthit.springssojwtdemo.app1.controller;

import com.truenorthit.springssojwtdemo.app1.security.JwtTokenGenerator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        final String jwtToken = JwtTokenGenerator.generateToken(username);

        model.addAttribute("jwtToken", jwtToken);

        // Return the view name "hello"
        return "hello";
    }

}
