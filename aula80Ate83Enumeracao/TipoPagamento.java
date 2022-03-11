//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA82 ENUMERACAO PT03 - SOBRESCRITA DE METODOS
//CURSO DO CANAL DEVDOJO MARATONA JAVA - ORIENTAÇÃO OBJETOS - AULA83 ENUMERACAO PT04 - BUSCA POR ATRIBUTOS
package aula80Ate83Enumeracao;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
        
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
        
    };
    
    public abstract double calcularDesconto(double valor);
}
