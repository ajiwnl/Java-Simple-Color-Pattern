package javaProjectColorUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;public class pattern extends JFrame
{
   private Color[] c,bg;

     public static void main(String arg[]) 
     {
         JFrame frame = new pattern();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         frame.setSize(new Dimension(400,400));
         frame.pack();
         frame.setVisible(true);
       }
     
     public pattern()
     {
         Color indigo = new Color(75, 0, 130); 
         Color violet = new Color(138,43,226);
         Color grayscale = new Color(120,120,120);
         Color darkgreen = new Color (34,139,34);
         Color deepsky = new Color (0,191,255);
         Color darkblue = new Color (0,0,205);
         c = new Color[] {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,darkgreen,deepsky, Color.BLUE,darkblue,
                        indigo,violet};
        bg = new Color[] {grayscale};              
          JPanel panel = new DrawStuff();
          panel.setPreferredSize(new Dimension(400,500));
          add(panel);
     }
     
     class DrawStuff extends JPanel
     {
          int nPoints = 1000;

          public DrawStuff()
          {
               
          }
          
           public void paintComponent(Graphics g) 
           {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D)g;
                g2.translate(20,20);
                boolean black = false;
                
                for(int row = 0; row < c.length; row++)
                {
                    
                     for(int column = 0; column < c.length; column++)
                     {
                         
                          Rectangle2D.Double rect = new Rectangle2D.Double(column*40,row*40,39,39);
                 
                          if(black){
                         
                               g2.setColor(c[row]);
                               g2.fill(rect);
                              
                          }else
                           
                                g2.setColor(c[row]);
                               g2.fill(rect);
                               
                          black = !black;
                     }
                     black = !black;
                }
           }
     }
}
