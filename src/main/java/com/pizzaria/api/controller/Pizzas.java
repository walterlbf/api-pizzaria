package com.pizzaria.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pizzaria.api.model.Pizza;
import com.pizzaria.api.repository.PizzaRepository;

@RestController // é um controller
@RequestMapping("/api") // mapeira as requisicoes
public class Pizzas {

  @Autowired
  private PizzaRepository pizzaRepository;

  @GetMapping("/pizzas") // quando chegar uma requisição get pizzas.
  public ResponseEntity<List<Pizza>> findAll() {

    try {
      List<Pizza> pizzas = pizzaRepository.findAll();
      if (pizzas.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(pizzas, HttpStatus.OK);

    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PostMapping("/pizzas")
  public ResponseEntity<Pizza> addPizza(@RequestBody Pizza pizza) {
    try {
      Pizza pizzaRep = pizzaRepository.save(pizza);
      return new ResponseEntity<>(pizzaRep, HttpStatus.CREATED);

    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/pizzas")
  public void removePizzas() {
    pizzaRepository.deleteAll();
  }

  @DeleteMapping("/pizzas/{id}") // @PathVariable valor da variavel faz parte da url
  public void removeById(@PathVariable("id") long id) {
    pizzaRepository.deleteById(id);
  }
}
