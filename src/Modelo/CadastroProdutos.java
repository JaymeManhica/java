/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MANHICA
 */
public class CadastroProdutos {
    private String nomeProduto;
    private int Id;
    private String marca;
    private String modelo;
    private String referenciaPeca;
    private int anoFabrico;
    private double valorDeCompra;
    private double valorDeVenda;
    private int Quantidade;
    

    public CadastroProdutos(String nomeProduto, int Id, String marca, String modelo, String referenciaPeca, int anoFabrico, double valorDeCompra, double valorDeVenda, int Quantidade) {
        this.nomeProduto = nomeProduto;
        this.Id = Id;
        this.marca = marca;
        this.modelo = modelo;
        this.referenciaPeca = referenciaPeca;
        this.anoFabrico = anoFabrico;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
        this.Quantidade = Quantidade;
    }

    public CadastroProdutos() {
    }

    
    
    
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getReferenciaPeca() {
        return referenciaPeca;
    }

    public void setReferenciaPeca(String referenciaPeca) {
        this.referenciaPeca = referenciaPeca;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    
    
    
}
