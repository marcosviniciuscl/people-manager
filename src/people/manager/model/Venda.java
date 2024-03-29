/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people.manager.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import people.manager.controller.ControllerProduto;

/**
 *
 * @author marcos
 */
public class Venda {

    private Integer id;
    private Calendar data;
    private String comentario;
    private Integer idCliente;
    private Integer idVendedor;
    private String formaPagamento;
    private ArrayList<Produto> produtos;
    private Double valorVenda;
    private Double valorRecebido;
    private Double valorTroco;
    private String estado;

    /**
     *
     * @param id
     * @param data
     * @param comentario
     * @param idCliente
     * @param idVendedor
     * @param produtos
     * @param valorVenda
     * @param formaPagamento
     * @param valorRecebido
     * @param valorTroco
     * @param estado
     */
    public Venda(int id, Calendar data, String comentario, Integer idCliente, Integer idVendedor, ArrayList produtos, Double valorVenda, String formaPagamento, Double valorRecebido, Double valorTroco, String estado) {
        this.id = id;
        this.data = data;
        this.comentario = comentario;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.produtos = produtos;
        this.valorVenda = valorVenda;
        this.formaPagamento = formaPagamento;
        this.valorTroco = valorTroco;
        this.valorRecebido = valorRecebido;
        this.estado = estado;
    }

    public String getNomesProdutos() {
        String prod = "";
        for (Produto object : produtos) {
            prod += object.getNome() + ", ";
        }
        return prod.substring(0, prod.length()-2);
    }

    private String calendarParaString(Calendar calendar) {
        if (calendar == null) {
            return "NULO";
        }
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return s.format(calendar.getTime());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public String getDataString() {
        return this.calendarParaString(data);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(Double valorTroco) {
        this.valorTroco = valorTroco;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList produtos) {
        this.produtos = produtos;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

}
