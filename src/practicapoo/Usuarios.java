package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable{
    //Declaracion de Variables
    private ArrayList <Usuario> lista_Usuarios;
    private Clasificacion ranking;
    
    //Constructores
    public Usuarios(){
        lista_Usuarios = new ArrayList <Usuario>();
        ranking = new Clasificacion();
    }
   
    public Usuarios(ArrayList lista_Usuarios, Clasificacion ranking){
        this.lista_Usuarios = lista_Usuarios;
        this.ranking = ranking;
    }
    
    public Usuarios(Usuarios u){
        lista_Usuarios = u.getLista_Usuarios();
        ranking = u.getRanking();
    }
    
    //GET
    
    public ArrayList <Usuario> getLista_Usuarios(){
        return lista_Usuarios;
    }
    
    public Clasificacion getRanking(){
        return ranking;
    }
    
    //SET
    
    public void setLista_Usuarios(ArrayList<Usuario> lista_Usuarios){
        this.lista_Usuarios = lista_Usuarios;
    }
    
    public void setRanking(Clasificacion ranking){
        this.ranking = ranking;
    }   
}
