package techfest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;


public class Login
{
    JFrame f1;
    JPanel p2;
    JLabel l1,bg,par,vol,l2,l3;
    Font fo1,fo2;
    ImageIcon iibg,iipar,iivol;
    JRadioButton r1,r2;
    BufferedImage imbg,impar,imvol;
    Image dimbg,dimpar,dimvol;
    ButtonGroup bgr;
    JButton b1,b2;
    String role;
    JTextField t1;
    JPasswordField pf1;

    public Login()
    {
        try
        {
            fo1 = new Font("SansSerif", Font.BOLD, 20);
            fo2 = new Font("Lobster", Font.BOLD, 50);
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
            b1 = new JButton("CONTINUE");
            b2 = new JButton("SIGN IN");
            l2 = new JLabel("Name : ");
            l3 = new JLabel("Password : ");
            t1 = new JTextField(15);
            pf1 = new JPasswordField(15);
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
        b1.setBounds(200,350,100,25);

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);

        l1.setFont(fo1);
        l2.setFont(fo1);
        l3.setFont(fo1);

        p2.setBackground(new Color(0,0,0,125));
        r1.setBackground(new Color(0,0,0,0));
        r2.setBackground(new Color(0,0,0,0));
        par.setBackground(Color.WHITE);
        vol.setBackground(Color.WHITE);

        bgr.add(r1);
        bgr.add(r2);
        p2.add(par);
        p2.add(r1);
        p2.add(vol);
        p2.add(r2);
        p2.add(l1);
        p2.add(b1);
        f1.add(p2);
        f1.add(bg);

        f1.setSize(1100,650);
        f1.setLayout(null);
        p2.setLayout(null);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);

        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(r1.isSelected())
                {
                    role = "VOLUNTEER";
                }
                else if(r2.isSelected())
                {
                    role = "PARTICIPANT";
                }
                p2.removeAll();
                p2.revalidate();
                p2.repaint();
                p2.validate();
                addSecondPanel();
            }
        });
    }
    void addSecondPanel()
    {

        p2.setBounds(600,150,330,350);

        l1.setText("Sign In");
        l1.setFont(fo2);

        l1.setBounds(10,30,250,65);
        l2.setBounds(10,135,100,30);
        t1.setBounds(100,135,200,30);
        l3.setBounds(10,185,120,30);
        pf1.setBounds(130,185,170,30);
        b2.setBounds(115,255,100,25);

        p2.add(l1);
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(pf1);
        p2.add(b2);
    }
}
