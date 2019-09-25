/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import actividad.HiloCrearFichero_V1;
import actividad.HiloCrearFichero_V2;
import actividad.HiloCrearFichero_V3;
import java.io.File;
import org.junit.Test;

/**
 *
 * @author Formacion
 */
public class Secuencial {
    
    public Secuencial() {
    }

    @Test
    public void secuencialmente(){
        File ruta = new File("ArchivoNuevo.txt");
        HiloCrearFichero_V1 hilo1 = new HiloCrearFichero_V1();
        hilo1.crearFicheroEjem(ruta.toString());
        hilo1.leerFicheroEjem(ruta.toString());
        
        HiloCrearFichero_V2 hilo2 = new HiloCrearFichero_V2();
        hilo2.leerFicheroEjem(ruta.toString());
        
        HiloCrearFichero_V3 hilo3 = new HiloCrearFichero_V3();
        hilo3.leerFicheroEjem(ruta.toString());
    }
}
