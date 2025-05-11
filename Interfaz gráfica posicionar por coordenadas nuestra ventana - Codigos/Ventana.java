/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posisionamientoporventanas;

/**
 *
 * @author raule
 */
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Ventana extends JFrame {

    public Ventana(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
