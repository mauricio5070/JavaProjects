/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatitos;

/**
 *
 * @author Laboratorios
 */
public class Gatitos {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        Gato g= new Gato();
        GatoCasero g1 = new GatoCasero("Gato Pedro");
        Gato [] gatos= new Gato[3];
        gatos[0]= g;
        gatos[1]= g1;
        gatos[2]= new GranGato();
        /*Felino[ gatos= new Felino[3;*/
        
        for(int i=0;i<gatos.length;i++){
            gatos[i].maullar();
            if (gatos[i] instanceof GatoCasero){
                ((GatoCasero)gatos[i]).ronronear();/*Dynamic casting*/
            }
            
        }
    
        
    }
    
}
