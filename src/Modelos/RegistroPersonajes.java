/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


import Visual.ViewMenu;
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
    private static Guerrero g1=new Guerrero();
    private static Mago m1=new Mago();
    private static Personaje personajeClonado;
    private static ViewMenu vm1=new ViewMenu();
    public String equipoM;
    public String habilidadM;
    
    
    public  void loadCache(String tipo)
    {
        if(tipo.equalsIgnoreCase("guerrero")) 
        {
            //valores predeterminados
            String identificador = "Guerrero1";
            String habilidad = "Matar";
            String equipo= "De los buenos";
            int fuerza= 8;
            System.out.println("entro");
            loadCacheGuerrero();
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
    public void loadCacheGuerrero() {
            String tipo = "Guerrero";
            String nombre = "Joseph ";
            String habilidad = "Matar";
            String equipo = "Equipo 1";
            int fuerza = 33;
            String fuerzaS = Integer.toString(fuerza);
            String indentificador = "Guerrero 1";
            g1.setTipo(tipo);
            g1.setHabilidad(habilidad);
            g1.setEquipo(equipo);
            g1.setFuerza(fuerza);
            g1.setGuerrero(indentificador);

            MapPersonajes.put(g1.getGuerrero(), g1);
            
            
            vm1.updateLabelsGuerrero(nombre, equipo, habilidad, fuerza);

           
        }


    public  void loadCacheMago(String identificador,String habilidad,String equipo,String encanto)
    {
        
        this.equipoM = equipo;
        this.habilidadM = habilidad;
        
        m1.setEncanto(encanto);
        m1.setEquipo(equipo);
        m1.setHabilidad(habilidad);
        m1.setMago(encanto);
        
        MapPersonajes.put(m1.getMago(), m1);
        vm1.updateLabelsMago(equipoM,habilidadM);
    }
    public static void clonar()
    {
       
        
        String tipo = JOptionPane.showInputDialog("Ingrese el identificador del personaje al que desea clonar?");
       
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
    

    

    
}
