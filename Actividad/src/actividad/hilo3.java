package actividad;

import java.io.File;
import java.util.Date;

/**
 * @author David Ros
 */
public class hilo3 extends Thread {
    
       File ruta = new File("ArchivoNuevo.txt");
    
        @Override
        public void run() {      
                 long  tiempoHilos = new Date().getTime();
            HiloCrearFichero_V3 hilov3 = new HiloCrearFichero_V3();
            hilov3.leerFicheroEjem(ruta.toString());
             System.out.println("Tiempo hilo3 =  " + (new Date().getTime() - tiempoHilos));
        }      
}
