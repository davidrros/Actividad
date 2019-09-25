package actividad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alumno
 */
public class StringAux {

    public StringAux() {
    }
    
    
    private String string;

    public StringAux(String string) {
        this.string = string;
    }
    public String getString() {
        return string;
    }   
    public void setString(String string) {
        this.string = string;
    }
    public String quitarEspSobrantes() {
        return quitarEspSobrantes(string);
    }    
    public int contarPalabras() {
        return contarPalabras(string);
    }    
    
    public static String quitarEspSobrantesV1(String texto) {
        // Recorrer caracter a caracter quitando los sobrantes
        String result = "";
        texto = texto.trim();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                result += texto.charAt(i);
            } else if (i < texto.length() - 1){    // Si es ESP
                if (texto.charAt(i + 1) != ' ') 
                    result += ' ';
            }
        }
        return result;
    }
    public static String  quitarEspSobrantesV2(String texto) {
        texto = texto.trim();
        String[] palabras = texto.split(" ");
        String result = "";
        for (String palabra : palabras) {
            if ( ! palabra.isEmpty())
                result += palabra + " ";
        }
        return result.trim();
    }
    
    public static String  quitarEspSobrantesV3(String texto) {
        texto = texto.trim();
        
        while (texto.contains("  ")) {
            texto = texto.replace("  ", " ");
        }
        return texto;
    }
    public static String quitarEspSobrantes(String texto) {
        return texto.trim().replaceAll("\\s+", " ");
    }
    public static int contarPalabrasV1(String texto) {
        texto = texto.trim();
        if (texto.isEmpty())
            return 0;
        else
            return quitarEspSobrantes(texto).split(" ").length;
    }
    public static int contarPalabrasV2(String texto) {
        int contador = 1;
        texto = quitarEspSobrantes(texto);
        texto = texto.trim();
        if (texto.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == ' ' ) 
                    contador++;
            }
        }
        return contador;
    }
    public static int contarPalabras(String texto) {
        int contador = 1;
        
        texto = texto.trim();
        if (texto.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < texto.length() - 1; i++) {
                if (texto.charAt(i) == ' ' && texto.charAt(i + 1) != ' ') 
                    contador++;
            }
        }
        return contador;
    }
}

     
       
        
        
        
        
    





        
    


        
    
    
