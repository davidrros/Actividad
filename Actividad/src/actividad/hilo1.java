package actividad;

import java.io.File;

/**
 * @author David Ros
 */
public class hilo1 extends Thread{
    
     File ruta = new File("ArchivoNuevo.txt");
     @Override
        public void run() {   
            
            HiloCrearFichero_V1 hilov1 = new HiloCrearFichero_V1();
            hilov1.crearFicheroEjem(ruta.toString());
            hilov1.leerFicheroEjem(ruta.toString());
        }                 
    }


                  


