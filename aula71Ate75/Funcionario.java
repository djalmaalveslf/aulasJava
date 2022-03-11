//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT01
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT02 - SUPER
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 03 - PROTECTED
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 04 - CONSTRUTORES
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 05 - SEQUENCIA DE INICIALIZACAO
package aula71Ate75;

public class Funcionario extends Pessoa{
    private double salario;
    
    //0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai(é executado apenas 1 vez)
    //1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha(é executado apenas 1 vez)
    //2 - Alocado espaço na memoria para o objeto da super classe que sera criado
    //3 - Cada atributo de super classe é criado e inicializado com seus valores default ou valores que nos colocamos da classe pai
    //4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    //5 - O construtor da super classe é executado
    //6 - Alocado espaço na memoria para o objeto da sub classe que sera criado
    //7 - Cada atributo de sub classe é criado e inicializado com seus valores default ou valores que nos colocamos da classe filha
    //8 - Bloco de inicialização da super classe é executado na ordem em que aparece
    //9 - O construtor da sub classe é executado
    
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    
    public void relatorioPagamento(){
        System.out.println("Eu: "+this.nome+" recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}//ESTAVA ASSISTINDO A AULA 58 DE CONSTRUTORES. Estou assistindo por causa do this. APRENDI O USO DO THIS NOS CONTRUTORES
//Na aula 74 de Heranca pt04 de contrutores estou no minuto 02:30
