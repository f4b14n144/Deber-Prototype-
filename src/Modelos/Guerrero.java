/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


import Visual.MostrarInfoPersonajes;
import javax.swing.JPanel;
import Visual.ImagenesPersonajes;

/**
 *
 * @author fabia
 */
public class Guerrero extends Personaje
{
    private String habilidad;
    private String equipo;
    private String guerrero;
    private int fuerza;
    

    @Override
    void dibujar() 
    {

         
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(String guerrero) {
        this.guerrero = guerrero;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    
}
