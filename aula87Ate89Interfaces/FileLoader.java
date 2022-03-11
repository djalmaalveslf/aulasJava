//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA87 INTERFACES PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA88 INTERFACES PT02 - IMPLEMENTANDO MULTIPLAS INTERFACES
package aula87Ate89Interfaces;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
    
    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }
    
    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no arquivo");
    }
}
