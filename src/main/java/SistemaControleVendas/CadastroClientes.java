/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaControleVendas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class CadastroClientes {
    
    //criando array
    ArrayList <Clientes> clientesCadastrados = new ArrayList();
    
    //pegando valores do objeto Cliente
     public ArrayList<Clientes>  getClientesCadastroClientes(){
        return clientesCadastrados;
    }
     
     //Adicionando objeto Cliente no Array de 'N' posicoes
    public void setClientesCadastroClientes(ArrayList<Clientes> clientesCadastrados) {
        this. clientesCadastrados = clientesCadastrados ;
    }
    
   
    Scanner userInput = new Scanner(System.in);
     
    public void CadastraCliente(){
    int codigCli = 0;
    String nomCli = null;
    String emailCli = null;
    String senhaCli = null;
    String enderecoCli = null;
    int tipoCli = 0;
    
        System.out.println("Digite o codigo do cliente:");
        codigCli = userInput.nextInt();
            
        for(int i = 0; i < clientesCadastrados.size(); ++i){
         if(clientesCadastrados.get(i).getCodigoCliente() == codigCli){
             System.out.print("!!Este codigo ja se encontra em nosso cadastro!!.\n"
                              + " certifique-se de que o codigo esta correto e insira-o novamente.\n"
                              + "--> ");
             codigCli  = userInput.nextInt();      
             
         }
        }
            System.out.println("Nome: ");
            nomCli = userInput.next();
            
            System.out.println("E-mail: ");
            emailCli = userInput.next();
            
            System.out.println("Senha: ");
            senhaCli = userInput.next();
            
            System.out.println("Endereco: ");
            enderecoCli = userInput.next();
            
             System.out.println("Level: ");
             tipoCli = userInput.nextInt();
            
            Clientes clienteCadastrado = new Clientes(codigCli, nomCli, emailCli, senhaCli, enderecoCli, tipoCli);
            clientesCadastrados.add(clienteCadastrado);
    
    }
    public void mostrarClienteC(){
        for(int i = 0; i < clientesCadastrados.size(); ++i){
        System.out.println("Codigo do cliente: "+clientesCadastrados.get(i).getCodigoCliente());
         System.out.println("Nome do cliente: "+clientesCadastrados.get(i).getNomeCliente());
         System.out.println("E-mail: "+clientesCadastrados.get(i).getEmail());
         System.out.println("Senha: "+clientesCadastrados.get(i).getSenha());
         System.out.println("Endereco: "+clientesCadastrados.get(i).getEndereco());
         System.out.println("Level: "+clientesCadastrados.get(i).gettipo());
         
         System.out.println();
         System.out.println("---------------------------------------------------------------------\n");
        }
    }
    
    
    
    
   
    
    AuxiliarClasse loginCliente (AuxiliarClasse auxiliar){
        
        Clientes clienteAux = new Clientes();
                    
        System.out.print("-");
        
        int codClientAux = userInput.nextInt();
        codClientAux--;
        
        auxiliar.codSelecionado = codClientAux;
                
        
        clienteAux = clientesCadastrados.get(codClientAux);
        
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println("Cliente selecionado: ");
         System.out.println();
         System.out.println("Nome: " +clienteAux.nomeCliente );
         System.out.println("E-mail: : " + clienteAux.email);
         System.out.println("Endereco: " + clienteAux.endereco);
         System.out.println("Level: " + clienteAux.tipo);
         System.out.println();
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println();
        return auxiliar;
       
        
         
    
    }
}
