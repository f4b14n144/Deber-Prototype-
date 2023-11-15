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
public class Aldeano extends Personaje
{
    private String aldeano;
    @Override
    void dibujar() {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\fabia\\Downloads\\img5.jpg"));
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

    public String getAldeano() {
        return aldeano;
    }

    public void setAldeano(String aldeano) {
        this.aldeano = aldeano;
    }
    
}
