/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Visual.MostrarInfoPersonajes;
import javax.swing.JPanel;

/**
 *
 * @author fabia
 */
public class Guerrero extends Personaje
{
    private int fuerza;
    private int vidas;
    private String guerrero;
     private static MostrarInfoPersonajes mfp= new MostrarInfoPersonajes();

      @Override
    JPanel dibujar() 
    {
            mfp.mostrarGerrero(getGuerrero(), getFuerza(), getVidas());
            JPanel jp1=new JPanel();
            jp1=mfp.getPanel();
            return jp1;
   
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(String guerrero) {
        this.guerrero = guerrero;
    }
    
    
}
