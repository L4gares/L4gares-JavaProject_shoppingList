/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaControleVendas;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MenuControleProdutoCliente {
        
        
            
                
 public static void main(String[]args){
     
     
     
     Scanner userInput = new Scanner(System.in);

Estoque estoqueP = new Estoque(); //chamando o ArrayList estoque
CadastroClientes Ccliente = new CadastroClientes();//chamando o ArrayList CadastroClientes
AuxiliarClasse classaux = new AuxiliarClasse();//chamando classe auxiliar


     
     
     
     //CRIANDO PRODUTOS---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
        Produtos p1 = new Produtos(1, 1699.99, "Xbox One", 0);
        
        Produtos p2 = new Produtos(2, 4599.99, "Playstation 5", 15);
        
        Produtos p3 = new Produtos(3, 129.99, "Tabuleiro - Xadrez", 25);
        
        Produtos p4 = new Produtos(4, 4230.00, "celular Iphone X", 21);
        
        Produtos p5 = new Produtos(5, 30.00, "Garrafa d'agua", 27);
        
        
       
         
        
         //adicionando produtos no ArrayList
        estoqueP.getEstoqueProdutos().add(p1);                  
        estoqueP.getEstoqueProdutos().add(p2);      
        estoqueP.getEstoqueProdutos().add(p3); 
        estoqueP.getEstoqueProdutos().add(p4);
        estoqueP.getEstoqueProdutos().add(p5);
        
        
        
     //CRIANDO CLIENTES------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
        
        
        Clientes c1 = new Clientes(10, "Marcelo Caio Ribeiro", "marcelocaioribeiro_@runup.com.br", "senha1", "3ª Travessa Dom Pedro II", 1);
    
        Clientes c2 = new Clientes(11, "Vinicius Thomas Monteiro", "viniciusthomasmonteiro@unitower.com.br", "senha2", "Travessa Pedras Preciosas", 1);
    
        Clientes c3 = new Clientes(12, "Vera Tereza Peixoto", "veraterezapeixoto..veraterezapeixoto@anac.gov.br", "senha3", "Rua João Chalub", 2);
    
        Clientes c4 = new Clientes(13, "Elias Enzo Daniel da Mata", "eliasenzodanieldamata@origamieventos.com.br", "senha4", "Rua Enéas Martins", 3);
    
        Clientes c5 = new Clientes(14, "Vera Tereza Peixoto", "veraterezapeixoto..veraterezapeixoto@anac.gov.br", "senha5", "Rua João Chalub", 2);
        
        
        
        //adicionando clientes no ArrayList
        Ccliente.getClientesCadastroClientes().add(c1);
        Ccliente.getClientesCadastroClientes().add(c2);
        Ccliente.getClientesCadastroClientes().add(c3);
        Ccliente.getClientesCadastroClientes().add(c4);
        Ccliente.getClientesCadastroClientes().add(c5);
        
        
        
        
        //aadicionando clientes padroes na auxiliar
        classaux.clientesCadastrados.add(c1);
        classaux.clientesCadastrados.add(c2);
        classaux.clientesCadastrados.add(c3);
        classaux.clientesCadastrados.add(c4);
        classaux.clientesCadastrados.add(c5);
        
     
    /*INTERFACE MENU------------------------------------------------------------------------------------------------------------------------------------*/
 
        
    int n;
    
    System.out.println("MENU");
   System.out.println("1- Para iniciar como cliente\n" +
                      "2- Para iniciar como funcionario"); //feito
    n = userInput.nextInt();
          
     while(n != 0){
        
        
    if(n == 1){
        
     System.out.println("Selecione 1 para ver os produtos em estoque");
     
     System.out.println("1- Produtos em estoque"); 
      
     
     n = userInput.nextInt();
     
     if(n ==1){
         //mostrando produtos no array
         System.out.println("PRODUTOS DISPONIVEIS\n");
        
        estoqueP.mostrarProd();
        
        System.out.println("2- Comprar produtos");
        n = userInput.nextInt();
        
     if(n == 2){
         System.out.println("1- Ja sou cadastrado.\n"
                          + "2- Fazer meu cadastro.");
         
         n = userInput.nextInt();
         
     if(n == 1){
              
            System.out.println("Insira o codigo de cadastro:");
            
             classaux = Ccliente.loginCliente(classaux);
             
         
                 
         //codigo para identificar o produto e coloca-lo no carrinho
         System.out.println("Digite o codigo do produto desejado para adicionalo ao carrinho. ");
         
         
          classaux = estoqueP.adiciocarProdAoCarrinho(classaux);
     }         
     if(n == 2){
         //cliente fazendo o seu proprio cadastro
         Ccliente.CadastraCliente();
        }
     }
   
     }
         
    }else if(n == 2){
        
     System.out.println("Escolha uma das opcoes abaixo e confirme.\n");
     
     System.out.println("1- Cadastrar produto");
     System.out.println("2- Cadastrar clientes\n");
     
     System.out.println("3- Clientes cadastrados");
     System.out.println("4- Produtos cadastrados");
     
     n = userInput.nextInt();
     
     if(n == 1){
         //cadastrar produtos
         estoqueP.cadastrarProd();   
         
     }else if(n == 2){
         //cadastrar clientes
         Ccliente.CadastraCliente();
         
     }else if(n == 3){
         
        System.out.println("CLIENTES CADASTRADOS:");
            
            Ccliente.mostrarClienteC();
             
     }else if(n == 4){
         
          System.out.println("PRODUTOS CADASTRADOS NO ESTOQUE:\n");
        
               estoqueP.mostrarProd();
       
        
        
   }
    }
    
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("1- Para iniciar novamente como cliente");
         System.out.println("2- Para iniciar novamente como funcionario");
         System.out.println("0- Para finalizar");
         
         n = userInput.nextInt();
         
}
         
     
    }
          
} 


 
 
 
 
 
