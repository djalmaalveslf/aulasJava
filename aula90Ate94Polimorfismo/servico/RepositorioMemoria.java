//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA94 POLIMORFISMO PT05 - PROGRAMACAO ORIENTADA A INTERFACE
package aula90Ate94Polimorfismo.servico;

import aula90Ate94Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
