/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelos;
import java.awt.BorderLayout;
import Visual.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
   
    private JButton boton;
    private JButton boton1;
    private String tipo;
    private JLabel labelPersonaje;
    private JLabel labelP;
    private JPanel panel;

    public Main() {
        FramePrincipal fp = new FramePrincipal();
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          boton = new JButton("Clonados");
          boton.setSize(50,20);
          boton.addActionListener(e->RegistroPersonajes.clonar());
          
          boton1 = new JButton("Personajes");
          boton1.setSize(50,20);
          boton1.addActionListener(e->RegistroPersonajes.loadCache(tipo));
          
    
        //ComboBoxPersonajes personajes = new ComboBoxPersonajes(this);
        PanelSuperior topPanel = new PanelSuperior();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        labelPersonaje = new JLabel();
        topPanel.add(boton1);
        topPanel.add(boton);
        fp.add(labelPersonaje, BorderLayout.NORTH);
       

        
     
        fp.add(topPanel, BorderLayout.NORTH);
        fp.setVisible(true);
        
        panel = new JPanel();
        panel.setSize(500, 200);
        panel.setBackground(Color.GRAY);
        fp.add(panel,BorderLayout.CENTER);
        labelP = new JLabel();
        panel.add(labelP);
        
        
        
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String actionCommand = e.getActionCommand();

        if ("comboBoxChanged".equals(actionCommand)) 
        {
            JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
            tipo = comboBox.getSelectedItem().toString();
            
            if (tipo.equalsIgnoreCase("guerrero"))   
            {
                
                ImageIcon[] characterImages = ImagenesPersonajes.CargarImgGuerrero();
                RegistroPersonajes.loadCache(tipo);
                String texto = RegistroPersonajes.printAtributos(tipo);
                labelP.setText(texto);
                int selectedIndex = comboBox.getSelectedIndex();

                if (selectedIndex >= 0 && selectedIndex < characterImages.length) 
                {
                    ImageIcon selectedImage = characterImages[selectedIndex];
                    labelPersonaje.setIcon(selectedImage);
                }
            
            
            
            }
            
         
        }
    }
    
    
}

