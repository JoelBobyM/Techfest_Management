package techfest;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;

public class Searchparticipant
{
    JFrame f1;
    JLabel l1;
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
       try
        {
            img = ImageIO.read(new File("/home/haseen/Downloads/search.jpg"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        dimg = img.getScaledInstance(1100, 650, Image.SCALE_SMOOTH);
        im = new ImageIcon(dimg);

        b1 = new JButton(im);
       

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