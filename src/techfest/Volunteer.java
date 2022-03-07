package techfest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
public class Volunteer
{
    JFrame f1;
    JPanel p1,p2;
    ImageIcon iipe;
    Image dimpe;
    BufferedImage impe;
    JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,pe;
    JButton b1,b2,b4,b5,b6;
    JTextField t1,t2,t3,t4,t5;
    Font fo1,fo2,fo3;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup bg1,bg2;
    Connection con;
    PreparedStatement st;
    ResultSet rs;
    String pid,e1,e2,userid,username;
    public Volunteer(String userid) throws Exception
    {
        try
        {
            this.userid = userid;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:joelbobym/408210@localhost:1521:xe");
            st = con.prepareStatement("SELECT VNAME FROM VOLUNTEER WHERE V_ID=?");
            st.setString(1,userid);
            rs = st.executeQuery();
            rs.next();
            username = rs.getString(1);
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
            b4 = new JButton("UPDATE");
            b5 = new JButton("SEARCH");
            b6=new JButton("UPDATE");
            l0=new JLabel("VOLUNTEER DETAILS");
            l1=new JLabel("NAME : ");
            l2=new JLabel("ID : ");
            l3=new JLabel("AGE :");
            l4=new JLabel("DEPT & CLASS :");
            l5 = new JLabel("Hey "+username,JLabel.CENTER);
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
        l6.setBounds(25,100,500,30);
        t5.setBounds(500,100,230,30);
        b5.setBounds(750,100,100,30);
        l7.setBounds(200,200,800,50);
        l8.setBounds(25,300,450,50);
        l9.setBounds(25,350,200,50);
        r1.setBounds(225,350,100,50);
        r2.setBounds(225,400,100,50);
        l10.setBounds(500,300,350,50);
        l11.setBounds(500,350,200,50);
        r3.setBounds(700,350,100,50);
        r4.setBounds(700,400,100,50);
        b6.setBounds(400,480,150,50);

        p1.setBackground(new Color(0,0,5,125));
        t2.setEditable(false);

        p1.add(pe);p1.add(l5);p1.add(b1);p1.add(b2);
        f1.add(p1);
        f1.add(pe);
        f1.add(p2);
        bg1.add(r1); bg1.add(r2);
        bg2.add(r3); bg2.add(r4);

        f1.setSize(1100,650);
        f1.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);
        //f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setVisible(true);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                p2.removeAll();
                p2.revalidate();
                p2.setBounds(200,0,1000,650);
                p2.add(l0);p2.add(l1);p2.add(l2);p2.add(l3);p2.add(l4);
                p2.add(t1);p2.add(t2);p2.add(t3);p2.add(t4);
                p2.add(b4);
                try
                {
                    st = con.prepareStatement("SELECT * FROM VOLUNTEER WHERE V_ID=?");
                    st.setString(1,userid);
                    rs = st.executeQuery();
                    while(rs.next())
                    {
                        t1.setText(rs.getString("VNAME"));
                        t2.setText(rs.getString("V_ID"));
                        t3.setText(String.valueOf(rs.getInt("AGE")));
                        t4.setText(rs.getString("CLASS"));
                    }
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
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
                p2.add(l6); p2.add(t5); p2.add(b5);
            }
        });
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    st = con.prepareStatement("UPDATE VOLUNTEER SET VNAME=?,AGE=?,CLASS=? WHERE V_ID=?");
                    st.setString(1,t1.getText());
                    st.setInt(2, Integer.parseInt(t3.getText()));
                    st.setString(3,t4.getText());
                    st.setString(4,t2.getText());
                    rs = st.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });
        b5.addActionListener(new ActionListener()
        {
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
                p2.add(b6);
                try
                {
                    pid=t5.getText();
                    st=con.prepareStatement("SELECT ENAME FROM PARTICIPANT,EVENT WHERE EVENT1=E_ID AND P_ID=?");
                    st.setString(1,pid);
                    rs=st.executeQuery();
                    while(rs.next())
                    {
                        e1=rs.getString(1);
                        l8.setText("EVENT NAME : "+e1);
                    }
                    st=con.prepareStatement("SELECT ENAME FROM PARTICIPANT,EVENT WHERE EVENT2=E_ID AND P_ID=?");
                    st.setString(1,pid);
                    rs=st.executeQuery();
                    while(rs.next())
                    {
                        e2=rs.getString(1);
                        l10.setText("EVENT NAME : "+e2);
                    }
                    p2.updateUI();
                }
                catch(Exception et)
                {
                    et.printStackTrace();
                }
            }
        });
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    if(r1.isSelected())
                    {
                        st=con.prepareStatement("UPDATE ATTENDANCE SET A_E1='YES' WHERE P_ID=?");
                    }
                    else if(r2.isSelected())
                    {
                        st=con.prepareStatement("UPDATE ATTENDANCE SET A_E1='NO' WHERE P_ID=?");
                    }
                    st.setString(1,pid);
                    rs=st.executeQuery();
                    if(r3.isSelected())
                    {
                        st=con.prepareStatement("UPDATE ATTENDANCE SET A_E2='YES' WHERE P_ID=?");
                    }
                    else if(r4.isSelected())
                    {
                        st=con.prepareStatement("UPDATE ATTENDANCE SET A_E2='NO' WHERE P_ID=?");
                    }
                    st.setString(1,pid);
                    rs=st.executeQuery();
                    JOptionPane.showMessageDialog(null,"UPDATED","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception et)
                {
                    et.printStackTrace();
                }
            }
        });
    }
}