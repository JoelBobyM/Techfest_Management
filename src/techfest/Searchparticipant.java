package techfest;

import javax.swing.*;
import java.awt.*;

public class Searchparticipant
{
    JFrame f1;
    JLabel l1,bg;
    JTextField t1;
    JButton b1;
    ImageIcon ic;
    public Searchparticipant()
    {
       f1=new JFrame("SEARCH PARTICIPANT");
       l1=new JLabel("PARTICIPANT ID:");
       t1=new JTextField(15);
       b1 = new JButton("ENTER");
       ic = new ImageIcon("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/search.png");
       bg = new JLabel("",ic,JLabel.CENTER);

       f1.add(l1);
       f1.add(t1);
       f1.add(b1);
       f1.add(bg);

       l1.setBounds(60,70,120,30);
       t1.setBounds(180,70,170,30);
       b1.setBounds(100,120,80,30);
       bg.setBounds(0,0,400,300);

       f1.setSize(400,300);
       f1.setLayout(null);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }

}