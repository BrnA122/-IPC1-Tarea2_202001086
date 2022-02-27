/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author Brian Ajuchan
 */
public class ControlUsuario {
public Usuario []usuarios;

    public ControlUsuario(){
        this.usuarios = new Usuario[10];
    }

    public boolean insertar(String nombre, String apellido, String contraseña ){
        for( int i=0;i<usuarios.length;i++){
            if(usuarios[i]==null){
                usuarios[i] = new Usuario(nombre,apellido,contraseña);
                return true;
            }
        }
        return false;
    }

    public boolean verificarUsuario(String usuario,String contraseña){
        for(Usuario us: usuarios){
            if(us!=null){
                if(us.nombre.equals(usuario) && us.pass.equals(contraseña)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarExistencia(String usuario){
        for(Usuario us: usuarios){
            if(us!=null){
                if(us.nombre.equals(usuario)){
                    return true;
                }
            }
        }
        return false;
    } 

    public int usuarioLogueado(String usuario, String contraseña){
        for(int i=0;i<10;i++){
            if(usuarios[i]!=null){
                if(usuarios[i].nombre.equals(usuario) && usuarios[i].pass.equals(contraseña)){
                    return i;
                }
            }
        }
        return 0;
    } 

    public int indiceUsuario(String usuario){
        for(int i=0;i<10;i++){
            if(usuarios[i]!=null){
                if(usuarios[i].nombre.equals(usuario)){
                    return i;
                }
            }
        }
        return -1;
    } 
}
