package com.pizzaria.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pizzaria.api.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
