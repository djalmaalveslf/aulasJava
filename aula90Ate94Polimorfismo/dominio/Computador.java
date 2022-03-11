//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA90 POLIMORFISMO PT01 - INTRODUCAO
package aula90Ate94Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    
}
