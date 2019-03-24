import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Registration extends KeyAdapter implements ActionListener
{
	JFrame f;
	JLabel l1;
JLabel l11;
	JLabel l2,l3,l4,l5;
	JTextField t1;
	JTextField t2,t3,t4;
               JTextField p;
	JButton b1;
	JButton b2;
	JButton b3;

	

	
	Registration()
	{
		f=new JFrame("Library Management System");
		
		f.setLayout(null);

		f.setResizable(false);
		f.setLocation(0,0);
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize((screen.width/2+60),(screen.height/2+95));

		

		l1=new JLabel("Enrolment No");
		l2=new JLabel("Student Name");

               l3=new JLabel("Student Address");
		l4=new JLabel(" Phone Number");
l5=new JLabel("Course and Branch");

		t1=new JTextField(200);
		t2=new JTextField(200);
			t3=new JTextField(200);
		t4=new JTextField(200);
	p=new JTextField(200);
		b1=new JButton("Submit");
		b2=new JButton("Back");
		b3=new JButton("Log Out");
	
		l1.setLayout(null);
		l1.setBounds(150,100,100,40);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(150,150,100,40);
		f.add(l2);

		l3.setLayout(null);
		l3.setBounds(150,200,100,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(150,250,100,40);
		f.add(l4);
l5.setLayout(null);
l5.setBounds(150,300,150,40);
f.add(l5);
		t1.setLayout(null);
		t1.setBounds(300,100,200,30);
		f.add(t1);
		t2.setLayout(null);
		t2.setBounds(300,150,200,30);
		f.add(t2);
	       t3.setLayout(null);
		t3.setBounds(300,200,200,30);
		f.add(t3);
		t4.setLayout(null);
		t4.setBounds(300,250,200,30);
		f.add(t4);
p.setLayout(null);
p.setBounds(300,300,200,30);
f.add(p);
		t4.addKeyListener(this);
		b1.setLayout(null);
		b1.setBounds(100,350,150,40);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(260,350,150,40);
		f.add(b2);
		b3.setLayout(null);
		b3.setBounds(420,350,150,40);
		f.add(b3);
  ImageIcon i1 = new ImageIcon("book.jpg");
                l11=new JLabel();
                l11.setLayout(null);
                l11.setBounds(700,0,1110,700);
                l11.setIcon(i1);
                 f.add(l11);
	f.setVisible(true);	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		

	}
	public void keyPressed(KeyEvent EVT) {
    if(EVT.getSource()==t4)
 {
    String value = t4.getText();
    int l = value.length();
    if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9') 
{

        t4.setEditable(true);
       // label.setText("");
    } 
else {
        t4.setEditable(false);
       	JOptionPane.showMessageDialog(null,"only number allow");

        t4.setEditable(true);
       // label.setText("* Enter only numeric digits(0-9)");
    }
}   
}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
                                                String s5=p.getText();
			if(s1.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Student Id");
			}
	            else if(s2.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Studetn Name");
			}
	
	            else if(s3.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Studetn Address");
			}

	            else if(s4.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Studetn Phone");
			}
		     else
			{
			
                   try
		{
			

	                                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
 			ResultSet rs=stat.executeQuery("select * from studentdetail where student_id='"+s1+"'");
			int ctr=0;
 		       while(rs.next())
			{
			ctr++;
			}
			rs.close();
			if(ctr !=0)
			{
				JOptionPane.showMessageDialog(null,"Id All Ready Exists");
			}
			else
			{
                       Connection con1 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");    
			Statement stat1 = con1.createStatement();
 stat1.executeUpdate("insert into studentdetail(student_id,student_name,student_add,student_ph,pass,no_of_books,amount) values                                                        ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','0','0')");

				
			JOptionPane.showMessageDialog(null,"inserted");
			}
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
                                                p.setText(null);
			//rs.close();
		}
			catch(Exception e)
		{
			System.out.println(e);
		}
			}
		}
		
		if(ae.getSource()==b3)
		{
			welcome2 a=new welcome2();
			f.setVisible(false);
		}
if(ae.getSource()==b2)
		{
			welcome l=new welcome();
			f.setVisible(false);
		}
		
	}
	public static void main(String arg[])
{
	Registration r=new Registration();
}
}