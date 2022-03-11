//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA91 POLIMORFISMO PT02 - FUNCIONAMENTO 
package aula90Ate94Polimorfismo.test;

import aula90Ate94Polimorfismo.dominio.Computador;
import aula90Ate94Polimorfismo.dominio.Produto;
import aula90Ate94Polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    
    public static void main(String[] args){
        
        Produto produto = new Computador("Ryzen 9", 3000);
        
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------");
        
        Produto produto2 = new Tomate("Americano", 20);
        
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        
        
    }
    
}
