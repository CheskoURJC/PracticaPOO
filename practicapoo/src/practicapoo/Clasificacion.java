
package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Clasificacion implements Serializable {
    
    //Declaracion de variables
    
    private ArrayList<Item> clasificacion;
    
    //Constructores
    
    public Clasificacion (){        
        this.clasificacion = new ArrayList<Item>();    
    }
    
    public Clasificacion (ArrayList ranking){
        this.clasificacion = ranking;
    }
    
    public Clasificacion (Usuarios u){
        this.clasificacion = u.getRanking().getLista_Items();
    }
    
    public Clasificacion (Clasificacion c){
        this.clasificacion = c.getLista_Items();
    }
    
    //GET
   
    public ArrayList<Item> getLista_Items(){
        return clasificacion;
    }
    
     //SET
     
    public void setLista_Items (ArrayList<Item> clasificacion){
            this.clasificacion = clasificacion;
    }
    
   
}
