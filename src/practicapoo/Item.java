
package practicapoo;

import java.io.Serializable;

public class Item implements Serializable {
    //Declaracion de Variables
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int perdidas;
    private double porcentaje_victorias;
    private int ptos;
    
    //Constructores
    
    public Item (){
        this.nombreUsuario = "Default";
        this.jugadas = 0;
        this.ganadas = 0;
        this.perdidas = 0;
        this.porcentaje_victorias = 0.0;
        this.ptos = 0;
    }
    
    public Item(String nombreUsuario, int jugadas, int ganadas, int perdidas, double porcentaje_victorias, int ptos){
        this.nombreUsuario = nombreUsuario;
        this.jugadas = jugadas;
        this.ganadas = ganadas;
        this.perdidas = perdidas;
        this.porcentaje_victorias = porcentaje_victorias;
        this.ptos = ptos;
    }
    
    public Item(Item i){
        this.nombreUsuario = i.getNombreUsuario();
        this.jugadas = i.getJugadas();
        this.ganadas = i.getGanadas();
        this.perdidas = i.getPerdidas();
        this.porcentaje_victorias = i.getPorcentaje_victorias();
        this.ptos = i.getPtos();
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
    
    public double getPorcentaje_victorias(){
        return porcentaje_victorias;
    }
    
    public int getPtos(){
        return ptos;
    }
    
    //SET
    
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
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
    
    public void setPorcentaje_victorias(double porcentaje_victorias){
        this.porcentaje_victorias = porcentaje_victorias;
    }
    
    public void setPtos(int ptos){
        this.ptos = ptos;
    }
}
