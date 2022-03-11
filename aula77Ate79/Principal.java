//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA77 MODIFICADOR FINAL PT01 - TIPO PRIMITIVO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA78 MODIFICADOR FINAL PT02 - TIPO REFERENCIA
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA79 MODIFICADOR FINAL PT03 - CLASSES E METODOS
package aula77Ate79;

public class Principal {
    
    public static void main(String[] args){
        
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Italia");
        ferrari.imprime();
    }
    
}
