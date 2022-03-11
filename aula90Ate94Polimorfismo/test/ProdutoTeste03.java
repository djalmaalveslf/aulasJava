//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA93 POLIMORFISMO PT04 - CAST E INSTANCEOF
package aula90Ate94Polimorfismo.test;

import aula90Ate94Polimorfismo.dominio.Computador;
import aula90Ate94Polimorfismo.dominio.Produto;
import aula90Ate94Polimorfismo.dominio.Tomate;
import aula90Ate94Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    
    public static void main(String[] args){
        
        Produto produto = new Computador("Ryzen 9", 3000);
        
        Tomate tomate = new Tomate("Americano", 20);        
        tomate.setDataValidade("11/12/2021");
        
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
    
}
