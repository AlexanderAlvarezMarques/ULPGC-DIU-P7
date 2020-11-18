package beans;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import javax.swing.JPanel;

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
    
    public int[] 
    
    public void setImage(BufferedImage img) {
        bgImage = img;
    }
    
    public void paintImage() {
        this.setPreferredSize(new Dimension(bgImage.getWidth(), bgImage.getHeight()));
        repaint();
    }
    
    
    
}
