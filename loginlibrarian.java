
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class loginlibrarian implements ActionListener
{
JFrame f2;
JLabel l2,l3,l4;
ImageIcon k2;
JButton b1,b2,b3,b4;
JPasswordField p,p1;
TextField t,t4;

loginlibrarian()
{
f2=new JFrame("Login");
f2.setSize(433,391);
f2.setLocation(0,0);
f2.setResizable(false);
f2.setVisible(false);
f2.setLocation(885,0);
f2.setLayout(null);
l2=new JLabel();
l2.setBounds(0,0,433,391);
k2=new ImageIcon("p2.gif");
f2.add(l2);
l2.setIcon(k2);
l3=new JLabel("I.d. No.");
l3.setBounds(76,220,85,60);
l2.add(l3);
l4=new JLabel("Password");
l4.setBounds(76,230,100,100);
l2.add(l4);
t=new TextField();
t.setBounds(172,240,100,25);
l2.add(t);
p=new JPasswordField();
p.setBounds(172,270,100,25);
l2.add(p);
b1=new JButton("Login");
b1.setBounds(121,300,70,25);
l2.add(b1);
b2=new JButton("Exit");
b2.setBounds(200,300,70,25);
l2.add(b2);
b2.addActionListener(this);
b1.addActionListener(this);
f2.setVisible(true);
b3=new JButton("Change password");
b3.setBounds(100,331,140,25);
//l2.add(b3);
b3.addActionListener(this);
b4=new JButton("Change I.D. no.");
b4.setBounds(200,331,140,25);
//l2.add(b4);
b4.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b3)
{
changepas b=new changepas();
f2.setVisible(false);
}
if(ae.getSource()==b4)
{
changenam b=new changenam();
f2.setVisible(false);
}



if(ae.getSource()==b2)
{
f2.setVisible(false);
welcome2 a=new welcome2();
}

if(ae.getSource()==b1)
{
try
{
String s4=t.getText();
System.out.println("Bye..........1");
String s5=p.getText();

System.out.println("Bye..........5555");
Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Bye..........2");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kumar098");  
System.out.println("Bye..........3");  
Statement stat=con.createStatement();
System.out.println("Bye..........4");

ResultSet rs=stat.executeQuery(" select * from librarian where id='"+s4+"' and password='"+s5+"' ");
System.out.println("Bye..........5");
int ctr=0;
System.out.println("Bye..........6");
while(rs.next())
{
ctr++;
}
rs.close();
if(ctr!=0) 
{
welcome w=new welcome();
f2.setVisible(false);
}
else
{
JOptionPane.showMessageDialog(null,"Wrong Name-Password combination !");
welcome2 a=new welcome2();
}
t.setText("");
p.setText("");
}catch(Exception e)
{System.out.println("Bye..........4444"+e);
}
}
}

public static void main(String ar[])
{
loginlibrarian b=new loginlibrarian();
}
}


