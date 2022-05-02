package com.pizzaria.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // tabela pizza no banco de dados.
public class Pizza {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // o bd que cria o id
  private long id;
  private String nome;
  private String descricao;
  private float preco;

}
