import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import java.util.*;
import java.text.*;

public class issue implements ActionListener
{
	JFrame f;
	JLabel l;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l6;
	JLabel l7;
JLabel l9;
JLabel l8;
	
	JTextField t1;
	JTextField t2;

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
	Date d;
	Date d1;
	
	String s;
	String s1;
	issue()
	{
		f=new JFrame("Welcome to Library Management System");
		
		f.setLayout(null);

		f.setResizable(false);
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

		l=new JLabel("Issue Book Wizard");
		Font fo=new Font("",Font.PLAIN,27);
		l.setFont(fo);
		l1=new JLabel("Book No.");
		l2=new JLabel("Enrolment No");
		l3=new JLabel("Date of issue");
		l4=new JLabel("Due Date");
		

		d = new Date();
		d1= new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DATE,15);
		d1=c.getTime();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		s=df.format(d);
		s1=df.format(d1);

		l6=new JLabel(s);
		l7=new JLabel(s1);

		b1=new JButton("Issue book");
		b2=new JButton("Reset details");
		b3=new JButton("Cancel");
		b4=new JButton("Logout");
		t1=new JTextField(100);
		t2=new JTextField(100);

		l.setLayout(null);
		l.setBounds(200,5,400,70);
		f.add(l);	
		l1.setLayout(null);
		l1.setBounds(150,70,100,50);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(150,120,100,40);
		f.add(l2);
		l3.setLayout(null);
		l3.setBounds(150,170,100,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(150,220,100,40);
		f.add(l4);
		
		l6.setLayout(null);
		l6.setBounds(300,170,100,40);
		f.add(l6);
		l7.setLayout(null);
		l7.setBounds(300,220,100,40);
		f.add(l7);

		t1.setLayout(null);
		t1.setBounds(300,70,100,30);
		f.add(t1);
		t2.setLayout(null);
		t2.setBounds(300,120,100,30);
		f.add(t2);

		b1.setLayout(null);
		b1.setBounds(100,320,150,30);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(300,320,150,30);
		f.add(b2);
		b3.setLayout(null);
		b3.setBounds(100,360,150,30);
		f.add(b3);
		b4.setLayout(null);
		b4.setBounds(300,360,150,30);
		f.add(b4);
ImageIcon i21=new ImageIcon("li.jpg");
l8=new JLabel();
l8.setLayout(null);
l8.setBounds(700,250,1100,400);
l8.setIcon(i21);
f.add(l8);

ImageIcon i22=new ImageIcon("li1.jpg");
l9=new JLabel();
l9.setLayout(null);
l9.setBounds(460,0,300,400);
l9.setIcon(i22);
f.add(l9);
f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
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
		
		if(ae.getSource()==b1)
		{
			String s2=t1.getText();
			String s3=t2.getText();
                        if((s1.equals("")) || (s2.equals("")))
			{
		          JOptionPane.showMessageDialog(null,"Field Can't be blank");
			}
			else 
			{
			issuebook ib=new issuebook();
			ib.init(s2,s3,d,d1);
			}
			t1.setText("");
			t2.setText("");
		}
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
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
	public static void main(String arg[])
	{
	issue i=new issue();
	}

}