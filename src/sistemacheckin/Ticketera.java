/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacheckin;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author cetti
 */
public class Ticketera {

    public Ticketera() {
    }
    
    public void imprimir(){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("img/passTemplate.png"));
            
            System.out.println("Imagen Abierta");
        } catch (IOException ex) {
            Logger.getLogger(Ticketera.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Escribir
        Graphics g = image.getGraphics(); 
        g.setFont(g.getFont().deriveFont(30f)); 
        g.drawString("Hello World!", 100, 100); g.dispose(); 
        try {
            ImageIO.write(image, "png", new File("test.png"));
        } catch (IOException ex) {
            Logger.getLogger(Ticketera.class.getName()).log(Level.SEVERE, null, ex);
        }

        


    }
    
    
}
