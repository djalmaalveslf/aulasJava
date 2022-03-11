//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA90 POLIMORFISMO PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA92 POLIMORFISMO PT03 - PARÂMETROS POLIMÓRFICOS
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA93 POLIMORFISMO PT04 - CAST E INSTANCEOF
package aula90Ate94Polimorfismo.servico;

import aula90Ate94Polimorfismo.dominio.Produto;
import aula90Ate94Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        
        if (produto instanceof Tomate) {
            //Existem varias formas de se utilizar o cast aqui estão umas delas
            
            /*Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());*/
            
            //System.out.println(((Tomate) produto).getDataValidade());
            
            String dataValidade = ((Tomate) produto).getDataValidade();
            
            System.out.println("Data de validade: " + dataValidade);
        }
    }
}
