//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA80 ENUMERACAO PT01 - INTRODUCAO
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA81 ENUMERACAO PT02 - CONSTRUTORES E ATRIBUTOS
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA82 ENUMERACAO PT03 - SOBRESCRITA DE METODOS
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA83 ENUMERACAO PT04 - BUSCA POR ATRIBUTOS
package aula80Ate83Enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    
    private int valor;
    private String nomeRelatorio;
    
    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente: values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
    
}
