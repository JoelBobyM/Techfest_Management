package techfest;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Participant {
    JFrame f1;
    JPanel p1,p2,p3,p4,p5;
    JLabel l,l1,l2,l3,l4,pe,l5;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    Font fo1,fo2;
    ImageIcon iipe;
    Image dimpe;
    BufferedImage impe;

    public Participant()
    {
        try
        {
            fo1 = new Font("SansSerif", Font.BOLD, 30);
            fo2 = new Font("Lobster", Font.BOLD, 50);
            f1=new JFrame("PARTICIPANT");
            p1=new JPanel();
            p2=new JPanel();
            p3=new JPanel();
            p4=new JPanel();
            p5=new JPanel();
            b1=new JButton("VIEW PROFILE");
            b2=new JButton("VIEW EVENT");
            b3=new JButton("REGISTERED EVENT");
            b4 = new JButton("UPDATE");
            l=new JLabel("PARTICIPANT DETAILS");
            l1=new JLabel("NAME : ");
            l2=new JLabel("ID : ");
            l3=new JLabel("AGE :");
            l4=new JLabel("COLLEGE :");
            l5 = new JLabel("Hey........",JLabel.CENTER);
            t1 = new JTextField(50);
            t2 = new JTextField(50);
            t3 = new JTextField(50);
            t4 = new JTextField(50);
            impe = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/person.png"));
            dimpe = impe.getScaledInstance(170, 140, Image.SCALE_SMOOTH);
            iipe = new ImageIcon(dimpe);
            pe = new JLabel(iipe);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        l.setForeground(Color.RED);
        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);

        l.setFont(fo2);
        l1.setFont(fo1);
        l2.setFont(fo1);
        l3.setFont(fo1);
        l4.setFont(fo1);

       p1.setBackground(new Color(0,0,5,125));
       
       p1.setBounds(0,0,190,650);
       p2.setBounds(200,0,950,650);
       pe.setBounds(10,10,170,160);
       l5.setBounds(10,150,190,30);
       b1.setBounds(0,200,190,50);
       b2.setBounds(0,270,190,50);
       b3.setBounds(0,340,190,50);
       l.setBounds(150,100,800,60);
       l1.setBounds(150,200,200,40);
       l2.setBounds(150,260,200,40);
       l3.setBounds(150,320,200,40);
       l4.setBounds(150,380,200,40);
       t1.setBounds(360,200,300,40);
       t2.setBounds(360,260,300,40);
       t3.setBounds(360,320,300,40);
       t4.setBounds(360,380,300,40);
       b4.setBounds(350,450,150,50);


       p1.add(pe);p1.add(l5);p1.add(b1);p1.add(b2);p1.add(b3);

       f1.add(p1);f1.add(p2);

       f1.setSize(1100,650);
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
            p2.removeAll();
            p2.revalidate();
            p2.setBounds(200,0,1000,650);
            p2.add(l);p2.add(l1);p2.add(l2);p2.add(l3);p2.add(l4);
            p2.add(t1);p2.add(t2);p2.add(t3);p2.add(t4);
            p2.add(b4);
        }
       });
       b2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
            p2.removeAll();
            p2.revalidate();
            p2.setBounds(200,0,900,650);
        }
       });
       b3.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               p2.removeAll();
               p2.revalidate();
               p2.setBounds(200,0,910,650);
           }
       });
       b4.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {

           }
       });
    }
}
