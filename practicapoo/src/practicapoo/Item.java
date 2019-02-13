
package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable{
    //Declaracion de variables
    
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int perdidas;
    private int empatadas;
    private double porcentaje_victorias;
    private int puntos;
    
    //Constructores
    
    public Item(){
        this.nombreUsuario = "Default";
        this.jugadas = 0;
        this.ganadas = 0;
        this.perdidas = 0;
        this.empatadas = 0;
        this.porcentaje_victorias = 0;
        this.puntos = 0;
    }
    public Item( String nombre, int jugadas, int ganadas, int perdidas,int empatadas, double porcentaje_victorias,int ptos){     
        this.nombreUsuario = nombre;
        this.jugadas = jugadas;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.empatadas = empatadas;
        this.porcentaje_victorias = porcentaje_victorias;
        this.puntos = ptos;
    }
    
    public Item(Usuario u){
        this.nombreUsuario = u.getNick();
        this.jugadas = u.getPartidas_Completas().size();
        this.ganadas = u.getPartidas_Ganadas();
        this.perdidas = u.getPartidas_Perdidas();
        this.empatadas = u.getPartidas_Empatadas();
        this.porcentaje_victorias = (double) ((u.getPartidas_Ganadas() * 100)/jugadas);
        this.puntos = u.getPartidas_Empatadas() + u.getPartidas_Ganadas();
        
    }
    
    public Item(Item i){
        this.nombreUsuario = i.getNombreUsuario();
        this.jugadas = i.getJugadas();
        this.ganadas = i.getGanadas();
        this.perdidas = i.getPerdidas();
        this.empatadas = i.getEmpatadas();
        this.porcentaje_victorias = i.getPorcentaje_Victorias();
        this.puntos = i.getPuntos();
    }
    //GET
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public int getJugadas(){
        return jugadas;
    }
    
    public int getGanadas(){
        return ganadas;
    }
    
    public int getPerdidas(){
        return perdidas;
    }
    
    public int getEmpatadas(){
        return empatadas;
    }
    
    public double getPorcentaje_Victorias(){
        return porcentaje_victorias;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
    //SET
    public void setNombreUsuario(String nombre){
        this.nombreUsuario = nombre;
    }
 
    public void setJugadas(int jugadas){
        this.jugadas = jugadas;
    }
    
    public void setGanadas(int ganadas){
        this.ganadas = ganadas;
    }

    public void setPerdidas(int perdidas){
        this.perdidas = perdidas;
    }

    public void setEmpatadas(int empatadas){
        this.empatadas = empatadas;
    }

    public void setPorcentaje_Victorias(double pv){
        this.porcentaje_victorias = pv;
    }
    
    public void setPuntos(int ptos){
        this.puntos = ptos;
    }
}
