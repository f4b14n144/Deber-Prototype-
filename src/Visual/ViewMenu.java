/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;

import Modelos.Guerrero;
import Modelos.RegistroPersonajes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



public class ViewMenu extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menuPersonajes;
    private JMenu menuClonados;
    private JComboBox personajes;
    private JButton Seleccionar;
    private JButton Clonar;
    private JMenuItem entrar;
    private JPanel panel1;
    private JLabel nombre;
    private JLabel Habilidad;
    private JLabel equipo;
    private JPanel imagen;
    private JLabel habilidadR;
    private JLabel equipoR;
    private JLabel nombreR;
    private JLabel imagenC;
    private RegistroPersonajes ep;
   

    private JButton botSalir = new JButton("Salir");
  
    
    Guerrero g1 = new Guerrero();

    public void  ViewMenu(RegistroPersonajes ep) {
        
        this.ep =   ep;
        ep = new RegistroPersonajes();
        
        String indetificador = "Guerrero 1";
        String habilidad ="Matar";
        String equipoG = "Equipo 1";
        
        int fuerza = 33;
        
       menuBar = new JMenuBar();
        menuBar.setBackground(new Color(70, 70, 70));
        menuBar.setForeground(Color.black);
        UIManager.put("MenuBar.foreground", Color.BLACK);
        
      
       ImageIcon imagenes = new ImageIcon("src\\Visual\\ImagenesPersonajes\\Guerrero1.jpg");

        personajes = new JComboBox<>();
        personajes.addItem("Personajes");
        personajes.addItem("Guerrero");
        personajes.addItem("Mago");
        personajes.setSelectedIndex(0);
        personajes.addActionListener(this);
       
    
        
        
        
        
        Habilidad = new JLabel("Abilidad:");
        Habilidad.setSize(100, 20);
        Habilidad.setLocation(300, 150);

        habilidadR = new JLabel("Texto");
        habilidadR.setSize(100, 20);
        habilidadR.setLocation(380, 150);
        

        nombre = new JLabel("Nombre: ");
        nombre.setSize(100, 20);
        nombre.setLocation(300, 205);

        nombreR = new JLabel("Textonom");
        nombreR.setSize(100, 20);
        nombreR.setLocation(380, 205);

        equipo = new JLabel("Equipo: ");
        equipo.setSize(100, 20);
        equipo.setLocation(300, 255);

        equipoR = new JLabel("textoE");
        equipoR.setSize(100, 20);
        equipoR.setLocation(380, 255);

        entrar = new JMenuItem("Entrar");
        menuPersonajes = new JMenu("Personajes");
        menuPersonajes.setForeground(Color.white);
        menuPersonajes.add(entrar);
        entrar.addActionListener(this);

        menuClonados = new JMenu("Clonados");
        menuClonados.setForeground(Color.white);
        menuClonados.addActionListener(this);

        menuBar.add(menuPersonajes);
        menuBar.add(menuClonados);

        imagenC = new JLabel();
        imagenC.setSize(180,300);
        imagenC.setIcon(imagenes);
        
        imagen = new JPanel();
        
        imagen.setSize(180, 300);
        imagen.add(imagenC);
        

        Seleccionar = new JButton("Seleccionar");
        Seleccionar.setSize(160, 30);
        Seleccionar.setLocation(220, 60);
        Seleccionar.addActionListener(this);

        Clonar = new JButton("Clonar");
        Clonar.setSize(160, 30);
        Clonar.setLocation(400, 60);

        JPanel centerPanel = new JPanel();
        centerPanel.add(personajes);
        centerPanel.setBackground(new Color(223, 223, 223));

        this.add(imagen);
        this.add(personajes);
        this.add(Seleccionar);
        this.add(Clonar);
        this.add(Habilidad);
        this.add(nombre);
        this.add(equipo);
        this.add(equipoR);
        this.add(nombreR);
        this.add(habilidadR);
        
        personajes.setSize(160, 30);
        personajes.setLocation(30, 60);
        imagen.setLocation(50, 150);

        this.add(centerPanel);
        this.setBackground(new Color(223, 223, 223));
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == personajes) {
        String selectedCharacter = (String) personajes.getSelectedItem();

        if ("Guerrero".equals(selectedCharacter)) {
            
            
            // Load the cache
            ep.loadCacheGuerrero();
           
        } else if ("Mago".equals(selectedCharacter)) {
           
            ep.loadCacheMago(selectedCharacter, "Hechizos", "equipo 2", "convierte a raton");
        }
    }
}

      
    
      

   public void updateLabelsGuerrero(String nombreL, String equipo1LG, String habilidadGG, int fuerzaGG) {
            System.out.println("entro labels");
            System.out.println(nombreL+" "+habilidadGG+" "+fuerzaGG);
            nombreR.setText(nombreL);
            equipoR.setText(equipo1LG);
            habilidadR.setText(habilidadGG);
            // Use fuerzaGG as needed
}

       
       public void updateLabelsMago(String equipo,String habilidad)
       {
           System.out.println("labels mago entro");
           System.out.println(equipo + " "+habilidad);
           
                
                String nombreMa = JOptionPane.showInputDialog(null,"Ingrese el nombre del Mago");
                //nombreR.setText(nombreMa);
                equipoR.setText("Equipo2");
                habilidadR.setText("Hechizos");
       }
}
    

   

    

   


   