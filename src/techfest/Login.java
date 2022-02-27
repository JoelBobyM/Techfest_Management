package techfest;

import javax.swing.*;
import java.awt.*;

public class Login
{
    JFrame f1;
    JPanel p1,p2;
    JLabel l1,bg;
    Font fo1;
    ImageIcon img;
    public Login()
    {
        fo1 = new Font("SansSerif", Font.BOLD, 20);
        f1 = new JFrame("LOGIN");
        p2 = new JPanel();
        l1 = new JLabel("Choose Account Type");
        img = new ImageIcon("/home/joelbobym/Documents/JAVA/Techfest_Management/bg.jpg");
        bg = new JLabel("",img,JLabel.CENTER);

        bg.setBounds(0,0,1100,650);

        p2.setBounds(600,100,330,400);
        p2.setBackground(Color.white);

        l1.setBounds(10,20,250,20);
        l1.setFont(fo1);

        p2.add(l1);

        f1.add(p2);
        f1.add(bg);

        f1.setSize(1100,650);
        f1.setLayout(null);
        p2.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}
