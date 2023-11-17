/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author fabia
 */
public abstract class Personaje implements Cloneable
{
    private String tipo;
    abstract void dibujar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    
   @Override
   public Personaje clone()
   {
        try {
            return(Personaje) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Personaje.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }
    
}
