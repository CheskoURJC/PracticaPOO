
package practicapoo;

import java.io.Serializable;
import java.util.ArrayList;


public class Usuarios implements Serializable{
    //Declaracion de Variables
    
    ArrayList <Usuario> lista_Usuarios;
    Clasificacion ranking;
    
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
        this.lista_Usuarios = u.getLista_Usuarios();
        this.ranking = u.getRanking();
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
    //METODOS   
    /* autenticar(Usuario u)
       registrar(Usuario u)
    */
    public void autenticar (Usuario us) throws NoEncontradoException{
        boolean encontrado = false;
        for(Usuario u:this.lista_Usuarios){
            if (u.getNick().equals(us.getNick()) && u.getPassword().equals (us.getPassword()))
                System.out.println ("Bienvenido "+us.getNick());
                encontrado = true;    
        }
        if (!encontrado) throw new NoEncontradoException("usuario no encontrado");    
    }
    
    public void registrar (Usuario u) throws NoEncontradoException{
        if (! existeUsuario(u.getNick()))
           this.lista_Usuarios.add(u);
    }
    
    //METODOS ADICIONALES
    
    public boolean EsLista_UsuariosVacia(){ 
        return this.lista_Usuarios.isEmpty();
    }

    public Usuarios copiaListaUsuarios(){ //Copia los usuarios y devuelve su copia
        Usuarios u = new Usuarios (this);
        return u;
    }

    public boolean existeUsuario(String nick) throws NoEncontradoException{
        boolean encontrado = false;
        for (Usuario l:this.lista_Usuarios){
            if (l.getNick().equals(nick))
                encontrado = true;
        }
        if (!encontrado) throw new NoEncontradoException("usuario no encontrado");
        return encontrado; 
    }

    public Usuario devuelveUsuario(String nick) throws NoEncontradoException{ //devuelve el usuario dado su nick
        boolean encontrado = false;
        Usuario aux= new Usuario();
        for (Usuario l:this.lista_Usuarios){
            if(l.getNick().equals(nick)){
                encontrado=true;
                aux = l;
            }
        }
        if (encontrado) return aux;
        else throw new NoEncontradoException("usuario no encontrado");        
    }

}

