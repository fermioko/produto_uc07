package br.senac.sp.produto.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class ProdutoRequest {

    @NotBlank(message = "A descricao não pode estar em branco.")
    @Size(min = 5, max = 30, message = "A descricao deve ter entre 5 e 30 caracteres.")
    private String descricao;

    @NotNull(message = "O preço não pode ser nulo.")
    @Digits(integer = 10, fraction = 2, message = "O preço deve ter no máximo 10 dígitos inteiros e 2 dígitos decimais.")
    private BigDecimal preco;

    @NotNull(message = "A quantidade não pode ser nula.")
    @Min(value = 1, message = "A quantidade deve ser no mínimo 1.")
    @Max(value = 1000, message = "A quantidade deve ser no máximo 1000.")
    private Integer quantidade;

    @NotBlank(message = "O lote não pode estar vazio.")
    @Size(min = 3, max = 15, message = "O lote deve ter entre 3 e 15 caracteres.")
    @Pattern(regexp = "^[A-Za-z0-9-]+$", message = "O lote deve conter apenas letras, números e traços.")
    private String lote;
    @JsonProperty("codigo_barra")
    @NotBlank(message = "O código de barras não pode estar vazio.")
    @Size(min = 8, max = 50, message = "O código de barras deve ter entre 8 e 50 caracteres.")
    @Pattern(regexp = "^[0-9]+$", message = "O código de barras deve conter apenas números.")
    private String codigoBarra;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

}
