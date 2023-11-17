/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JPanel;

import javax.swing.JButton;

import javax.swing.JButton;

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
    private JLabel abilidad;
    private JLabel equipo;
    private JPanel imagen;
    private JLabel abilidadR;
    private JLabel equipoR;
    private JLabel nombreR;
    private String tipo;
    

    private JButton botSalir = new JButton("Salir");

    public ViewMenu() {
       menuBar = new JMenuBar();
        menuBar.setBackground(new Color(70,70,70));
        menuBar.setForeground(Color.black);
         UIManager.put("MenuBar.foreground", Color.BLACK);
        
       

        personajes = new JComboBox<>();
        
        personajes.addItem("Personajes");
        personajes.addItem("Guerrero");
        personajes.addItem("Mago");
        personajes.setSelectedIndex(0);
        
        
        abilidad = new JLabel("Abilidad:");
        abilidad.setSize(100,20);
        abilidad.setLocation(300,150);
        
        abilidadR = new JLabel("Texto");
        abilidadR.setSize(100,20);
        abilidadR.setLocation(380,150);
        
        nombre = new JLabel("Nombre: ");
        nombre.setSize(100,20);
        nombre.setLocation(300,205);
        
        nombreR = new JLabel("Textonom");
        nombreR.setSize(100,20);
        nombreR.setLocation(380,205);
        
        equipo = new JLabel("Equipo: ");
        equipo.setSize(100,20);
        equipo.setLocation(300,255);
        
        equipoR = new JLabel("textoE");
        equipoR.setSize(100, 20);
        equipoR.setLocation(380,255);

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

        
        imagen = new JPanel();
        imagen.setBackground(Color.red);
        imagen.setSize(180, 130);
        
       
        botSalir.addActionListener(this);

        setJMenuBar(menuBar);
        setTitle("JUEGO PERSONAJES");

        Seleccionar = new JButton("Selccionar");
        Seleccionar.setSize(160,30);
        Seleccionar.setLocation(220,60);
        
        Clonar = new JButton("Clonar");
        Clonar.setSize(160,30);
        Clonar.setLocation(400, 60);
       
        JPanel centerPanel = new JPanel();
        centerPanel.add(personajes);
        centerPanel.setBackground(new Color(223,223,223));
        
        this.add(imagen);
        this.add(personajes);
        this.add(Seleccionar);
        this.add(Clonar);
        this.add(abilidad);
        this.add(nombre);
        this.add(equipo);
        this.add(equipoR);
        this.add(nombreR);
        this.add(abilidadR);
        personajes.setSize(160,30);
        personajes.setLocation(30,60);
        imagen.setLocation(50, 150);
       

       

        this.add(centerPanel);
        this.setBackground(new Color(223,223,223));
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == entrar) 
        {
            System.out.println("entro");
            // Trigger action to go to another class for Clonados
          
        } else if (e.getSource() == menuPersonajes) 
        {
            // Trigger action to go to another class for Personajes
        }//else if ("comboBoxChanged".equals()) 
        // {
          //   JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
            // tipo = comboBox.getSelectedItem().toString();

             //if (tipo.equalsIgnoreCase("guerrero"))  
    }
}