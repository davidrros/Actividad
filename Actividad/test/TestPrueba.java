/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    Thread hilo1 = new Thread();
    Thread hilo2 = new Thread();
    Thread hilo3 = new Thread();
    
    
    hilo1.start();   
    hilo2.start();
    hilo3.start();
    
    
    
    
    }
}
