/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import actividad.hilo1;
import actividad.hilo2;
import actividad.hilo3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestPrueba {
    
    public TestPrueba() {
    }

   
    @Test
    public void prueba() {
    
        
     hilo1 n = new hilo1();
     hilo2 y = new hilo2();
     hilo3 g= new hilo3();
    
    
  n.start();
  y.start();
  g.start();
    
    
    
    
    }
}