/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaControleVendas;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author daniel
 */
    public class CarrinhoDeCompras {
        
        
        
        //criando Array
        ArrayList <Produtos> produtosNoCarrinho = new ArrayList();
    

        public class Random1 {

            //instância um objeto da classe Random especificando a semente
            Random codCompras = new Random(19700621);
            
             void status(){
                System.out.println("Codigo da compra: " + this.codCompras);
                }

        public Random getCodCompras() {
            return codCompras;
        }

        public void setCodCompras(Random codCompras) {
            this.codCompras = codCompras;
        }            
             
    }
     
}
