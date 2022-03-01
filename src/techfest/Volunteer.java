package techfest;

import javax.swing.*;
import java.awt.*;

public class Volunteer
{
    JFrame f1;
    JPanel p1,p2;
    public Volunteer()
    {
        f1 = new JFrame("VOLUNTEER");
        p1 = new JPanel();
        p2 = new JPanel();

        p1.setBounds(0,0,137,650);
        p2.setBounds(140,0,960,650);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.WHITE);

        f1.add(p1);
        f1.add(p2);

        f1.setSize(1100,650);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}