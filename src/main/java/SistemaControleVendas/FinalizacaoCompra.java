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
public class FinalizacaoCompra {
    
    
   
    
    AuxiliarClasse finalizarComprar(AuxiliarClasse auxiliar){
       
       
        double valorFinal = 0;
        double desconto;
        double finalValor;
    
     
        for(int a = 0; a < auxiliar.aaa.produtosNoCarrinho.size(); a++){
            valorFinal += auxiliar.aaa.produtosNoCarrinho.get(a).getPreco();
        }
        
        
        
        System.out.println(valorFinal);
        
        int lvl = 0;
   
        lvl = auxiliar.clientesCadastrados.get(auxiliar.codSelecionado).tipo;
        
        switch (lvl){
            
        case 1:{    System.out.println();
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    desconto = 0.30f;
                    System.out.println("Cliete nivel Platinium!");
                    System.out.println("Voce tem 30% de Desconto em sua compra!");
                    System.out.println("");
                
                    finalValor = valorFinal - (valorFinal * desconto);
                    System.out.println("Valor total da sua compra: R$" + finalValor);
                    System.out.println("");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                }   


                case 2:{
                     System.out.println();
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    desconto = 0.20f;
                    System.out.println("Cliete nivel Ouro!");
                    System.out.println("Voce tem 20% de Desconto em sua compra!");
                    System.out.println("");
                    finalValor = valorFinal - (valorFinal * desconto);
                    System.out.println("Valor total da sua compra: R$" + finalValor);
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println();
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    desconto = 0.10f;
                    System.out.println("Cliete nivel Prata!");
                    System.out.println("Voce tem 10% de Desconto em sua compra!");
                    System.out.println("");
                    finalValor = valorFinal - (valorFinal * desconto);
                    System.out.println("Valor total da sua compra: R$" + finalValor);
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                }
                default:{
                    System.out.println("Tipo de Cliente Inválido!");
                    break;
                }
            
            
            
        
        
    }
        return auxiliar;
    
}
}