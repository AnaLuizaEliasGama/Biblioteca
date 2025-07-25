package org.example.repository;

import org.hibernate.boot.model.relational.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Livro {
    public void adicionar(Livro livro){
        String sql = "Insert into Livro (id, titulo, isbn, editora, autor, edicao, idioma) values(?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getId());
            stmt.setString(2, livro.getTitulo());
            stmt.setString(3, livro.getAutor());
            stmt.setString(4, livro.getEditora()); 
            stmt.setString(5, livro.getEdicao());
            stmt.setString(6, livro.getIdioma());
            stmt.setBoolean(7, livro.isDisponivel());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao adicionar livro ao banco de dados.", e);
        }
    }

    }
}
