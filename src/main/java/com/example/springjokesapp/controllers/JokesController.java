package com.example.springjokesapp.controllers;

import com.example.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/chuck-norris")
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/joke")
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokesService.getRandomJoke());
        return "chuck-norris/joke";
    }
}
