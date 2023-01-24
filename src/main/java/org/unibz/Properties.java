package org.unibz;

import java.awt.*;
import javax.swing.*;
 /**
  * Class Properties implements methods to show properties in the offer.
  * Covered topic: Graphical user interface (Java GUI Swing) 
  * @author isidora.erakovic
  *
  */
@SuppressWarnings("serial")
public class Properties extends JFrame {
  
   public Properties() {
      Container cp = getContentPane();
      cp.setLayout(null); 
      JPanel p1 = new JPanel();
      p1.setBounds(50, 50, 300, 250);
      p1.setBackground(Color.RED);
      cp.add(p1);
      JLabel label1 = new JLabel (new ImageIcon("src/main/resources/photos/Apartment2.jpg"));
      p1.add(label1);
      JLabel label2 = new JLabel ("Penthouse");
      p1.add(label2);
      JPanel p2 = new JPanel();
      p2.setBounds(400,400, 300, 250);
      p2.setBackground(Color.BLUE);
      cp.add(p2);
      JLabel label = new JLabel (new ImageIcon("src/main/resources/photos/Apartment1.jpg"));
      p2.add(label);
      JLabel label3 = new JLabel ("Two bedroom");
      p2.add(label3);
      JPanel p3 = new JPanel();
      p3.setBounds(400,50, 300, 220);
      p3.setBackground(Color.RED);
      cp.add(p3);
      JLabel label4 = new JLabel (new ImageIcon("src/main/resources/photos/One bedroom.jpg"));
      p3.add(label4);
      JLabel label5 = new JLabel ("Penthouse layout");
      p3.add(label5);
      JPanel p6 = new JPanel();
      p6.setBounds(50,400, 300, 220);
      p6.setBackground(Color.BLUE);
      cp.add(p6);
      JLabel label6 = new JLabel (new ImageIcon("src/main/resources/photos/index.jpg"));
      p6.add(label6);
      JLabel label7 = new JLabel ("Two bedroom layout");
      p6.add(label7);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("PROPERTIES IN OUR OFFER");
      setSize(800,800);
      setVisible(true);
      JButton btn = new JButton("Click to close!");
      btn.setLayout(null);
      btn.setBounds(300,650,150,30); 
      cp.add(btn);
      btn.setBackground(Color.yellow);
      btn.addActionListener(e -> {
      dispose();
      });
     
   }
 
 
   public static void main(String[] args) {
     
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Properties(); 
         }
      });
    
   }
  

}