//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA78 MODIFICADOR FINAL PT02 - TIPO REFERENCIA
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA79 MODIFICADOR FINAL PT03 - CLASSES E METODOS
package aula77Ate79;

public class Comprador {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nome=" + nome + '}';
    }
    
}
