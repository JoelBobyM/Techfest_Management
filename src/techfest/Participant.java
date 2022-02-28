package techfest;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;

public class Participant {
    JFrame f1;
    JPanel p1;
    JButton b1,b2,b3;
    public Participant()
    {
       f1=new JFrame("PARTICIPANT");
       p1=new JPanel();
       b1=new JButton("VIEW PROFILE");
       b2=new JButton("VIEW EVENT");
       b3=new JButton("REGISTERED EVENT");
       p1.setBackground(new Color(0,0,5,125));
       ImageIcon icon = new ImageIcon("/home/haseen/Downloads/pp.jpg");
       JLabel label = new JLabel(icon);
       
       p1.setBounds(0,0,190,600);
       b1.setBounds(0,100,190,50);
       b2.setBounds(0,160,190,50);
       b3.setBounds(0,220,210,50);
       
       p1.add(b1);p1.add(b2);p1.add(b3);
       f1.add(p1);

       f1.setSize(600,600);
       f1.setLayout(null);
       p1.setLayout(null);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
       f1.setVisible(true);
    }
}
