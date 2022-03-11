//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA92 POLIMORFISMO PT03 - PARÂMETROS POLIMÓRFICOS
package aula90Ate94Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    
}//PAREI NA AULA 93 ESTUDAR DEPOIS
