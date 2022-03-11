//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA90 POLIMORFISMO PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA92 POLIMORFISMO PT03 - PARÂMETROS POLIMÓRFICOS
package aula90Ate94Polimorfismo.test;

import aula90Ate94Polimorfismo.dominio.Computador;
import aula90Ate94Polimorfismo.dominio.Televisao;
import aula90Ate94Polimorfismo.dominio.Tomate;
import aula90Ate94Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    
    public static void main(String[] args) {
        
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
