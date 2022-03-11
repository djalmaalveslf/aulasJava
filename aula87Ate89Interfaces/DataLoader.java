//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA87 INTERFACES PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA88 INTERFACES PT02 - IMPLEMENTANDO MULTIPLAS INTERFACES
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA89 INTERFACES PT03 - ATRIBUTOS E METODOS ESTATICOS
package aula87Ate89Interfaces;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    
    public abstract void load(); //Por padrão no java todos os metodos são publicos e abstratos
    
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
