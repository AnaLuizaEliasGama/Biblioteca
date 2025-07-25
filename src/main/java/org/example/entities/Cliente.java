package org.example.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Representa um cliente no sistema.
 */
public class Cliente {
    private String cliId; // Identificador único do cliente
    private String cliNome; // Nome completo do cliente
    private String cliCpf; // CPF do cliente
    private String cliRg; // RG do cliente
    private LocalDate cliDataNascimento; // Data de nascimento do cliente
    private String cliSexo; // Sexo do cliente (ex.: "M", "F", "Outro")
    private LocalDate cliDataCadastro; // Data de cadastro do cliente no sistema
    private String cliObservacoes; // Observações adicionais sobre o cliente
    private boolean cliAtivo; // Indica se o cliente está ativo no sistema

    /**
     * Construtor padrão.
     */
    public Cliente() {
        this.cliAtivo = true; // Por padrão, o cliente é ativado ao ser cadastrado
        this.cliDataCadastro = LocalDate.now(); // Define a data de cadastro como a data atual
    }

    /**
     * Construtor completo.
     *
     * @param cliId             Identificador único do cliente
     * @param cliNome           Nome completo do cliente
     * @param cliCpf            CPF do cliente
     * @param cliRg             RG do cliente
     * @param cliDataNascimento Data de nascimento do cliente
     * @param cliSexo           Sexo do cliente
     * @param cliObservacoes    Observações adicionais sobre o cliente
     * @param cliAtivo          Indica se o cliente está ativo no sistema
     */
    public Cliente(String cliId, String cliNome, String cliCpf, String cliRg, LocalDate cliDataNascimento,
                   String cliSexo, String cliObservacoes, boolean cliAtivo) {
        setCliId(cliId);
        setCliNome(cliNome);
        setCliCpf(cliCpf);
        setCliRg(cliRg);
        setCliDataNascimento(cliDataNascimento);
        setCliSexo(cliSexo);
        setCliObservacoes(cliObservacoes);
        setCliAtivo(cliAtivo);
    }

    // Getters e Setters
    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        if (cliId == null || cliId.isEmpty()) {
            throw new IllegalArgumentException("ID do cliente não pode ser nulo ou vazio.");
        }
        this.cliId = cliId;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        if (cliNome == null || cliNome.isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser nulo ou vazio.");
        }
        this.cliNome = cliNome;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        if (cliCpf == null || cliCpf.isEmpty()) {
            throw new IllegalArgumentException("CPF do cliente não pode ser nulo ou vazio.");
        }
        // Validação básica de formato (ex.: 11 dígitos)
        if (!cliCpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos.");
        }
        this.cliCpf = cliCpf;
    }

    public String getCliRg() {
        return cliRg;
    }

    public void setCliRg(String cliRg) {
        if (cliRg == null || cliRg.isEmpty()) {
            throw new IllegalArgumentException("RG do cliente não pode ser nulo ou vazio.");
        }
        this.cliRg = cliRg;
    }

    public LocalDate getCliDataNascimento() {
        return cliDataNascimento;
    }

    public void setCliDataNascimento(LocalDate cliDataNascimento) {
        if (cliDataNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula.");
        }
        this.cliDataNascimento = cliDataNascimento;
    }

    public String getCliSexo() {
        return cliSexo;
    }

    public void setCliSexo(String cliSexo) {
        if (cliSexo == null || cliSexo.isEmpty()) {
            throw new IllegalArgumentException("Sexo não pode ser nulo ou vazio.");
        }
        this.cliSexo = cliSexo;
    }

    public LocalDate getCliDataCadastro() {
        return cliDataCadastro;
    }

    public void setCliDataCadastro(LocalDate cliDataCadastro) {
        if (cliDataCadastro == null) {
            throw new IllegalArgumentException("Data de cadastro não pode ser nula.");
        }
        this.cliDataCadastro = cliDataCadastro;
    }

    public String getCliObservacoes() {
        return cliObservacoes;
    }

    public void setCliObservacoes(String cliObservacoes) {
        this.cliObservacoes = cliObservacoes;
    }

    public boolean isCliAtivo() {
        return cliAtivo;
    }

    public void setCliAtivo(boolean cliAtivo) {
        this.cliAtivo = cliAtivo;
    }

    // Métodos auxiliares
    /**
     * Ativa o cliente no sistema.
     */
    public void ativar() {
        this.cliAtivo = true;
    }

    /**
     * Desativa o cliente no sistema.
     */
    public void desativar() {
        this.cliAtivo = false;
    }

    /**
     * Verifica se o cliente está ativo.
     *
     * @return true se o cliente está ativo, false caso contrário.
     */
    public boolean isValidoParaUso() {
        return this.cliAtivo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliId='" + cliId + '\'' +
                ", cliNome='" + cliNome + '\'' +
                ", cliCpf='" + cliCpf + '\'' +
                ", cliRg='" + cliRg + '\'' +
                ", cliDataNascimento=" + cliDataNascimento +
                ", cliSexo='" + cliSexo + '\'' +
                ", cliDataCadastro=" + cliDataCadastro +
                ", cliObservacoes='" + cliObservacoes + '\'' +
                ", cliAtivo=" + cliAtivo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cliId, cliente.cliId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliId);
    }
}