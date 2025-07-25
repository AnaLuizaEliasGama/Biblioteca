package org.example.entities;

public class Pagamento {

        private int id; // Identificador único da  de pagamento
        private String descricao; // Descrição da  de pagamento
        private String tipo; // Tipo de pagamento (ex.: "à vista", "parcelado", "crédito", "débito", "pix", "boleto")
        private int numeroParcelas; // Número de parcelas (aplicável para pagamentos parcelados)
        private int diasEntreParcelas; // Dias entre as parcelas (aplicável para pagamentos parcelados)
        private boolean permiteTroco; // Indica se a  de pagamento permite troco
        private double taxaPercentual; // Taxa percentual aplicada ao pagamento
        private boolean ativo; // Indica se a  de pagamento está ativa

    public Pagamento(int id, String descricao, String tipo, int numeroParcelas, int diasEntreParcelas, boolean permiteTroco, double taxaPercentual, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.numeroParcelas = numeroParcelas;
        this.diasEntreParcelas = diasEntreParcelas;
        this.permiteTroco = permiteTroco;
        this.taxaPercentual = taxaPercentual;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getDiasEntreParcelas() {
        return diasEntreParcelas;
    }

    public void setDiasEntreParcelas(int diasEntreParcelas) {
        this.diasEntreParcelas = diasEntreParcelas;
    }

    public boolean isPermiteTroco() {
        return permiteTroco;
    }

    public void setPermiteTroco(boolean permiteTroco) {
        this.permiteTroco = permiteTroco;
    }

    public double getTaxaPercentual() {
        return taxaPercentual;
    }

    public void setTaxaPercentual(double taxaPercentual) {
        this.taxaPercentual = taxaPercentual;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Pagamento() {//Construtor vazio para colocar o proximo contrutor.
    }
    }





