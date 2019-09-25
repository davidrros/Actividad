/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import actividad.HiloCrearFichero_V1;
import actividad.HiloCrearFichero_V2;
import actividad.HiloCrearFichero_V3;
import java.io.File;
import java.util.Date;
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
        long  tiempoHilos = new Date().getTime();
        File ruta = new File("ArchivoNuevo.txt");
        long  tiempoHilos1= new Date().getTime();
        HiloCrearFichero_V1 hilo1 = new HiloCrearFichero_V1();
        //hilo1.crearFicheroEjem(ruta.toString());
        hilo1.leerFicheroEjem(ruta.toString());
        System.out.println("Tiempo que tarda l =  " + (new Date().getTime() - tiempoHilos1));

        
        tiempoHilos1= new Date().getTime();
        HiloCrearFichero_V2 hilo2 = new HiloCrearFichero_V2();
        hilo2.leerFicheroEjem(ruta.toString());
        System.out.println("Tiempo que tarda 2 =  " + (new Date().getTime() - tiempoHilos1));
        
        tiempoHilos1= new Date().getTime();
        HiloCrearFichero_V3 hilo3 = new HiloCrearFichero_V3();
        hilo3.leerFicheroEjem(ruta.toString());
        System.out.println("Tiempo que tarda 3 =  " + (new Date().getTime() - tiempoHilos1));
        System.out.println("Tiempo que tardan los hilos secuencial =  " + (new Date().getTime() - tiempoHilos));
    }
}
