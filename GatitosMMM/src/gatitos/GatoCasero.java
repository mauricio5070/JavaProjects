package gatitos;


import gatitos.Gato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class GatoCasero extends Gato implements Felino {
   private Collar collarGato;
    public void ronronear(){
        System.out.println("Gato Casero: Prrrr.....gato casero");
    }
    public GatoCasero(String x){
        super(); /* Llama al constructor de la super clase. Se llama al principio de la subclase*/
        this.collarGato= new Collar(x);
        maullido= collarGato.getNombreCollar()+ ": prrMiauu!";
        /*Para mas especifidad mallar se podria expresar como super.maullido , para evitar ambiguedades*/
        /*Siendo nombreCollar public , se puede llamar de la siguiente forma: collarGato.NombreCollar*/
    }
    public void printDatos(){
      System.out.println("Nombre del gato:" + collarGato.getNombreCollar());  
    }
}
/* Protected ayuda a tener acceso a elementos de una superclase en una subclase*/