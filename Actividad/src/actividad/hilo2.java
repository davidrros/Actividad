package actividad;

import java.io.File;

/**
 * @author David Ros
 */
public class hilo2 extends Thread {
    
        File ruta = new File("ArchivoNuevo.txt");
        @Override
        public void run() {           
            HiloCrearFichero_V2 hilov2 = new HiloCrearFichero_V2();
            hilov2.leerFicheroEjem(ruta.toString());
        }                 

}
