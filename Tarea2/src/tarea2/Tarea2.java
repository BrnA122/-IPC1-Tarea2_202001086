/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

/**
 *
 * @author Brian Ajuchan
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControlUsuario usuarios = new ControlUsuario();
        usuarios.insertar("Brian","Ajuchan","202001086");
        Login m =new Login(usuarios);
        m.setVisible(true);
    }
    
}
