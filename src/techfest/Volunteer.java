package techfest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Volunteer
{
    JFrame f1;
    JPanel p1,p2;
    ImageIcon iipe;
    Image dimpe;
    BufferedImage impe;
    JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,pe;
    JButton b1,b2,b3,b4,b5;
    JTextField t1,t2,t3,t4,t5;
    Font fo1,fo2,fo3;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup bg1,bg2;
    public Volunteer()
    {
        try
        {
            fo1 = new Font("SansSerif", Font.BOLD, 30);
            fo2 = new Font("Lobster", Font.BOLD, 50);
            fo3 = new Font("SansSerif", Font.BOLD, 20);
            f1 = new JFrame("VOLUNTEER");
            p1 = new JPanel();
            p2 = new JPanel();
            impe = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/person.png"));
            dimpe = impe.getScaledInstance(170, 140, Image.SCALE_SMOOTH);
            iipe = new ImageIcon(dimpe);
            pe = new JLabel(iipe);
            b1=new JButton("VIEW PROFILE");
            b2=new JButton("SEARCH BY ID");
            b3=new JButton("SEARCH BY EVENT");
            b4 = new JButton("UPDATE");
            b5 = new JButton("SEARCH");
            l0=new JLabel("VOLUNTEER DETAILS");
            l1=new JLabel("NAME : ");
            l2=new JLabel("ID : ");
            l3=new JLabel("AGE :");
            l4=new JLabel("DEPT & CLASS :");
            l5 = new JLabel("Hey.....",JLabel.CENTER);
            t1 = new JTextField(50);
            t2 = new JTextField(50);
            t3 = new JTextField(50);
            t4 = new JTextField(50);
            t5 = new JTextField(50);
            l6 = new JLabel("ENTER THE PARTICIPANT ID : ");
            l7 = new JLabel("REGISTERED EVENT'S");
            l8 = new JLabel("EVENT NAME : ");
            l9 = new JLabel("IS ATTENDING ? ");
            r1 = new JRadioButton("YES");
            r2 = new JRadioButton("No");
            bg1 = new ButtonGroup();
            l10 = new JLabel("EVENT NAME : ");
            l11 = new JLabel("IS ATTENDING ? ");
            r3 = new JRadioButton("YES");
            r4 = new JRadioButton("No");
            bg2 = new ButtonGroup();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        l0.setForeground(Color.RED);
        l7.setForeground(Color.RED);

        l0.setFont(fo2);
        l1.setFont(fo3);
        l2.setFont(fo3);
        l3.setFont(fo3);
        l4.setFont(fo3);
        l6.setFont(fo1);
        l7.setFont(fo2);
        l8.setFont(fo3);
        l9.setFont(fo3);
        l10.setFont(fo3);
        l11.setFont(fo3);
        r1.setFont(fo3);
        r2.setFont(fo3);
        r3.setFont(fo3);
        r4.setFont(fo3);

        p1.setBounds(0,0,190,650);
        pe.setBounds(10,10,170,160);
        p2.setBounds(200,0,950,650);
        l5.setBounds(10,150,190,30);
        b1.setBounds(0,200,190,50);
        b2.setBounds(0,270,190,50);
        b3.setBounds(0,340,190,50);
        l0.setBounds(150,100,800,60);
        l1.setBounds(150,200,200,40);
        l2.setBounds(150,260,200,40);
        l3.setBounds(150,320,200,40);
        l4.setBounds(150,380,300,40);
        t1.setBounds(400,200,300,40);
        t2.setBounds(400,260,300,40);
        t3.setBounds(400,320,300,40);
        t4.setBounds(400,380,300,40);
        b4.setBounds(400,450,150,50);
        l6.setBounds(25,100,450,30);
        t5.setBounds(480,100,250,30);
        b5.setBounds(750,100,100,30);
        l7.setBounds(200,200,800,50);
        l8.setBounds(100,300,200,50);
        l9.setBounds(100,350,200,50);
        r1.setBounds(300,350,100,50);
        r2.setBounds(300,400,100,50);
        l10.setBounds(500,300,200,50);
        l11.setBounds(500,350,200,50);
        r3.setBounds(700,350,100,50);
        r4.setBounds(700,400,100,50);

        p1.setBackground(new Color(0,0,5,125));

        p1.add(pe);p1.add(l5);p1.add(b1);p1.add(b2);p1.add(b3);
        f1.add(p1);
        f1.add(pe);
        f1.add(p2);
        bg1.add(r1); bg1.add(r2);
        bg2.add(r3); bg2.add(r4);

        f1.setSize(1100,650);
        f1.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);

        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                p2.removeAll();
                p2.revalidate();
                p2.setBounds(200,0,1000,650);
                p2.add(l0);p2.add(l1);p2.add(l2);p2.add(l3);p2.add(l4);
                p2.add(t1);p2.add(t2);p2.add(t3);p2.add(t4);
                p2.add(b4);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                p2.removeAll();
                p2.revalidate();
                p2.setBounds(200,0,900,650);
                p2.add(l6); p2.add(t5); p2.add(b5);
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
        b5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                p2.add(l7);
                p2.add(l8);
                p2.add(l9);
                p2.add(r1);
                p2.add(r2);
                p2.add(l10);
                p2.add(l11);
                p2.add(r3);
                p2.add(r4);
                p2.updateUI();
            }
        });
    }
}