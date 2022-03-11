//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA84 CLASSES ABSTRATAS PT01
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA85 CLASSES ABSTRATAS PT02 - METODOS ABSTRATOS
package aula84Ate86ClassesAbstratas;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void calculaBonus(){
        this.salario = this.salario + this.salario * 0.2;
    }
    
    @Override
    public String toString(){
        return "Gerente{" + "nome=" + nome + ", salario=" + this.salario + '}';
    }
}
