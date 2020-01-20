package br.edu.ifal.model;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private Produto produto;
    private double valorMinimo;
    private List<Cliente> cliente;
    private List<Lance> lance;

    public Leilao(Produto produto, double valorMinimo) {
        this.produto = produto;
        this.valorMinimo = valorMinimo;
        this.cliente = new ArrayList<>();
        this.lance = new ArrayList<>();
    }

    public Produto getProduto() {
        return produto;
    }
    public double getValorMinimo() {
        return valorMinimo;
    }
    public List<Cliente> getCliente() {
        return cliente;
    }
    public List<Lance> getLance() {
        return lance;
    }  

    public void adicionarCliente(Cliente cliente){
        this.cliente.add(cliente);
    }
    public void adicionarLance(Lance lance){
        this.lance.add(lance);
    }
}