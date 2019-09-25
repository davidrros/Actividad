package actividad;

import java.io.File;

/**
 * @author David Ros
 */
public class actividad2 {
    
     File ruta = new File("ArchivoNuevo.txt");

    
    public class hilo1 extends Thread{
        
       
             
        
        @Override
        public void run() {     
            HiloCrearFichero_V1 hilo1 = new HiloCrearFichero_V1();
            hilo1.leerFicheroEjem(ruta.toString());
        }                 
}
    
    public class hilo2 extends Thread{
   
        String linea;
        @Override
        public void run() {           
            HiloCrearFichero_V2 hilo2 = new HiloCrearFichero_V2();
            hilo2.leerFicheroEjem(ruta.toString());
        }                 
}
    public class hilo3 extends Thread{
   
        String linea;
        @Override
        public void run() {           
            HiloCrearFichero_V3 hilo3 = new HiloCrearFichero_V3();
            hilo3.leerFicheroEjem(ruta.toString());
        }                 
}
    
}

 
