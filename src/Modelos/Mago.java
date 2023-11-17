/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fabia
 */
public class Mago extends Personaje
{
    private String encanto;
    private String mago;
    private String habilidad;
    private String equipo;
    
    @Override
    void dibujar() {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\jellz\\Downloads\\master9.jpg"));
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            JFrame frame = new JFrame("Aldeano Image");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.add(imageLabel);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getEncanto() {
        return encanto;
    }

    public void setEncanto(String encanto) {
        this.encanto = encanto;
    }

    public String getMago() {
        return mago;
    }

    public void setMago(String mago) {
        this.mago = mago;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

 
    
    
}
