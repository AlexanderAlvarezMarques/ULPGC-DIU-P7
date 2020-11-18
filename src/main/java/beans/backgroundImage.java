package beans;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.opencv.core.Mat;
import tools.EstadisticasImagen;

/**
 * @author Alexander Álvarez Marques
 * @date 2020-11-17
 * @version 0.1
 */
public class backgroundImage extends JPanel {

    // Attributes
    private BufferedImage bgImage;
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, null);
    }
    
    public int[][] getChannels(Mat img, Point pos, Dimension size) {
        
        int [][] chanels = new int [3][3];
        
        EstadisticasImagen ei = new EstadisticasImagen();
        
        ei.calculaEstadisticas(img, pos, size);
        
        int [] maximos = ei.getMaximo();
        int [] minimos = ei.getMinimo();
        int [] promedios = ei.getPromedio();
        
        for (int i = 0; i < 3; i++) {
            chanels[i][0] = minimos[i];
            chanels[i][1] = maximos[i];
            chanels[i][2] = promedios[i];
        }
        
        return chanels;
        
    }
    
    public void setImage(BufferedImage img) {
        bgImage = img;
    }
    
    public void paintImage() {
        this.setPreferredSize(new Dimension(bgImage.getWidth(), bgImage.getHeight()));
        repaint();
    }
    
    
    
}
