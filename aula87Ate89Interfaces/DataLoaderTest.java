//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA87 INTERFACES PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA88 INTERFACES PT02 - IMPLEMENTANDO MULTIPLAS INTERFACES
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA89 INTERFACES PT03 - ATRIBUTOS E METODOS ESTATICOS
package aula87Ate89Interfaces;

public class DataLoaderTest {
    
    public static void main(String[] args) {
        
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        
        databaseLoader.load();
        fileLoader.load();
        
        databaseLoader.remove();
        fileLoader.remove();
        
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
    
}
