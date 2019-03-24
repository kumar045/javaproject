import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public class studentdetail implements ActionListener
{
	JFrame f;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;	
	JLabel l9;
	JLabel l10;
	JLabel l11;
	JLabel l12;

	JButton b3;
	JButton b4;
	JButton b5;

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

	
	String s;
	String s1;
	String s2;
	studentdetail(String s)
	{
		s2=s;
		f=new JFrame("Library Management System");
		f.setVisible(true);
		f.setLayout(null);
		f.setLayout(null);
		f.setLocation(0,0);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(screen.width,screen.height);

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

		l1=new JLabel("Student I.D.");
		l2=new JLabel("Course and Branch");
		l3=new JLabel("Student's Name");
		l4=new JLabel("Address");
		l5=new JLabel("Phone");
		l6=new JLabel("No. of Books Issued");
		l7=new JLabel(s);

		try
		{
			 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select * from studentdetail where student_id = '"+s+"' ");
			while(rs.next())
			{
		                 l8=new JLabel(rs.getString("pass"));
			String str=rs.getString("no_of_books");
			l9=new JLabel(rs.getString("student_name"));
			l10=new JLabel(rs.getString("student_add"));
			l11=new JLabel(rs.getString("student_ph"));
			l12=new JLabel(str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		b3=new JButton("Back");
		b4=new JButton("Logout");
		//b5=new JButton("Change Detail");


	
		l1.setLayout(null);
		l1.setBounds(150,50,100,50);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(150,100,151,40);
		f.add(l2);
		l3.setLayout(null);
		l3.setBounds(150,150,100,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(150,200,100,40);
		f.add(l4);
		l5.setLayout(null);
		l5.setBounds(150,250,100,40);
		f.add(l5);		
		l6.setLayout(null);
		l6.setBounds(150,300,120,40);
		f.add(l6);
		l7.setLayout(null);
		l7.setBounds(300,50,100,40);
		f.add(l7);
		l8.setLayout(null);
		l8.setBounds(300,100,400,40);
		f.add(l8);
		l9.setLayout(null);
		l9.setBounds(300,150,400,40);
		f.add(l9);
		l10.setLayout(null);
		l10.setBounds(300,200,400,40);
		f.add(l10);
		l11.setLayout(null);
		l11.setBounds(300,250,400,40);
		f.add(l11);
		l12.setLayout(null);
		l12.setBounds(300,300,400,40);
		f.add(l12);

		b3.setLayout(null);
		b3.setBounds(100,510,150,40);
		f.add(b3);
		b4.setLayout(null);
		b4.setBounds(100,570,150,40);
		f.add(b4);
		//b5.setLayout(null);
		//b5.setBounds(100,450,150,40);
		//f.add(b5);

		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		mi8.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3)
		{
			welcome w=new welcome();
			f.setVisible(false);
		}
		if(ae.getSource()==b4)
		{
			welcome2 a=new welcome2();
			f.setVisible(false);
		}
		//if(ae.getSource()==b5)
		{
			//change c=new change(s2);
			//f.setVisible(false);
		}
		if(ae.getSource()==mi1)
		{
			welcome2 w=new welcome2();
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