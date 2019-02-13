package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Peliculas implements Serializable{
    //Declaracion de variables
    
    ArrayList <Pelicula> lista_Peliculas;
    
    //Constructores
    
    public Peliculas(){
        lista_Peliculas = new ArrayList<Pelicula>();
    }
    
    public Peliculas(ArrayList lista_Peliculas){
        this.lista_Peliculas = lista_Peliculas;
    }
    
    public Peliculas(Peliculas lista_Peliculas){
        this.lista_Peliculas = lista_Peliculas.getLista_Peliculas();
    }
    
    //GET
    public ArrayList<Pelicula> getLista_Peliculas(){
        return lista_Peliculas;
    }
    //SET
    public void setLista_Peliculas(ArrayList<Pelicula> lista_Peliculas){
        this.lista_Peliculas = lista_Peliculas;
    }
}
