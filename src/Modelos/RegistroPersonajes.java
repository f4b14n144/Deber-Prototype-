/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Visual.MostrarInfoPersonajes;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fabia
 */
public class RegistroPersonajes 
{
    private static Map<String,Personaje> MapPersonajes=new HashMap();
    private static Scanner s=new Scanner(System.in);
    private static MostrarInfoPersonajes mfp= new MostrarInfoPersonajes();
    private static Guerrero g1=new Guerrero();
    private static Mago m1=new Mago();
    private static Personaje personajeClonado;
    
    public static void loadCache(String tipo)
    {
        if(tipo.equalsIgnoreCase("guerrero")) 
        {
            //valores predeterminados
            String identificador = "Guerrero1";
            String habilidad = "Matar";
            String equipo= "De los buenos";
            int fuerza= 8;
            System.out.println("entro");
            loadCacheGuerrero(tipo,habilidad,equipo,identificador,fuerza);
        }
        else if (tipo.equalsIgnoreCase("mago"))
        {
            String identificador = "mago1";
            String habilidad = "volar";
            String equipo= "malos";
            String encanto="congelar";
            System.out.println("entro");
            
        }
      
    }
    public static void loadCacheGuerrero(String tipo,String habilidad,String equipo,String identificador,int fuerza)
    {
        g1.setTipo(tipo);
        g1.setHabilidad(habilidad);
        g1.setEquipo(equipo);
        g1.setFuerza(fuerza);
        g1.setGuerrero(identificador);
        
        MapPersonajes.put(g1.getGuerrero(), g1);
        System.out.println("entro");
        System.out.println(g1.getEquipo());
        MostrarInfoPersonajes mip=new MostrarInfoPersonajes();
        //mip.mostrarGerrero(identificador, habilidad, equipo);
        
        
    }

    public static void loadCacheMago(String identificador,String habilidad,String equipo,String encanto)
    {
        m1.setEncanto(encanto);
        m1.setEquipo(equipo);
        m1.setHabilidad(habilidad);
        m1.setMago(encanto);
        
        MapPersonajes.put(m1.getMago(), m1);
    }
    public static void clonar()
    {
       
        
        String tipo = JOptionPane.showInputDialog("Ingrese el identificador del personaje al que desea clonar?");
        //System.out.println("Ingrese el identificador del personaje al que desea clonar");
        //String tipo=s.nextLine();
        personajeClonado=RegistroPersonajes.getPersonaje(tipo);
        
        JOptionPane.showMessageDialog(null, personajeClonado.getTipo());

        personajeClonado.dibujar();
    }
    public static Personaje getPersonaje(String idPersonaje)
    {
        
        Personaje objetoClonado=MapPersonajes.get(idPersonaje);
        
         personajeClonado= (Guerrero) personajeClonado;
        String nuevoNombre= JOptionPane.showInputDialog("Ingrese el nuevo nombre del guerrero");
        
        return personajeClonado;
    }
    
   /* public static String printAtributos(String identificador)
    {
        Guerrero atributoG = (Guerrero) MapPersonajes.get(identificador);
    
        String habilidad = atributoG.getHabilidad();
        String equipo = atributoG.getEquipo();
        String labelText = "Fuerza: " + habilidad + " | Vidas: " + equipo + "";
        return labelText;         
    }*/
    
    

    
}
