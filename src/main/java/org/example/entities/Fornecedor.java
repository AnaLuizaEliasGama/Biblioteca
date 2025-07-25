package org.example.entities;

import org.hibernate.boot.model.relational.Database;

import javax.swing.*;
import java.text.DateFormat;

public class Fornecedor {
    private String forId;
    private String forRazaoSocial;
    private String forNomeFantasia;
    private String forCnpj;
    private String forInscricaoEstadual;
    private String forInscricaoMunicipal;
    private String forContatoResponsavel;
    private Database forDataCadastro;
    private String forObservacoes;
    private boolean forSAtivo;

    public Fornecedor(String forId, String forRazaoSocial, String forNomeFantasia, String forCnpj, String forInscricaoEstadual, String forInscricaoMunicipal, String forContatoResponsavel, Database forDataCadastro, String forObservacoes, boolean forSAtivo) {
        this.forId = forId;
        this.forRazaoSocial = forRazaoSocial;
        this.forNomeFantasia = forNomeFantasia;
        this.forCnpj = forCnpj;
        this.forInscricaoEstadual = forInscricaoEstadual;
        this.forInscricaoMunicipal = forInscricaoMunicipal;
        this.forContatoResponsavel = forContatoResponsavel;
        this.forDataCadastro = forDataCadastro;
        this.forObservacoes = forObservacoes;
        this.forSAtivo = forSAtivo;
    }

    public String getForId() {
        return forId;
    }

    public void setForId(String forId) {
        this.forId = forId;
    }

    public String getForRazaoSocial() {
        return forRazaoSocial;
    }

    public void setForRazaoSocial(String forRazaoSocial) {
        this.forRazaoSocial = forRazaoSocial;
    }

    public String getForNomeFantasia() {
        return forNomeFantasia;
    }

    public void setForNomeFantasia(String forNomeFantasia) {
        this.forNomeFantasia = forNomeFantasia;
    }

    public String getForCnpj() {
        return forCnpj;
    }

    public void setForCnpj(String forCnpj) {
        this.forCnpj = forCnpj;
    }

    public String getForInscricaoEstadual() {
        return forInscricaoEstadual;
    }

    public void setForInscricaoEstadual(String forInscricaoEstadual) {
        this.forInscricaoEstadual = forInscricaoEstadual;
    }

    public String getForInscricaoMunicipal() {
        return forInscricaoMunicipal;
    }

    public void setForInscricaoMunicipal(String forInscricaoMunicipal) {
        this.forInscricaoMunicipal = forInscricaoMunicipal;
    }

    public String getForContatoResponsavel() {
        return forContatoResponsavel;
    }

    public void setForContatoResponsavel(String forContatoResponsavel) {
        this.forContatoResponsavel = forContatoResponsavel;
    }

    public Database getForDataCadastro() {
        return forDataCadastro;
    }

    public void setForDataCadastro(Database forDataCadastro) {
        this.forDataCadastro = forDataCadastro;
    }

    public String getForObservacoes() {
        return forObservacoes;
    }

    public void setForObservacoes(String forObservacoes) {
        this.forObservacoes = forObservacoes;
    }

    public boolean isForSAtivo() {
        return forSAtivo;
    }

    public void setForSAtivo(boolean forSAtivo) {
        this.forSAtivo = forSAtivo;
    }

    public Fornecedor() { //Contrutor vazio para não misturar esse contructor e o proximo.



    }


}