package actividad;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Raúl Grijota
 */
public abstract class HiloCrearFichero {
    
    public abstract String quitarEspaciosBlancos(String linea);

    public void crearFicheroEjem(String rutaFichero){
        String[] palabras = new String['Z' - 'A' + 1];
        Random r = new Random(new Date().getTime());
        for (char c = 'A'; c < 'Z'; c++) {
            int repe = 2 + Math.abs(r.nextInt()%8);
            palabras[c - 'A'] = "";
            for (int i = 0; i < repe; i++) {
                palabras[c - 'A'] += "" + c;
            }
        }

        FileWriter fich = null;
        try {
            fich = new FileWriter(rutaFichero, false);
            for (int i = 0; i < 10000000; i++) {
                if (r.nextInt(3) == 0) {
                    fich.write(palabras[r.nextInt(palabras.length-1)]);
                }
                if (r.nextInt(2) == 0) {
                    for (int j = 0; j < 10; j++) {
                        fich.write(" ");
                    }
                }
                if (r.nextInt(12) == 0) {
                    fich.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Otro tipo de error: " + e.getMessage());
        }finally{
            try {
                fich.close();
            } catch (IOException ex) {
                Logger.getLogger(HiloCrearFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void leerFicheroEjem(String rutaFich){
        File fich = new File(rutaFich);
        Scanner escaner = null;
        try {
            escaner = new Scanner(fich);
            while(escaner.hasNext()){
                String linea = escaner.nextLine();
                quitarEspaciosBlancos(linea);
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally{
            escaner.close();
        }
            
        
    }
    
    
}
