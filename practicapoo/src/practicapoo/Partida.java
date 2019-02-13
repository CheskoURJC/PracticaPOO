
package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Partida implements Serializable{
    
    //Declaracion de variables
    
    private int identificador;
    private Usuario ganador;
    private String resultado_final;
    private int ptos_jugador1;
    private int ptos_jugador2;
    private ArrayList <Pregunta> preguntas;
    
    //Constructores
    
    public Partida (){
        this.identificador = 0;
        this.ganador = new Usuario();
        this.resultado_final = "Default";
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;
        this.preguntas = new ArrayList<Pregunta>();
    }
    
    public Partida (int id){
        this.identificador = id;
        this.ganador = new Usuario();
        this.resultado_final = "Default";
        this.ptos_jugador1 = 0;
        this.ptos_jugador2 = 0;
        this.preguntas = new ArrayList<Pregunta>();
    }
    
    public Partida(int id, Usuario ganador, String resultado_final, int ptos_jugador1, int ptos_jugador2, ArrayList preguntas){
        this.identificador = id;
        this.ganador = ganador;
        this.resultado_final = resultado_final;
        this.ptos_jugador1 = ptos_jugador1;
        this.ptos_jugador2 = ptos_jugador2;
        this.preguntas = preguntas;
    } 
    
    public Partida(int id, Usuario ganador, String resultado_final, int ptos_jugador1, int ptos_jugador2){
        this.identificador = id;
        this.ganador = ganador;
        this.resultado_final = resultado_final;
        this.ptos_jugador1 = ptos_jugador1;
        this.ptos_jugador2 = ptos_jugador2;
        this.preguntas = new ArrayList<Pregunta>();
    }
    public Partida (Partida p){
        this.identificador = p.getIdentificador();
        this.ganador = p.getGanador();
        this.resultado_final = p.getResultado_Final();
        this.ptos_jugador1 = p.getPtos_Jugador1();
        this.ptos_jugador2 = p.getPtos_Jugador2();
        this.preguntas = p.getPreguntas();
    }
    
    //GET
    public int getIdentificador(){
        return identificador;
    }
    public Usuario getGanador(){
        return ganador;
    }
    public String getResultado_Final(){
        return resultado_final;
    }
    public int getPtos_Jugador1(){
        return ptos_jugador1;
    }
    public int getPtos_Jugador2(){
        return ptos_jugador2;
    }
    public ArrayList<Pregunta> getPreguntas(){
        return preguntas;
    }
    
    //SET
    public void setIdentificador(int id){
        this.identificador = id;
    }
    public void setGanador(Usuario ganador){
        this.ganador = ganador;
    }
    public void setResultado_Final(String resultado_final){
        this.resultado_final = resultado_final;
    }
    public void setPtos_Jugador1(int ptos_jugador1){
        this.ptos_jugador1 = ptos_jugador1;
    }
    public void setPtos_Jugador2(int ptos_jugador2){
        this.ptos_jugador2 = ptos_jugador2;
    }
    public void setPreguntas(ArrayList<Pregunta> preguntas){
        this.preguntas = preguntas;
    }
    
}

