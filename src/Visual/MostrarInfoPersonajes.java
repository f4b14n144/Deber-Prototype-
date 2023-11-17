
package Visual;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author fabia
 */
public class MostrarInfoPersonajes 
{
    private JLabel characterInfoLabel;
    JLabel imageLabel;
    private String[] imagePaths = {"src\\Visual\\ImagenesPersonajes\\Guerrero1.jpg", "src\\Visual\\ImagenesPersonajes\\Guerrero2.jpg", "src\\Visual\\ImagenesPersonajes\\Guerrero3.jpg","src\\Visual\\ImagenesPersonajes\\Guerrero4.jpg","src\\Visual\\ImagenesPersonajes\\Guerrero5.jpg"};

    public void mostrarGerrero (String identificador,String habilidad, String equipo) 
    {                          
        // Create a JLabel to display character information
        characterInfoLabel = new JLabel();
        characterInfoLabel.setText("<html>Identificador: " + identificador + "<br>Habilidad: " + habilidad + "<br>Equipo: " + equipo + "</html>");
        characterInfoLabel.setSize(100,20);
        // Load image from your library
        ImageIcon characterImage = new ImageIcon(imagePaths[chooseImageIndex()]);
        imageLabel = new JLabel(characterImage);
        imageLabel.setVisible(true);

        JFrame fg = new JFrame();
        fg.setSize(500, 300);
        fg.setResizable(false);
        fg.setLocationRelativeTo(null);
        fg.setLayout(new BorderLayout());
        fg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fg.add(imageLabel);
        fg.add(characterInfoLabel);    
        // Create a JLabel to display the character image
        fg.setVisible(true);

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
}
