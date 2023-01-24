package org.unibz;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
 /**
  * Class Home is providing link to the Website which is under construction
  * Covered topics: Graphical user interface (Java GUI Swing)
  * @author isidora.erakovic
  *
  */

@SuppressWarnings("serial")
public class Home extends JFrame {
	
    private String text = "Click here to visit our website";
    private JLabel hyperlink = new JLabel(text);
 
    public Home() throws HeadlessException {
        super();
       setTitle("Wellcome");
       hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(new Cursor(Cursor.HAND_CURSOR));
         hyperlink.addMouseListener(new MouseAdapter() {
           @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://real358.wordpress.com/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                hyperlink.setText(text);
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                hyperlink.setText("<html><a href=''>" + text + "</a></html>");
            }
 
        });
 
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.YELLOW);
        getContentPane().add(hyperlink);
        JLabel l3=new JLabel(new ImageIcon("src/main/resources/photos/home.jpg")); 
        add(l3);
        JLabel l4=new JLabel("Properties to call home\r\n."); 
        add(l4);
        setSize(400, 400);
        setLocationRelativeTo(null);
        JButton btn = new JButton("Click to close!");
        btn.setLayout(null);
        btn.setBounds(200,500,150,30); 
        add(btn);
        btn.setBackground(Color.blue);
        btn.addActionListener(e -> {
           dispose();
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                new Home().setVisible(true);;
            }
        });;
    }
}