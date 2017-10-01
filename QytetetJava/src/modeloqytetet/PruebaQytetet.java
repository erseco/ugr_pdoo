/*  
 *  2017 © Copyleft - All Wrongs Reserved
 *
 *  Ernesto Serrano <info@ernesto.es>
 * 
 */
package modeloqytetet;

import java.util.ArrayList;

public class PruebaQytetet {
    
    private static final ArrayList<Sorpresa> mazo = new ArrayList();

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        inicializarSorpresas();

        System.out.println("Listado 1");
        for (Sorpresa sorpresa : mazo) {
            System.out.println(sorpresa.toString());
        }
        
        System.out.println("Listado 2");
        for (Sorpresa sorpresa : getGreaterThanZero()) {
            System.out.println(sorpresa.toString());
        }
        
        System.out.println("Listado 3");
        for (Sorpresa sorpresa : getByTipoIRACASILLA()) {
            System.out.println(sorpresa.toString());
        }
        
        System.out.println("Listado 4");
        for (Sorpresa sorpresa : getByTipo(TipoSorpresa.PORCASAHOTEL)) {
            System.out.println(sorpresa.toString());
        }

    }
        
    private static void inicializarSorpresas() {
        mazo.add(new Sorpresa ("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carcel!", 9, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa.SALIRCARCEL));
        mazo.add(new Sorpresa ("Test 1", 1, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Test 2", 2, TipoSorpresa.PORCASAHOTEL));
    }
    
    
    private static ArrayList<Sorpresa> getGreaterThanZero() {
        ArrayList<Sorpresa> result = new ArrayList();
        for (Sorpresa sorpresa : mazo) {    
            if (sorpresa.getValor() > 0) {
                result.add(sorpresa);
            }
        }
        return result;
    }
    
    private static ArrayList<Sorpresa> getByTipoIRACASILLA() {
        return getByTipo(TipoSorpresa.IRACASILLA);
    }
    
    private static ArrayList<Sorpresa> getByTipo(TipoSorpresa tipo) {
        ArrayList<Sorpresa> result = new ArrayList();
        for (Sorpresa sorpresa : mazo) {    
            if (sorpresa.getTipo() == tipo) {
                result.add(sorpresa);
            }
        }
        return result;
    }
    
}
