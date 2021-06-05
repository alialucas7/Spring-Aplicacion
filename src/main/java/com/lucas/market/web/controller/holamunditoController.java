package com.lucas.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@org.springframework.web.bind.annotation.RequestMapping("/saludar")


public class holamunditoController {

    @GetMapping("/hola")
    public String saluda(){
        return "la tengo re grande jeje";
    }
}
