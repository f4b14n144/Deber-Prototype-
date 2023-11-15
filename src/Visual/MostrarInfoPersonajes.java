/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fabia
 */
public class MostrarInfoPersonajes 
{
    private JLabel characterInfoLabel;
    JLabel imageLabel;
    private String[] imagePaths = {"src\\Visual\\ImagenesPersonajes\\img1.jpg", "src\\Visual\\ImagenesPersonajes\\img2.jpg", "src\\Visual\\ImagenesPersonajes\\img3.jpg","src\\Visual\\ImagenesPersonajes\\img4.jpg","src\\Visual\\ImagenesPersonajes\\img5.jpg"};

    public void mostrarGerrero (String identificador, int fuerza, int vidas) 
    {
        // Create a JLabel to display character information
        characterInfoLabel = new JLabel();
        characterInfoLabel.setText("<html>Identificador: " + identificador + "<br>Fuerza: " + fuerza + "<br>Vidas: " + vidas + "</html>");
        
        // Load image from your library
         
        ImageIcon characterImage = new ImageIcon(imagePaths[chooseImageIndex()]);


        // Create a JLabel to display the character image
        JLabel imageLabel = new JLabel(characterImage);

        // Create a JPanel to hold both character information and image
        
    }
    public int chooseImageIndex()
    {
        String[] options = new String[imagePaths.length];
        for (int i = 0; i < imagePaths.length; i++) 
        {
            options[i] = "Image " + (i + 1);
        }

        int selectedOption = JOptionPane.showOptionDialog(null,
                "Choose an image for your character:",
                "Select Image",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        return selectedOption;
    }
    public JPanel getPanel()
    {
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BorderLayout());
        infoPanel.add(characterInfoLabel, BorderLayout.NORTH);
        infoPanel.add(imageLabel, BorderLayout.CENTER);
        
        return infoPanel;
    }
    
}
