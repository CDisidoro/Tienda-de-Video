package Objetos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel {
    public Imagen() {
        this.setSize(440, 366); 
    }
    public void paint(Graphics grafico) {
        Dimension height = getSize();
        ImageIcon Imag = null;
        Imag = new ImageIcon(getClass().getResource("/Recursos/imagen.jpg"));
        grafico.drawImage(Imag.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }
}
