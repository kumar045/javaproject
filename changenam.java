import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

public class changenam implements ActionListener
{
	JFrame f;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;

	JTextField t1;
	JTextField t2;

	JButton b1;
	JButton b2;
	String s2;
	
	changenam()
	{
	
		f=new JFrame();
		f.setLayout(null);
		f.setLocation(400,200);
		f.setSize(600,400);
		f.setVisible(true);
		
		//l1=new JLabel("Old ID");
		
		l3=new JLabel("Old ID");
		l4=new JLabel("New ID");
		
		t1=new JTextField(40);
		t2=new JTextField(40);
		b1=new JButton("Update");
		b2=new JButton("Cancel");
	
	
		l3.setLayout(null);
		l3.setBounds(30,80,100,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(30,140,100,40);
		f.add(l4);
		t1.setLayout(null);
		t1.setBounds(150,80,120,30);
		f.add(t1);
		t2.setLayout(null);
		t2.setBounds(150,140,120,30);
		f.add(t2);
		b1.setLayout(null);
		b1.setBounds(80,200,100,30);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(200,200,100,30);
		f.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
				try
				{
				 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	                                                System.out.println("hi");
                                                               Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
	                                               System.out.println("hi");
                                                               Statement stat=con.createStatement();
				stat.executeUpdate("update librarian set id='"+t2.getText()+"' where                   id='"+t1.getText()+"' ");
				JOptionPane.showMessageDialog(null, "Name supdated successfully!!");
				//f.setVisible(false);
				t1.setText("");
				t2.setText("");
 
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			
		}
		if(ae.getSource()==b2)
		{
f.setVisible(false);	
		}
	}

}