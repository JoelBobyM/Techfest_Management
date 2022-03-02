package techfest;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class Participant {
    JFrame f1;
    JPanel p1,p2,p3,p4,p5;
    JLabel l,l1,l2,l3,l4,pe,l5,l6,l7,l8,l9,l10;
    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4,b5;
    Font fo1,fo2,fo3;
    ImageIcon iipe;
    Image dimpe;
    BufferedImage impe;
    JComboBox jcb;
    String usid,username,clg;
    int age;
    String[] options;

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public Participant(String userid) throws Exception
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","haseen","haseen");
            pst = con.prepareStatement("SELECT PNAME FROM PARTICIPANT WHERE P_ID=?");
            pst.setString(1,userid);
            rs = pst.executeQuery();
            rs.next();
            username = rs.getString(1);
            
            usid = userid;
            rs.close();
            
            username = "Joel";
            fo1 = new Font("SansSerif", Font.BOLD, 30);
            fo2 = new Font("Lobster", Font.BOLD, 50);
            fo3 = new Font("SansSerif", Font.BOLD, 20);
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
            b5=new JButton("SELECT");
            l=new JLabel("PARTICIPANT DETAILS");
            l1=new JLabel("NAME : ");
            l2=new JLabel("ID : ");
            l3=new JLabel("AGE :");
            l4=new JLabel("COLLEGE :");
            l5 = new JLabel("Hey "+username,JLabel.CENTER);
            l6=new JLabel("CHOOSE AN EVENT:");
            l7=new JLabel("EVENT ID:");
            l8=new JLabel("MENTOR:");
            l9=new JLabel("SCHEDULED TIME:");
            l10=new JLabel("EVENT DETAILS");
            jl1=new JLabel("REGISTERED EVENTS");
            jl2=new JLabel("EVENT NAME:");
            jl5=new JLabel("EVENT NAME:");
            jl3=new JLabel("TIME:");
            jl6=new JLabel("TIME:");
            jl4=new JLabel("MENTOR:");
            jl7=new JLabel("MENTOR:");
            t1 = new JTextField(50);
            t2 = new JTextField(50);
            t3 = new JTextField(50);
            t4 = new JTextField(50);
            impe = ImageIO.read(new File("/home/haseen/Documents/java/Techfest_Management/img-src/person.png"));
            dimpe = impe.getScaledInstance(170, 140, Image.SCALE_SMOOTH);
            iipe = new ImageIcon(dimpe);
            pe = new JLabel(iipe);
            options=new String[]{"webinar","workshop","hackathon"};
            jcb=new JComboBox(options);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        l.setForeground(Color.RED);
        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l7.setForeground(Color.BLACK);
        l8.setForeground(Color.BLACK);
        l9.setForeground(Color.BLACK);
        l10.setForeground(Color.RED);
        jl1.setForeground(Color.RED);
        jl2.setForeground(Color.BLACK);
        jl3.setForeground(Color.BLACK);
        jl4.setForeground(Color.BLACK);
        jl5.setForeground(Color.BLACK);
        jl6.setForeground(Color.BLACK);
        jl7.setForeground(Color.BLACK);

        l.setFont(fo2); 
        l1.setFont(fo1);
        l2.setFont(fo1);
        l3.setFont(fo1);
        l4.setFont(fo1);
        l7.setFont(fo3);
        l8.setFont(fo3);
        l9.setFont(fo3);
        l10.setFont(fo2);
        jl1.setFont(fo2);
        jl2.setFont(fo3);
        jl3.setFont(fo3);
        jl4.setFont(fo3);
        jl5.setFont(fo3);
        jl6.setFont(fo3);
        jl7.setFont(fo3);

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
       jcb.setBounds(200,100,500,30);
       l6.setBounds(50,100,170,30);
       b5.setBounds(730,100,80,30);
       l7.setBounds(100,280,200,30);
       l8.setBounds(100,340,200,30);
       l9.setBounds(100,400,200,30);
       l10.setBounds(180,180,800,60);
       jl1.setBounds(150,50,800,60);
       jl2.setBounds(50,180,200,30);
       jl3.setBounds(50,240,200,30);
       jl4.setBounds(50,300,200,30);
       jl5.setBounds(450,180,200,30);
       jl6.setBounds(450,240,200,30);
       jl7.setBounds(450,300,200,30);

       p1.add(pe);p1.add(l5);p1.add(b1);p1.add(b2);p1.add(b3);

       f1.add(p1);f1.add(p2);

       f1.setSize(1100,650);
       f1.setLayout(null);
       p1.setLayout(null);
       p2.setLayout(null);
       p3.setLayout(null);
       //f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
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
            try
            {
                pst = con.prepareStatement("SELECT * FROM PARTICIPANT WHERE P_ID=?");
                pst.setString(1,usid);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    username = rs.getString(2);
                    age = rs.getInt(4);
                    clg = rs.getString(5);

                    t1.setText(username);
                    t2.setText(usid);
                    t3.setText(""+age);
                    t4.setText(clg);

                    p2.updateUI();
                }
                rs.close();
            }
            catch(Exception et)
            {
                et.printStackTrace();
            }
        }
       });
       b2.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
            p2.removeAll();
            p2.revalidate();
            p2.setBounds(200,0,900,650);
            p2.add(jcb);p2.add(l6);p2.add(b5);
        }
       });
       b3.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
               p2.removeAll();
               p2.revalidate();
               p2.setBounds(200,0,910,650);
               p2.add(jl1);p2.add(jl2);p2.add(jl3);p2.add(jl4);p2.add(jl5);p2.add(jl6);p2.add(jl7);
           }
       });
       b4.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {

           }
       });
       b5.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
             p2.add(l7);p2.add(l8);p2.add(l9);p2.add(l10);
             p2.updateUI();
           }
       });
    }
}
