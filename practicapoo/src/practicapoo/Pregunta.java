
package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pregunta implements Serializable{
    
    //Declaracion de variables
    
    private int id;
    private Pelicula pelicula;
    private int puntos_jugador1;
    private int puntos_jugador2;
    //private int pistas; 
    
    //Constructores
    
    public Pregunta (){
        id = 0;
        pelicula = new Pelicula();
        puntos_jugador1 = 0;
        puntos_jugador2 = 0;
        //pistas = 0;
    }
    public Pregunta (int i, Pelicula p,int pj1, int pj2, int pista){
        if( i>0 && i<=6 ){
            this.id = i;
        }else{
            this.id=0;
        }
        this.pelicula = p;
        this.puntos_jugador1 = pj1;
        this.puntos_jugador2 = pj2;
       /* if( pista>=0 && pista<=5 ){
            this.pistas = pista;
        }else{
            this.pistas=0;
        }*/
    }
    
    public Pregunta (Pregunta p){
        this.id = p.getId();
        this.pelicula = p.getPelicula();
        this.puntos_jugador1 = p.getPuntos_Jugador1();
        this.puntos_jugador2 = p.getPuntos_Jugador2();
        //this.pistas = p.getPista();
    }
    
    //GET
    
    public int getId(){
        return id;
    }
    
    public Pelicula getPelicula(){
        return pelicula;
    }
    
    public int getPuntos_Jugador1(){
        return puntos_jugador1;
    }
    
    public int getPuntos_Jugador2(){
        return puntos_jugador2;
    }
    
   /* public int getPista(){
        return pistas;
    }*/
    //SET
    public void setId(int i){
        if( i>0 && i<=6 ){
            this.id = i;
        }
    }
    
    public void setPelicula(Pelicula p){
        this.pelicula = p;
    } 
    
    public void setPuntos_Jugador1(int pj1){
        this.puntos_jugador1 = pj1;
    }
 
    public void setPuntos_Jugador2(int pj2){
        this.puntos_jugador2 = pj2;
    }
    
    
    /*public void setPista(int i){
        if( i>=0 && i<=5 ){
            this.pistas = i;
        }
    }*/
}
