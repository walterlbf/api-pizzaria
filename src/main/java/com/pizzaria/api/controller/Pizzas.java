package com.pizzaria.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // é um controller
@RequestMapping("/pizzas") // mapaeira as requisicoes
public class Pizzas {

  @GetMapping // quando chegar uma requisição get pizzas.
  public String list() {
    return "olá mundo!";

  }

}
