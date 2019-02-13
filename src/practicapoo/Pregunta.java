
package practicapoo;

import java.io.Serializable;

public class Pregunta implements Serializable {
    //Declaracion de variables
    private int id;
    private Pelicula pelicula;
    private int ptos_j1;
    private int ptos_j2;
    
    //Constructores
    
    public Pregunta (){
        this.id = 0;
        this.pelicula = new Pelicula();
        this.ptos_j1 = 0;
        this.ptos_j2 = 0;
    }
    
    public Pregunta (int id, Pelicula pelicula, int ptos_j1, int ptos_j2){
        this.id = id;
        this.pelicula = pelicula;
        this.ptos_j1 = ptos_j1;
        this.ptos_j2 = ptos_j2;
        
    }
    
    public Pregunta (Pregunta p){
        this.id = p.getId();
        this.pelicula = p.getPelicula();
        this.ptos_j1 = p.getPtos_j1();
        this.ptos_j2 = p.getPtos_j2();
    }
    
    //GET
    
    public int getId(){
        return id;
    }
    
    public Pelicula getPelicula(){
        return pelicula;
    }
    
    public int getPtos_j1(){
        return ptos_j1;
    }
    
    public int getPtos_j2(){
        return ptos_j2;
    }
    
    //SET
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setPelicula(Pelicula pelicula){
        this.pelicula = pelicula;
    }
    
    public void setPtos_j1(){
        this.ptos_j1 = ptos_j1;
    }
    
    public void setPtos_j2(){
        this.ptos_j2 = ptos_j2;
    }
    
}
