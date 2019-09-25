
package actividad;



/**@author Raúl Grijota
 */
public class HiloCrearFichero_V3 extends HiloCrearFichero{
    
    @Override
    public String quitarEspaciosBlancos(String linea) {
        return StringAux.quitarEspSobrantesV3(linea);
        
    }
}
