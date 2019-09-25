package actividad;



//import clasesjava.StringAux;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author David Ros
 */
public class HiloFicher {
     static HiloFichero1 hilo1;

    public void crearFicherosEjem(String rutaFich){
        
        
        
        String[] palabras = new String['Z' - 'A'];
        Random r = new Random(new Date().getTime());
        
        for(char c ='A';c < 'Z'; c++){
            
            int repe = 2 +r.nextInt() % 8 ; //Numero entre 2 y 9
            palabras[c - 'A'] = "";
            for(int i = 0;i< repe;i++){
                palabras[c - 'A']+= "" + c;            }
       
    }
        System.out.println(" > " + Arrays.toString(palabras));
        
        //////CREAR FICHERO
        
        FileWriter fich = null;
        try{
            fich = new FileWriter(rutaFich, false);
            for (int i=0; i<100000; i++){
                if(r.nextInt(3)==0)
                fich.write(palabras [r.nextInt(palabras.length)]);
               if(r.nextInt(2)==0)
                for(int j =0; j<10; j++){
                    fich.write(" ");
                if(r.nextInt(12)==0)
                    fich.write("\n\r");
                }
            }
            
        }catch(IOException ex){
            System.err.println("Error en escritura: " + ex.getMessage());
            
        }catch(Exception ex){
            System.err.println("Error en escritura: " + ex.getMessage());
        }finally
        {
            try {
                fich.close();
            } catch (IOException ex) {
                Logger.getLogger(HiloFicher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        
        
        
}
    
    public static String pasarMetodo(String lineaFinal){
        
        return lineaFinal;
    }
    //LEER FICHEROS
    
    public void leerFicherosEjem(String rutaFich){
        File fich = new File(rutaFich);
        Scanner escaner = null;
        
        try{
            escaner = new Scanner(fich);
            while(escaner.hasNextLine()){
                String linea = escaner.nextLine();
                StringAux stsAux = new StringAux(linea);
               
                System.out.println(pasarMetodo(linea));
            }
        }catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }finally
        {
            try {
                if (escaner!= null){
                    escaner.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(HiloFicher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
}
