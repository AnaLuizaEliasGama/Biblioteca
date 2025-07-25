package org.example.repository;

import org.hibernate.boot.model.relational.Database;

import java.sql.Connection;

public class Cliente {
    public void adicionar(Cliente cliente){
      String sql = "Insert into ( cliId, cliNome, cliCpf, cliRg, cliDataNascimento,  cliSexo, cliObservacoes,  cliAtivo) values (? , ? ,? , ? , ? , ? ,  ? ?)"
        try (Connection conn = Database.getConnection ();

