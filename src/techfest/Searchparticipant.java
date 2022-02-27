package techfest;

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
    public Searchparticipant()
    {
       f1=new JFrame("SEARCH PARTICIPANT");
       l1=new JLabel("Participant id:");
       t1=new JTextField(15);
       b1=new JButton("Enter");

       f1.add(l1);
       f1.add(t1);
       f1.add(b1);

       f1.setSize(400,400);
       f1.setLayout(new FlowLayout());
       f1.setVisible(true);
       f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }

}