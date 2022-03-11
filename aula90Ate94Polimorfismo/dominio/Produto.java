//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA90 POLIMORFISMO PT01 - INTRODUCAO
package aula90Ate94Polimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;
    
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
}
