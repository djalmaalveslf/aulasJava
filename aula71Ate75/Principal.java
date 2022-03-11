//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT01
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT02 - SUPER
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 03 - PROTECTED
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 04 - CONSTRUTORES
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - HERANÇA PT 05 - SEQUENCIA DE INICIALIZACAO
package aula71Ate75;

public class Principal {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        
        pessoa.imprime();
        
        System.out.println("-------------------------");
        
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        
        funcionario.imprime();
    }
}
