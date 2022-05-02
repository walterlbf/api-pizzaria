package com.pizzaria.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pizzaria.api.model.Pizza;
import com.pizzaria.api.repository.PizzaRepository;

@RestController // é um controller
@RequestMapping("/pizzas") // mapaeira as requisicoes
public class Pizzas {

  @Autowired
  private PizzaRepository pizzaRepository;

  @GetMapping // quando chegar uma requisição get pizzas.
  public List<Pizza> findAll() {
    return pizzaRepository.findAll();
  }

}
