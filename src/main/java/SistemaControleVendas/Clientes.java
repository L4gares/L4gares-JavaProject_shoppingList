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
public class Clientes {
    int codigoCliente;
    String nomeCliente;
    String email;
    String senha;
    String endereco;
    int tipo;   
     Clientes() {
    }
     
    void cadastro(){
        System.out.println("Codigo do cliente: "+this.codigoCliente );
         System.out.println("Nome do cliente: "+this.nomeCliente);
         System.out.println("E-mail: "+this.email);
         System.out.println("Senha: "+this.senha);
         System.out.println("Endereco: "+this.endereco);
         System.out.println("Level do cliente: " + this.tipo);
    }

    public Clientes(int codigoCliente, String nomeCliente, String email, String senha, String endereco, int tipo) {
        this.codigoCliente = codigoCliente;
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
     public int gettipo() {
        return tipo;
    }

    public void settipo(String endereco) {
        this.tipo = tipo;
    }
    
    
}
