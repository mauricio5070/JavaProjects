/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class Logica {
static public String ConvertirFC(String dato){
   String respuesta="";
    try{  
       
   float resultado=(Float.parseFloat(dato));
   resultado= (float)((resultado-32)/1.8);
   respuesta= resultado+ "°C";
    }
   catch(NumberFormatException e){
       respuesta=e.toString();
   }
   return respuesta;
     
}

static public String ConvertirCF(String dato){
   String respuesta="";
    try{  
       
   float resultado=(Float.parseFloat(dato));
   resultado= (float)((resultado* 1.8) + 32);
   respuesta= resultado+ "°F";
    }
   catch(NumberFormatException e){
       respuesta=e.toString();
   }
   return respuesta;
     
}
}

