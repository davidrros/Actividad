
package actividad;


/**@author Raúl Grijota
 */
public class HiloCrearFichero_V2 extends HiloCrearFichero{
    
    @Override
    public String quitarEspaciosBlancos(String linea) {
        return StringAux.quitarEspSobrantesV2(linea);
        
    }
}
