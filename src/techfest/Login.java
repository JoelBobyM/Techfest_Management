package techfest;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Login
{
    JFrame f1;
    JPanel p1,p2;
    BufferedImage myPicture;
    JLabel picLabel,l1;
    Font fo1;

    public Login()
    {
        fo1 = new Font("SansSerif", Font.BOLD, 30);
        f1 = new JFrame("LOGIN");
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("Choose Account Type");
        try
        {
            myPicture = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/bg.jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        picLabel = new JLabel(new ImageIcon(myPicture));

        p1.setBounds(0,0,450,650);
        p1.setBackground(Color.blue);

        p2.setBounds(450,0,650,650);
        p2.setBackground(Color.white);

        l1.setBounds(10,60,50,80);
        l1.setFont(fo1);

        p2.add(l1);
        f1.add(p2);
        f1.add(p1);

        f1.setSize(1100,650);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}
