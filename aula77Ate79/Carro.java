//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA77 MODIFICADOR FINAL PT01 - TIPO PRIMITIVO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA78 MODIFICADOR FINAL PT02 - TIPO REFERENCIA
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA79 MODIFICADOR FINAL PT03 - CLASSES E METODOS
package aula77Ate79;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    
    public final void imprime(){
        System.out.println(this.nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
