import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class loginstudent implements ActionListener
{
JFrame f2;
JLabel l2,l3,l4;
ImageIcon k2;
JButton b1,b2;
JPasswordField p;
TextField t;

loginstudent()
{
f2=new JFrame("Login");
f2.setSize(433,391);
f2.setLocation(0,0);
f2.setResizable(false);
f2.setVisible(false);
f2.setLayout(null);
l2=new JLabel();
l2.setBounds(0,0,433,391);
k2=new ImageIcon("p2.gif");
f2.add(l2);
l2.setIcon(k2);
l3=new JLabel("Enrolment No.");
l3.setBounds(70,220,85,60);
l2.add(l3);

t=new TextField();
t.setBounds(172,240,100,25);
l2.add(t);

b1=new JButton("Login");
b1.setBounds(100,300,80,25);
l2.add(b1);
b2=new JButton("Exit");
b2.setBounds(200,300,80,25);
l2.add(b2);
b2.addActionListener(this);
b1.addActionListener(this);
f2.setVisible(true);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{
f2.setVisible(false);
}
if(ae.getSource()==b1)
{
f2.setVisible(false);
}
}
public static void main(String ar[])
{
loginstudent a=new loginstudent();
}
}


