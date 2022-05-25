/*
 *Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
 */
package ej2excepciones;

import Array.Array;


public class Ej2Excepciones {

    public static void main(String[] args) {
        Array a= new Array();
        
        try{
            a.llenarArray();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("EL INDICE " + e.getMessage() + " SE ENCUENTRA FUERA DE RANGO");
        }
    }
    
}
