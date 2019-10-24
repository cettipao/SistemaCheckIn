
package sistemacheckin;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Ticketera {

    public Ticketera() {
        
    }
    
    public void imprimir(Pasajero p, CheckIn c){
        BufferedImage image = null;
        BufferedImage image2 = null;
        Desktop dt = Desktop.getDesktop();
        try {
            image2 = ImageIO.read(new File("img/bagTagTemplate.png"));
            image = ImageIO.read(new File("img/passTemplate.png"));
            
            System.out.println("Imagen Abierta");
        } catch (IOException ex) {
            Logger.getLogger(Ticketera.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Escribir
        
        Graphics2D g = image.createGraphics();
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        g.setPaint(Color.GRAY);
        TextLayout textLayout;
        //Distintas Escrituras
        g.drawString(p.getNombre() + " " + p.getApellido(), 95, 90);
        g.drawString(p.getVuelo().getOrigen().getCiudad(), 95, 135);
        g.drawString(p.getVuelo().getNumVuelo(), 255, 135);
        Format formatter1 = new SimpleDateFormat("HH:mm");
        g.drawString(formatter1.format(p.getVuelo().getHoraSalida()), 340, 135);
        Format formatter2 = new SimpleDateFormat("dd-M-yyyy");
        g.drawString(formatter2.format(p.getVuelo().getHoraSalida()), 340, 175);
        g.drawString(p.getVuelo().getDestino().getCiudad(), 95, 175);
        g.drawString(p.getVuelo().getNumPuerta(), 95, 232);
        g.drawString(c.getNumAsiento(), 142, 232);
        
        g.drawString(p.getNombre() + " " + p.getApellido(), 499, 90);
        g.drawString(p.getVuelo().getOrigen().getCiudad(), 499, 129);
        g.drawString(p.getVuelo().getDestino().getCiudad(), 499, 169);
        font = new Font("Arial", Font.BOLD, 14);
        g.setFont(font);
        g.drawString(p.getVuelo().getNumVuelo(), 499, 215);
        g.drawString(p.getVuelo().getNumPuerta(), 499, 255);
        g.drawString(c.getNumAsiento(), 530, 255);
        g.drawString(formatter1.format(p.getVuelo().getHoraSalida()), 573, 255);
        g.drawString(formatter2.format(p.getVuelo().getHoraSalida()), 573, 215);
        g.dispose();

        //Escribir 2
        Graphics2D g2 = image2.createGraphics();
        int num = 0;
        for (Equipaje e : c.getEquipajes()) {
            Font font3 = new Font("Arial", Font.BOLD, 50);
            g2.setFont(font3);
            g2.setPaint(Color.WHITE);

            g2.drawString(p.getVuelo().getDestino().getCiudad().substring(0, 3), 25, 120);

            Font font4 = new Font("Arial", Font.BOLD, 20);
            g2.setFont(font4);
            g2.setPaint(Color.BLACK);

            if(p.getVuelo().getDestino().getCiudad().length() < 12){
                g2.drawString(p.getVuelo().getDestino().getCiudad(),20, 160);
            }
            else{
                g2.drawString(p.getVuelo().getDestino().getCiudad().substring(0, 12)+"...", 20, 160);
            }
            
            num++;
            try {
                ImageIO.write(image2, "png", new File("img/pass/"+p.getApellido()+"BagTag"+num +".png"));
                File f = new File("img/pass/"+p.getApellido()+"BagTag"+num +".png");
                dt.open(f);
            } catch (IOException ex) {
                Logger.getLogger(Ticketera.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            ImageIO.write(image, "png", new File("img/pass/"+p.getApellido() +".png"));
            
            File f = new File("img/pass/"+p.getApellido() +".png");
            dt.open(f);
            
        } catch (IOException ex) {
            Logger.getLogger(Ticketera.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        


    }
    
    
}
