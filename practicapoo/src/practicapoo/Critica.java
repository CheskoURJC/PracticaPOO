package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Critica implements Serializable{
    
    //Declaracion de variables
    
    private String pelicula;
    private double puntuacion;
    private String texto;
    
    //Constructores
    
    public Critica(){
        pelicula ="Default";
        puntuacion = 0.0;
        texto = "Default";
    }
    public Critica(String pelicula, double puntuacion, String texto){
        this.pelicula = pelicula;
        
        if(puntuacion >= 0.0 && puntuacion <= 10.0){
            this.puntuacion = puntuacion;
        }else{
            this.puntuacion = 0.0;
        }
        
        this.texto = texto;
    }
    public Critica(Critica c){
        pelicula = c.getPelicula();
        puntuacion = c.getPuntuacion();
        texto = c.getTexto();
    }
    
    //GET
    public String getPelicula(){
        return pelicula;
    }
    public double getPuntuacion(){
        return puntuacion;
    }
    public String getTexto(){
        return texto;
    }
    
    //SET
    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }
    public void setPuntuacion(double puntuacion){
        if(puntuacion >= 0.0 && puntuacion <= 10.0){
            this.puntuacion = puntuacion;
        }else{
            this.puntuacion = 0.0;
        }
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
}

