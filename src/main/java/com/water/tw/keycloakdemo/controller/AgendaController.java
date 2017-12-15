package com.water.tw.keycloakdemo.controller;

import static java.util.Arrays.asList;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendaController {
    @GetMapping(path = "/agenda")
    public String getAgenda(Model model, Principal principal) {
        model.addAttribute("agenda", asList(
                "12:00-12:20 Keycloak                Shuiqiang",
                "12:20-12:40 CSS Model & CSS in JS   Lin Chen",
                "12:40-13:00 CSS Grid Layout         Li Yu"));
        model.addAttribute("username", principal.getName());
        return "agenda";
    }

}
