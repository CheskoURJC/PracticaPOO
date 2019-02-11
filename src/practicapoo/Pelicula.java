package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula implements Serializable{
    //Declaracion de Variables
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String actor;
    private String actriz;
    private ArrayList <Critica> lista_Criticas;
    
    //Constructores
    
    public Pelicula(){
        titulo = "Default";
        año = 0;
        director = "Default";
        genero = "Default";
        actor = "Default";
        actriz = "Default";
        lista_Criticas = new ArrayList <Critica>();
    }
    
    public Pelicula(String titulo, int año, String director, String genero, String actor, String actriz, ArrayList lista_Criticas){
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.actor = actor;
        this.actriz = actriz;
        this.lista_Criticas = lista_Criticas;
    }
    
    public Pelicula(String titulo, int año, String director, String genero, String actor, String actriz){
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.actor = actor;
        this.actriz = actriz;
        this.lista_Criticas = new ArrayList<Critica>();
    }
    
    public Pelicula(Pelicula p){
        this.titulo = p.getTitulo();
        this.año = p.getAño();
        this.director = p.getDirector();
        this.genero = p.getDirector();
        this.actor = p.getActor();
        this.actriz = p.getActriz();
        this.lista_Criticas = p.getLista_Criticas();
    }
    
    //GET
    
   public String getTitulo(){
       return titulo;
   }
   
   public int getAño(){
       return año;
   }
   
   public String getDirector(){
       return director;
   }
   
   public String getGenero(){
       return genero;
   }
   
   public String getActor(){
       return actor;
   }
   
   public String getActriz(){
       return actriz;
   }
   
   public ArrayList <Critica> getLista_Criticas(){
       return lista_Criticas;
   }
   
   //SET
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   
   public void setAño(int año){
       this.año = año;
   }
   
   public void setDirector(String director){
       this.director = director;
   }
   
   public void setGenero(String genero){
       this.genero = genero;
   }
   
   public void setActor(String actor){
       this.actor = actor;
   }
   
   public void setActriz(String actriz){
       this.actriz = actriz;
   }
   
   public void setLista_Criticas(ArrayList <Critica> lista_Criticas){
       this.lista_Criticas = lista_Criticas;
   }
}
