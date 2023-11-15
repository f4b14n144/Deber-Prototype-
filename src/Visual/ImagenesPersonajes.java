/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;
import javax.swing.ImageIcon;

public class ImagenesPersonajes {
    private static final String directorio = "Visual.ImagenesPersonajes"; // Directory where your images are stored

    public static ImageIcon[] CargarImgGuerrero() 
    {
        ImageIcon[] images = new ImageIcon[5]; // Assuming you have 5 images

        for (int i = 0; i < 5; i++) {
            String imagePath = directorio + "character" + (i + 1) + ".png"; // Assuming image files are named character1.png, character2.png, etc.
            images[i] = new ImageIcon(imagePath);
        }

        return images;
    }
}
