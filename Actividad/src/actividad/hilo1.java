package actividad;

import java.io.File;
import java.util.Date;
import java.util.Observable;


/**
 * @author David Ros
 */
public class hilo1 extends Thread{
    
     File ruta = new File("ArchivoNuevo.txt");
     
     @Override
        public void run() {   
            long  tiempoHilos = new Date().getTime();
            HiloCrearFichero_V1 hilov1 = new HiloCrearFichero_V1();
         //   hilov1.crearFicheroEjem(ruta.toString());
            hilov1.leerFicheroEjem(ruta.toString());
             System.out.println("Tiempo hilo1 = " + (new Date().getTime() - tiempoHilos));
        }                 


}


                  


