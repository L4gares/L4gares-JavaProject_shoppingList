/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaControleVendas;

/**
 *
 * @author danie
 */



public class Produtos {
    
    private int codigoProduto;
    private double preco;
    private String nomeProduto;
    private int quantidadeEstoque;
    

    Produtos() {
    }
     
    void status(){
         System.out.println("Codigo do produto: "+this.codigoProduto );
         System.out.println("Preco do produto: R$ "+this.preco);
         System.out.println("Nome do produto: "+this.nomeProduto);
         System.out.println("Quantidade do produto no estoque: "+this.quantidadeEstoque);
    }
            

    public Produtos(int codigoProduto, double preco, String nomeProduto, int quantidadeEstoque) {
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        
    }

    
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
          
    }
     

