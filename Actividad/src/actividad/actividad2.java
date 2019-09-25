package actividad;
/**
 * @author David Ros
 */
public class actividad2 {

    
    public class hilo1 extends Thread{
             
        String linea;
        @Override
        public void run() {           
            StringAux.quitarEspSobrantesV1(linea);
        }                 
}
    
    public class hilo2 extends Thread{
   
        String linea;
        @Override
        public void run() {           
            StringAux.quitarEspSobrantesV2(linea);
        }                 
}
    public class hilo3 extends Thread{
   
        String linea;
        @Override
        public void run() {           
            StringAux.quitarEspSobrantesV3(linea);
        }                 
}
    
}

 
