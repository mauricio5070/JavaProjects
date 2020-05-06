package gatitos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class Gato implements Felino{

    /**
     * @param args the command line arguments
     */
    
    /*private String maullido;*/
    protected String maullido;
    public  Gato(){
        maullido= "Miau!.....gato";
    }
    public void maullar(){
    System.out.println("Gato: " + maullido);
    }
 
    
}

/* Protected ayuda a tener acceso a elementos de una superclase en una subclase*/