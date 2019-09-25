package actividad;

import java.io.File;

/**
 * @author David Ros
 */
public class hilo3 extends Thread {
    
       File ruta = new File("ArchivoNuevo.txt");
    
        @Override
        public void run() {           
            HiloCrearFichero_V3 hilov3 = new HiloCrearFichero_V3();
            hilov3.leerFicheroEjem(ruta.toString());
        }      
}
