//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA94 POLIMORFISMO PT05 - PROGRAMACAO ORIENTADA A INTERFACE
package aula90Ate94Polimorfismo.test;

import aula90Ate94Polimorfismo.repositorio.Repositorio;
import aula90Ate94Polimorfismo.servico.RepositorioArquivo;
import aula90Ate94Polimorfismo.servico.RepositorioBancoDeDados;
import aula90Ate94Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    
    public static void main(String[] args) {
        
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        
    }
    
}
