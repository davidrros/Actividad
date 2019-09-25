package actividad;

import java.io.File;
import java.util.Date;

/**
 * @author David Ros
 */
public class hilo2 extends Thread {
    
        File ruta = new File("ArchivoNuevo.txt");
        @Override
        public void run() {    
              long  tiempoHilos = new Date().getTime();
            HiloCrearFichero_V2 hilov2 = new HiloCrearFichero_V2();
            hilov2.leerFicheroEjem(ruta.toString());
             System.out.println("Tiempo hilo2 =  " + (new Date().getTime() - tiempoHilos));
        }                 

}
