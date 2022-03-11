//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA84 CLASSES ABSTRATAS PT01
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA85 CLASSES ABSTRATAS PT02 - METODOS ABSTRATOS
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA86 CLASSES ABSTRATAS PT03 - METODOS ABSTRATOS REGRAS
package aula84Ate86ClassesAbstratas;

public class Principal {
    
    public static void main(String[] args){
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
    
}