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
public class Estoque {
    
   //criando Array
    ArrayList <Produtos> estoqueProdutos = new ArrayList();

    
    //pegando o valor do objeto produto
    public ArrayList<Produtos> getEstoqueProdutos() {
        return estoqueProdutos;
    }
    
    //Adicionando objeto produto no Array de 'N' posicoes
    public void setEstoqueProdutos(ArrayList<Produtos> estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    
    
    Scanner userInput = new Scanner(System.in);
    //cadastrar produtos
   public void cadastrarProd(){
     int codigoP = 0;
     double preco = 0;
     String nomeP = null;
     int quantidadeEsto = 0;
     System.out.println("Digite o codigo do produto");
     codigoP = userInput.nextInt();
     
    
         
     
     for(int i = 0; i < estoqueProdutos.size(); ++i){
         if(estoqueProdutos.get(i).getCodigoProduto() == codigoP){
             System.out.print("!!Este codigo ja se encontra em nosso estoque!!.\n"
                              + " certifique-se de que o codigo esta correto e insira-o novamente.\n"
                              + "--> ");
             codigoP = userInput.nextInt();
             
         }
     }
       System.out.println("Digite o nome do produto: ");
       nomeP = userInput.next();
       
       System.out.println("Digite o preco do produto: ");
       preco = userInput.nextDouble();
       
       System.out.println("Digite a quantidade de produtos: ");
       quantidadeEsto = userInput.nextInt();
       
       Produtos produtoCadastrado = new Produtos(codigoP, preco, nomeP, quantidadeEsto);
       estoqueProdutos.add(produtoCadastrado);
     
   
   
   
   }
   //metodo para printar os produtos que estao no array
   public void mostrarProd(){
       
       for(int i = 0; i < estoqueProdutos.size(); ++i){
         System.out.println("Codigo do produto: "+estoqueProdutos.get(i).getCodigoProduto() );
         System.out.println("Preco do produto: R$ "+estoqueProdutos.get(i).getPreco());
         System.out.println("Nome do produto: "+estoqueProdutos.get(i).getNomeProduto());
         System.out.println("Quantidade do produto no estoque: "+estoqueProdutos.get(i).getQuantidadeEstoque());
         
         if(estoqueProdutos.get(i).getQuantidadeEstoque() == 0){
                //System.out.println(estoqueProdutos.get(i).getQuantidadeEstoque()+" Produtos em estoque.");
                System.out.println("!!!!Infelizmente o produto nao esta disponivel no momento!!!!\n");
            }else{
                //System.out.println(estoqueProdutos.get(i).getQuantidadeEstoque()+" Produtos em estoque.");
                System.out.println("Produto disponivel!!\n");}
                
         System.out.println();
         System.out.println("---------------------------------------------------------------------\n");
       }
   }
        
    
     AuxiliarClasse adiciocarProdAoCarrinho(AuxiliarClasse auxiliar){
        
        Produtos prodAux = new Produtos();
        
        String res = null;
        
        do{
            
        System.out.print("Codigo: ");
        System.out.println();
        int codProdAux = userInput.nextInt();
        codProdAux--;
        
        prodAux = estoqueProdutos.get(codProdAux);
        
        
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println("Produto selecionado: ");
         System.out.println();
         System.out.println("Codigo do produto: " + prodAux.getCodigoProduto() );
         System.out.println("Preco do produto: R$ " + prodAux.getPreco());
         System.out.println("Nome do produto: " + prodAux.getNomeProduto());
         System.out.println("Quantidade do produto no estoque: " + prodAux.getQuantidadeEstoque());
         System.out.println();
         System.out.println("---------------------------------------------------------------------------------------------------");
         System.out.println();
        
       
             
             System.out.println("Deseja adicionar o produto ao carrinho? \n"
                         + "Digite 'sim' para adicinar outro produto ou 'nao' para adicionar somente esse e finalizar a compra: ");
        
                res = userInput.next();
       
                if(res.equalsIgnoreCase("nao")){
                auxiliar.aaa.produtosNoCarrinho.add(prodAux);
                }   
                      
                                
        }while(res.equalsIgnoreCase("sim"));
        auxiliar.aaa.produtosNoCarrinho.add(prodAux);
        
        FinalizacaoCompra comprafinal = new FinalizacaoCompra();
        
         auxiliar = comprafinal.finalizarComprar(auxiliar);
        
          
        return auxiliar;
        
     }
}