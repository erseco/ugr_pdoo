/*  
 *  2017 © Copyleft - All Wrongs Reserved
 *
 *  Ernesto Serrano <info@ernesto.es>
 * 
 */
package modeloqytetet;

public class Sorpresa {
    
    private final String texto;
    private final TipoSorpresa tipo;
    private final int valor;
    
    public Sorpresa(String texto, int valor, TipoSorpresa tipo) {
        this.texto = texto;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    protected String getTexto() {
        return this.texto;
    }
    
    protected int getValor() {
        return this.valor;
    }

    protected TipoSorpresa getTipo() {
        return this.tipo;
    }
    
    @Override
    public String toString() {
        return "Sorpresa{" + "texto=" + texto + ", valor=" + Integer.toString(valor) + ", tipo=" + tipo + "}";
    }
    
}
