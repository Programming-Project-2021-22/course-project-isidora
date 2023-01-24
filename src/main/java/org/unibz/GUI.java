package org.unibz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Class GUI is showing future projects.
 * Covered topics: Graphical user interface (Java GUI Swing), lambda expression
 * @author isidora.erakovic
 *
 */
public class GUI {
	GUI() {    
		   
		      }
  
   public static void main(String[] args){
      JFrame frame = new JFrame ("Future project");
      frame.setVisible(true);
      frame.setSize(400,400);
      JPanel panel = new JPanel();
      frame.add(panel);
      JButton button = new JButton ("Future projects");
      panel.add(button);
      button.addActionListener(new Action());
      Button b=new Button("More details");  
      b.setBounds(50,50,80,50); 
      b.addActionListener(e -> System.out.println("This projects are still in progress")); 
      panel.add(b);
      b.setBounds(150,200,80,50); 
      JLabel label = new JLabel ("This buildings shoud be completed in 2023");
      panel.add(label);
      JButton btn = new JButton("Click to close!");
      btn.setLayout(null);
      btn.setBounds(200,300,150,30); 
      panel.add(btn);
      btn.setBackground(Color.red);
      btn.addActionListener(e -> {
         frame.dispose();
      });
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
     
        static class Action implements ActionListener {
            public void actionPerformed (ActionEvent e) {
            JFrame frame2 = new JFrame("Milano - Via del Corso ");
            frame2.setVisible(true);
            frame2.setSize(700,400);
            frame2.getContentPane().setBackground(Color.red);
            JLabel label = new JLabel (new ImageIcon("src/main/resources/photos/Building.jpg"));
            JPanel panel = new JPanel ();
            frame2.add(panel);
            panel.add(label);
            JLabel label3 = new JLabel (new ImageIcon("src/main/resources/photos/Building2.jpg"));
            panel.add(label3);
            JLabel label4 = new JLabel ("We concentrate entirely on new build apartments and houses.");
            panel.add(label4);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            JButton button=new JButton("Close Window"); 
            panel.add(button);
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            button.addActionListener(event->{
                frame2.dispose();
            });
         }
        }
    
  
}