/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

public class ComboBoxPersonajes extends JComboBox<String> {

    public ComboBoxPersonajes(ActionListener listener) {
        this.addItem("Aldeano");
        this.addItem("Guerrero");
        this.addItem("Mago");
        this.setSize(50, 20);
        this.addActionListener(listener);
    }
}