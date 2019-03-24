import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public class addbook implements ActionListener,KeyListener
{
	JFrame f;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l;

	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;

	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JMenuBar mb;
	JMenu m1;
	JMenu m2;
	JMenu m3;
	JMenu m4;
	JMenuItem mi1;
	JMenuItem mi2;
	JMenuItem mi3;
	JMenuItem mi4;
	JMenuItem mi5;
	JMenuItem mi6;
	JMenuItem mi7;
	JMenuItem mi8;

	addbook()
	{
		f=new JFrame("Library Management System");
		f.setVisible(true);
f.setResizable(false);
		f.setLayout(null);
		f.setLocation(0,0);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize((screen.width/2+60),(screen.height/2+95));

		mb=new JMenuBar();
		f.setJMenuBar(mb);
		m1=new JMenu("Home");
		m2=new JMenu("Student Tools");   
		m3=new JMenu("Admisitrative Tools");
		m4=new JMenu("Exit");
		mi1=new JMenuItem("Home");
		mi2=new JMenuItem("Issue");
		mi3=new JMenuItem("Return");
		mi4=new JMenuItem("Book Detail");
		mi5=new JMenuItem("Student Detail");
		mi6=new JMenuItem("Add book");
		mi7=new JMenuItem("Remove book");
		mi8=new JMenuItem("Log Out");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		m1.add(mi1);
		m2.add(mi2);
		m2.add(mi3);
		m2.add(mi4);
		m2.add(mi5);
		m3.add(mi6);
		m3.add(mi7);
		m4.add(mi8);

		l=new JLabel("Add New Book Wizard");
		Font fo= new Font("",Font.PLAIN,30);
		l.setFont(fo);
		l1=new JLabel("Book No.");
		l2=new JLabel("Book Name");
		l3=new JLabel("Book Author");
		l4=new JLabel("Total No. of copies");
		b1=new JButton("Add book");
		b2=new JButton("Back");
		b3=new JButton("Logout");
		t1=new JTextField(100);
		t2=new JTextField(100);
		t3=new JTextField(100);
		t4=new JTextField(100);

		l.setLayout(null);
		l.setBounds(200,20,400,50);
		f.add(l);
		l1.setLayout(null);
		l1.setBounds(150,75,100,40);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(150,125,100,40);
		f.add(l2);
		l3.setLayout(null);
		l3.setBounds(150,175,100,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(150,225,105,40);
		f.add(l4);

		t1.setLayout(null);
		t1.setBounds(260,75,100,30);
		f.add(t1);
		
		t1.addKeyListener(this);
		t2.setLayout(null);
		t2.setBounds(260,125,100,30);
		f.add(t2);
		t3.setLayout(null);
		t3.setBounds(260,175,100,30);
		f.add(t3);
		t4.setLayout(null);
		t4.setBounds(260,225,100,30);
		f.add(t4);
	        t4.addKeyListener(this);
		b1.setLayout(null);
		b1.setBounds(250,300,150,40);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(450,300,150,40);
		f.add(b2);
		b3.setLayout(null);
		b3.setBounds(300,350,150,40);
		f.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		mi8.addActionListener(this);
	}
	public void keyPressed(KeyEvent EVT) {
    if(EVT.getSource()==t1)
 {
    String value = t1.getText();
    int l = value.length();
    if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9') 
{

        t1.setEditable(true);
       // label.setText("");
    } 
else {
        t1.setEditable(false);
       	JOptionPane.showMessageDialog(null,"only number allow");

        t1.setEditable(true);
       // label.setText("* Enter only numeric digits(0-9)");
    }
}   
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
public void keyReleased(KeyEvent ke)
	{
	}
public void keyTyped(KeyEvent ke)
	{
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
	 
			
			if(s1.equals(""))
			{

			JOptionPane.showMessageDialog(null,"Enter the book id");
			}
	
			
			else if(s2.equals(""))
			{		
				JOptionPane.showMessageDialog(null,"Enter the name");			}
			else if(s3.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter The Author");		
			}
			
			else if(s4.equals(""))
			{	
				JOptionPane.showMessageDialog(null,"Enter The Quantity");	
			}
			
					
		       else
			{
			try
			{

				int tot=Integer.parseInt(s4);
			
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   			Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
				Statement stat=con.createStatement();
				


				Connection con1= DriverManager.getConnection("jdbc:odbc:ap","sa","niit");  
				Statement stat1=con1.createStatement();				
			stat.executeUpdate("insert into bookdetail values('"+s1+"','"+s2+"','"+s3+"','"+s4+"') ");
				stat1.executeUpdate("insert into stock values('"+s1+"',"+tot+","+0+","+tot+") ");
				JOptionPane.showMessageDialog(null,"New book has been added successfully");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");

			}
			catch(Exception e)
			{
			//System.out.println(e);
			}				
							
		}
}
		if(ae.getSource()==b2)
		{
			welcome w=new welcome();	
			f.setVisible(false);
		}
		if(ae.getSource()==b3)
		{
welcome2 a=new welcome2();
		f.setVisible(false);
		}
		if(ae.getSource()==mi1)
		{
			welcome w=new welcome();
			f.setVisible(false);
		}
		if(ae.getSource()==mi2)
		{
			issue i=new issue();
			f.setVisible(false);
		}
		if(ae.getSource()==mi3)
		{
			retrn r=new retrn();
			f.setVisible(false);
		}
		if(ae.getSource()==mi4)
		{
			book b=new book();
			f.setVisible(false);
		}
		if(ae.getSource()==mi5)
		{
			student s=new student();
			f.setVisible(false);
		}
		if(ae.getSource()==mi6)
		{
			add a=new add();
			f.setVisible(false);
		}
		if(ae.getSource()==mi7)
		{
			remove r=new remove();
			f.setVisible(false);
		}
		if(ae.getSource()==mi8)
		{
			welcome2 a=new welcome2();
			f.setVisible(false);
		}
	}

}