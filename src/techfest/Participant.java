package techfest;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Participant {
    JFrame f1;
    JPanel p1,p2,p3,p4,p5;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3;
    public Participant()
    {
       f1=new JFrame("PARTICIPANT");
       p1=new JPanel();
       p2=new JPanel();
       p3=new JPanel();
       p4=new JPanel();
       p5=new JPanel();
       b1=new JButton("VIEW PROFILE");
       b2=new JButton("VIEW EVENT");
       b3=new JButton("REGISTERED EVENT");
       l=new JLabel("PARTICIPANT DETAILS");
       l1=new JLabel("NAME:");
       l2=new JLabel("ID:");
       l3=new JLabel("AGE:");
       l4=new JLabel("COLLEGE:");
       l5=new JLabel();l6=new JLabel();l7=new JLabel();l8=new JLabel();
       p1.setBackground(new Color(0,0,5,125));
       p2.setBackground(new Color(30,17,5,100));
       
       p1.setBounds(0,0,190,600);
       p2.setBounds(200,0,490,600);
       p3.setBounds(30,70,350,450);
       b1.setBounds(0,100,190,50);
       b2.setBounds(0,160,190,50);
       b3.setBounds(0,220,210,50);
       l.setBounds(90,40,200,50);
       l1.setBounds(90,90,200,50);
       l2.setBounds(90,130,200,50);
       l3.setBounds(90,170,200,50);
       l4.setBounds(90,210,200,50);
       l5.setBounds(130,90,200,50);
       l6.setBounds(130,130,200,50);
       l7.setBounds(130,170,200,50);
       l8.setBounds(130,210,200,50);
       
       p1.add(b1);p1.add(b2);p1.add(b3);
       p3.add(l);p3.add(l1);p3.add(l2);p3.add(l3);p3.add(l4);p3.add(l5);p3.add(l6);p3.add(l7);p3.add(l8);
       f1.add(p1);f1.add(p2);

       f1.setSize(600,600);
       p3.setVisible(false);
       p4.setVisible(false);
       p5.setVisible(false);
       f1.setLayout(null);
       p1.setLayout(null);
       p2.setLayout(null);
       p3.setLayout(null);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
       f1.setVisible(true);

       b1.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
            p2.add(p3);
        }
       });
       b2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
            p2.removeAll();
            p2.revalidate();p2.repaint();
        }
       });
    }
}
