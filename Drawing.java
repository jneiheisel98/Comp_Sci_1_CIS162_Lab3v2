
/**
 * Write a description of class buscard here.
 *
 * @author Jacob Neiheisel
 * @version 15 August 2020 version one
 */

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.lang.ClassLoader;
import java.net.*;
public class Drawing extends JPanel{
        public static void estabframe() {
        JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
      
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);

        // Get the current width and height of the drawing.
        int drawing_width = getWidth();
        int drawing_height = getHeight();
        // optional: paint the background color (default is white)
        setBackground(new Color(173, 216,230));

        // draw a solid and empty rectangle
        g.setColor(new Color(169,169,169));
        
        g.fillRect(0,drawing_height*30/40, drawing_width, drawing_height*10/40);
        g.setColor(new Color(255,255,0));
            g.fillRect(0,drawing_height*345/400, drawing_width, drawing_height*1/40);
            g.fillOval(drawing_width*475/600, drawing_height*125/ 4000, drawing_width*95/600, drawing_height*10/40);
            g.drawOval(drawing_width*4660/6000, drawing_height*95/ 4000, drawing_width*110/600, drawing_height*11/40);
 
            
            g.setColor(new Color(0,0,125));
            g.fillRect(drawing_width*30/60,drawing_height*1300/4000, drawing_width*1250/6000, drawing_height*8/40);
            g.fillRect(drawing_width*75/600,drawing_height*2075/4000, drawing_width*45/60, drawing_height*1200/4000);
            int[]x={drawing_width*30/60+drawing_width*1250/6000,drawing_width*30/60+drawing_width*1250/6000,drawing_width*30/60+drawing_width*1250/6000+drawing_width*10/60};    
        int[]y={drawing_height*1300/4000,drawing_height*2075 / 4000,drawing_height*2075 / 4000}; 
         
        g.fillPolygon(x,y,3);
        // above 3 lines fromhttp://java2everyone.blogspot.com/2009/02/draw-triangle-in-jpanel.html
        int[]x1={drawing_width*28/60+drawing_width*1250/6000,drawing_width*28/60+drawing_width*1250/6000,drawing_width*28/60+drawing_width*1250/6000+drawing_width*10/60};    
        int[]y1={drawing_height*1350/4000,drawing_height*2000 / 4000,drawing_height*2000 / 4000}; 
        int[]x2={drawing_width*29/60+drawing_width*1225/6000,drawing_width*29/60+drawing_width*1225/6000,drawing_width*26/60+drawing_width*1225/6000+drawing_width*10/60};    
        int[]y2={drawing_height*1475/4000,drawing_height*1950 / 4000,drawing_height*1950 / 4000}; 

       
      
        
        

        
        
        g.setColor(new Color(255,255,255)); 
         g.fillPolygon(x1,y1,3);
         
         g.fillRect(drawing_width*31/60,drawing_height*1400/4000, drawing_width*8/60, drawing_height*6/40);
         
         g.setColor(new Color(255,0,0)); 
         g.drawPolygon(x2,y2,3); 
         g.drawRect(drawing_width*32/60,drawing_height*1440/4000, drawing_width*6/60, drawing_height*5/40);
 
        g.drawLine(drawing_width*75/600, drawing_height*2075/4000, drawing_width*75/600+drawing_width*225/600, drawing_height*2075/4000);
        g.setColor(new Color(0,0,0));
        g.fillOval(drawing_width*95/600, drawing_height*2775/ 4000, drawing_width*100/600, drawing_height*11/40);
        g.fillOval(drawing_width*395/600, drawing_height*2775/ 4000, drawing_width*100/600, drawing_height*11/40);
        g.setColor(new Color(255,69,0));
        Font font = new Font("Courier New", Font.BOLD, 18);
        g.setFont(font);
        g.drawString("Jacob Neiheisel", drawing_width*16/60, drawing_height*3/40);
        g.drawString("A Chevrolet Silverado in summer.", drawing_width*8/60, drawing_height*7/40);
 
       
    } 
}