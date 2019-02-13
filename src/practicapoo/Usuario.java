package practicapoo;


import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    //Declaracion de Variables
    String nick, password;
    StringBuilder muro;
    private int partidas_ganadas;
    private int partidas_perdidas;
    private int partidas_empatadas;
    private Peliculas lista_Peliculas;
    private ArrayList <Partida> partidas_completas;
    private ArrayList <Partida> partidas_pendientes;
    private ArrayList <Usuario> solicitudes_amigos_pendientes;
    private ArrayList <Usuario> lista_amigos;
    
    //Constructores
    
    public Usuario(){
        this.nick = "Default";
        this.password = "Default";
        this.muro = new StringBuilder();
        this.partidas_ganadas = 0;
        this.partidas_empatadas = 0;
        this.partidas_perdidas = 0;
        this.lista_Peliculas = new Peliculas();
        this.solicitudes_amigos_pendientes = new ArrayList <Usuario>();
        this.partidas_completas = new ArrayList <Partida>();
        this.partidas_pendientes = new ArrayList <Partida>();
        this.lista_amigos = new ArrayList <Usuario>();
    }
    
    public Usuario(String nick, String password){
        this.nick = nick;
        this.password = password;
        this.muro = new StringBuilder();
        this.partidas_ganadas = 0;
        this.partidas_empatadas = 0;
        this.partidas_perdidas = 0;
        this.lista_Peliculas = new Peliculas();
        this.solicitudes_amigos_pendientes = new ArrayList <Usuario>();
        this.partidas_completas = new ArrayList <Partida>();
        this.partidas_pendientes = new ArrayList <Partida>();
        this.lista_amigos = new ArrayList <Usuario>();
    }
    
    public Usuario(Usuario u){
        this.nick = u.getNick();
        this.password = u.getPassword();
        this.muro = u.getMuro();
        this.partidas_ganadas = u.getPartidas_Ganadas();
        this.partidas_empatadas = u.getPartidas_Empatadas();
        this.partidas_perdidas = u.getPartidas_Perdidas();
        this.lista_Peliculas = u.getLista_Peliculas();
        this.solicitudes_amigos_pendientes = u.getSolicitudes_Amigos_Pendientes();
        this.partidas_completas = u.getPartidas_Completas();
        this.partidas_pendientes = u.getPartidas_Pendientes();
        this.lista_amigos = u.getLista_Amigos();
    }
    
    public Usuario(String nick, String password, StringBuilder m, int ganadas, int perdidas, int empatadas, Peliculas lista, ArrayList completas, ArrayList pendientes, ArrayList solicitudes, ArrayList amigos){
        this.nick = nick;
        this.password = password;
        this.muro = m;
        this.partidas_ganadas = ganadas;
        this.partidas_empatadas = empatadas;
        this.partidas_perdidas = perdidas;
        this.lista_Peliculas = lista;
        this.solicitudes_amigos_pendientes = solicitudes;
        this.partidas_completas = completas;
        this.partidas_pendientes = pendientes;
        this.lista_amigos = amigos;
    }
    
    //GET
    
    public String getNick(){
        return nick;
    }
    
    public String getPassword(){
        return password;
    }
    
    public StringBuilder getMuro(){
        return muro;
    }
    
    public int getPartidas_Ganadas(){
        return partidas_ganadas;
    }
    
    public int getPartidas_Perdidas(){
        return partidas_perdidas;
    }
    
    public int getPartidas_Empatadas(){
        return partidas_empatadas;
    }
    
    public Peliculas getLista_Peliculas(){
        return lista_Peliculas;
    }
    
    public ArrayList <Usuario> getSolicitudes_Amigos_Pendientes(){
        return solicitudes_amigos_pendientes;
    }
    
    public ArrayList <Partida> getPartidas_Completas(){
        return partidas_completas;
    }
    
    public ArrayList <Partida> getPartidas_Pendientes(){
        return partidas_pendientes;
    }
    
    public ArrayList <Usuario> getLista_Amigos(){
        return lista_amigos;
    }
    
    //SET
    
    public void setNick(String nick){
        this.nick = nick;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setMuro(StringBuilder m){
        this.muro.insert(0, m);
    }
    
    public void setPartidas_Ganadas(int partidas_ganadas){
        this.partidas_ganadas = partidas_ganadas;
    }
    
    public void setPartidas_Perdidas(int partidas_perdidas){
        this.partidas_perdidas = partidas_perdidas;
    }
    
    public void setPartidas_Empatadas(int partidas_empatadas){
        this.partidas_empatadas = partidas_empatadas;
    }
    
    public void setLista_Peliculas(Peliculas lista_peliculas){
        this.lista_Peliculas = lista_peliculas;
    }
    
    public void setSolicitudes_Amigos_Pendientes(ArrayList<Usuario> solicitudes){
        this.solicitudes_amigos_pendientes = solicitudes;
    }
    
    public void setPartidas_Completas(ArrayList<Partida> completas){
        this.partidas_completas = completas;
    }
    
    public void setPartidas_Pendientes(ArrayList<Partida> pendientes){
        this.partidas_pendientes = pendientes;
    }
    
    public void setLista_Amigos(ArrayList <Usuario> lista_amigos){
        this.lista_amigos = lista_amigos;
    }
}
