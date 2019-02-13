
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
    //METODOS
    /*añadirPelicula(Pelicula)
      verInfoPeliculas()*/
    
    //METODOS ADICIONALES
    
    public Peliculas copiaListaPeliculas(){ 
        Peliculas p = new Peliculas (this);
        return p;
    }
      
    public boolean EsLista_PeliculasVacia(){ 
        return this.lista_Peliculas.isEmpty();
    }
    
    public boolean existePelicula(String titulo) throws NoEncontradoException{
        boolean encontrado = false;
        for (Pelicula p:this.lista_Peliculas){
            if (p.getTitulo().equals(titulo))
                encontrado = true;
        }
        if (!encontrado) throw new NoEncontradoException("pelicula no encontrada");
        return encontrado; 
    }

   

}
