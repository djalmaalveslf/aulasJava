//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT01
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT02 - SUPER
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 03 - PROTECTED
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 04 - CONSTRUTORES
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 05 - SEQUENCIA DE INICIALIZACAO
package aula71Ate75;

public class Pessoa {
    protected String nome;
    private String cpf;
    private Endereco endereco;
    
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
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }
    
    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa ");
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" - "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
