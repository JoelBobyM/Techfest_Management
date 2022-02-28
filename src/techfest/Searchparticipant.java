package techfest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Searchparticipant
{
    JFrame f1;
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    ImageIcon im;

    BufferedImage img;
    Image dimg;
    public Searchparticipant()
    {
       f1=new JFrame("SEARCH PARTICIPANT");
       l1=new JLabel("PARTICIPANT ID:");
       t1=new JTextField(15);
       b1 = new JButton("ENTER");

       try
       {
           img = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/search1.png"));
           dimg = img.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
           im = new ImageIcon(dimg);
           l2 = new JLabel("",im,JLabel.CENTER);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

       f1.add(l1);
       f1.add(t1);
       f1.add(b1);
       f1.add(l2);

       l1.setBounds(60,70,120,30);
       t1.setBounds(180,70,170,30);
       b1.setBounds(100,120,80,30);
       l2.setBounds(0,0,400,300);

       f1.setSize(400,300);
       f1.setLayout(null);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }

}