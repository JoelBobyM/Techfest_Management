package techfest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;

public class Searchparticipant
{
    JFrame f1;
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    Font fn1;
    public Searchparticipant()
    {
       f1=new JFrame("SEARCH PARTICIPANT");
       l1=new JLabel("PARTICIPANT ID:");
       t1=new JTextField(15);
       b1 = new JButton("ENTER");
       fn1=new Font("SansSerif", Font.BOLD, 20);
       ImageIcon icon = new ImageIcon("/home/haseen/Downloads/search.jpg");
       f1.add(new JLabel(icon));
       f1.pack();

       f1.add(l1);
       f1.add(t1);
       f1.add(b1);

       l1.setBounds(60,70,120,30);
       t1.setBounds(180,70,170,30);
       b1.setBounds(100,120,80,30);

       f1.setSize(400,300);
       f1.setLayout(null);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }

}