 import javax.swing.*;
 import java.awt.*;
 import java.util.*;

 public class SierpinskiTriangle extends JPanel
 {
public Random rng= new Random();
 
 int x1 = 210;
 int y1 = 10;
 int x2 = 10;
 int y2 = 410;
 int x3 = 410;
 int y3 = 410;
 int d = 7;
 Graphics g;

public void paintComponent(Graphics g){
super.paintComponent(g);
      g.setColor(Color.BLUE);
setBackground(Color.white);

sierpienski( x1, y1,  x2,  y2,  x3,  y3,  d,  g);
 }//end paintComponent

public void sierpienski(int x1,int y1, int x2, int y2, int x3,int y3, int d, Graphics g){
 if (d >= 0)
 {
 g.drawLine(x1, y1, x2, y2);
 g.drawLine(x2, y2, x3, y3);
 g.drawLine(x3, y3, x1, y1);
      
   sierpienski(x1,y1,(x1+x2)/2,(y1+y2)/2,(x1+x3)/2,(y1+y3)/2, d-1, g);
   sierpienski((x1+x2)/2,(y1+y2)/2, x2, y2, (x2+x3)/2,(y2+y3)/2, d-1, g);
   sierpienski((x3+x2)/2,(y3+y2)/2,(x1+x3)/2,(y1+y3)/2, x3, y3, d-1, g);
 }//end if
 }//end sierpienski

public static void main(String args[])
{
JFrame f = new JFrame("SierpinskiTriangle"); //get a frame
f.setBounds(0,0, 450,450);
SierpinskiTriangle c = new SierpinskiTriangle();//the JPanel that you write
 f.add(c);//add the panel to the frame
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }//end main
             }//end class Sierpinski