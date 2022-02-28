package techfest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class Login
{
    JFrame f1;
    JPanel p2;
    JLabel l1,bg,par,vol;
    Font fo1;
    ImageIcon iibg,iipar,iivol;
    JRadioButton r1,r2;
    BufferedImage imbg,impar,imvol;
    Image dimbg,dimpar,dimvol;
    ButtonGroup bgr;

    public Login()
    {
        try
        {
            fo1 = new Font("SansSerif", Font.BOLD, 20);
            f1 = new JFrame("LOGIN");
            p2 = new JPanel();
            l1 = new JLabel("Choose Account Type");
            imbg = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/bg.jpg"));
            dimbg = imbg.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
            iibg = new ImageIcon(dimbg);
            bg = new JLabel("",iibg,JLabel.CENTER);
            impar = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/participant.png"));
            dimpar = impar.getScaledInstance(150,200,Image.SCALE_SMOOTH);
            iipar = new ImageIcon(dimpar);
            par = new JLabel("",iipar,JLabel.CENTER);
            r1 = new JRadioButton();
            imvol = ImageIO.read(new File("/home/joelbobym/Documents/JAVA/Techfest_Management/img-src/volunteer.png"));
            dimvol = imvol.getScaledInstance(150,200,Image.SCALE_SMOOTH);
            iivol = new ImageIcon(dimvol);
            vol = new JLabel("",iivol,JLabel.CENTER);
            r2 = new JRadioButton();
            bgr = new ButtonGroup();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        bg.setBounds(0,0,1100,650);
        p2.setBounds(600,100,330,400);
        l1.setBounds(10,20,250,25);
        par.setBounds(10,100,150,200);
        r1.setBounds(80,300,20,20);
        vol.setBounds(160,100,150,200);
        r2.setBounds(230,300,20,20);

        l1.setForeground(Color.WHITE);
        r1.setBackground(new Color(0,0,0,0));
        r2.setBackground(new Color(0,0,0,0));
        l1.setFont(fo1);

        p2.setBackground(new Color(0,0,0,125));

        bgr.add(r1);
        bgr.add(r2);
        p2.add(par);
        p2.add(r1);
        p2.add(vol);
        p2.add(r2);
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
