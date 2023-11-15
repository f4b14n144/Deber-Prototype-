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
    
    public static void loadCache(String tipo)
    {
        if(tipo.equalsIgnoreCase("guerrero")) //en todo este if hay que cambiarle y encontrar la forma de implementar 
                                                        //interfaz grafica como pida la profe
        {
            
            String guerrero = JOptionPane.showInputDialog("Ingrese el identificador del guerrero");
            int fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza"));
            int vidas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vidas"));
            
            loadCacheGuerrero(tipo,fuerza,vidas,guerrero);
        }
        else if (tipo.equalsIgnoreCase("mago"))
        {
            String mago = JOptionPane.showInputDialog("Ingrese el identificador del mago") ;
            String hechizo = JOptionPane.showInputDialog("Ingrese el hechizo");
            
            loadCacheMago(tipo,hechizo,mago);
        }
        else if (tipo.equalsIgnoreCase("aldeano"))
        {
            
            String aldeano = JOptionPane.showInputDialog("Ingrese el identificador del aldeano");
            
            loadCacheAldenao(tipo,aldeano);
        }
    }
    public static void loadCacheGuerrero(String tipo,int fuerza,int vidas,String identificador)
    {
        g1.setTipo(tipo);
        g1.setFuerza(fuerza);
        g1.setVidas(vidas);
        g1.setGuerrero(identificador);
        
        MapPersonajes.put(g1.getGuerrero(), g1);
        
    }
     public static void loadCacheAldenao(String tipo,String identificador)
    {
        Aldeano a1=new Aldeano();
        a1.setTipo(tipo);
        a1.setAldeano(identificador);
        MapPersonajes.put(a1.getAldeano(), a1);
    }
          public static void loadCacheMago(String tipo,String encanto,String identificador)
    {
        Mago m1=new Mago();
        m1.setTipo(tipo);
        m1.setEncanto(encanto);
        m1.setMago(identificador);
        MapPersonajes.put(m1.getMago(), m1);
    }
    public static void clonar()
    {
         //De aqui para abajo es para clonar a los personajes 
        //Igual hay que reemplazar por interfaz grafica como pida la profe
        
        String tipo = JOptionPane.showInputDialog("Ingrese el identificador del personaje al que desea clonar?");
        //System.out.println("Ingrese el identificador del personaje al que desea clonar");
        //String tipo=s.nextLine();
        Personaje personajeClonado=RegistroPersonajes.getPersonaje(tipo);//aqui falta agregar el tipo, hasta mientras se esta 
                                                                                  //mandando el string de arriba
    JOptionPane.showMessageDialog(null, personajeClonado.getTipo());

        personajeClonado.dibujar();//esto llama al metodo y en el metodo esta el override donde 
                                   //se implementa la interfaz grafica 
    }
    public static Personaje getPersonaje(String idPersonaje)
    {
        Personaje objetoClonado=MapPersonajes.get(idPersonaje);
        return objetoClonado.clone();
    }
    
    public static String printAtributos(String identificador)
    {
        Guerrero atributoG = (Guerrero) MapPersonajes.get(identificador);
    
        int fuerza = atributoG.getFuerza();
        int vidas = atributoG.getVidas();
        String labelText = "Fuerza: " + fuerza + " | Vidas: " + vidas+ "";
        return labelText;         
    }
    public static JPanel panelG()
    {
        JPanel jp=new JPanel();
        jp=g1.dibujar();
        return jp;
    }
    
}
