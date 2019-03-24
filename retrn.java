import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class retrn implements ActionListener
{
	JFrame f;
	JLabel l1;
JLabel l11;
	JLabel l2;
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;

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

	
	retrn()
	{
		f=new JFrame("Library Management System");
		
		f.setLayout(null);
		f.setLocation(0,0);
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize((screen.width/2+60),(screen.height/2+95));

		f.setResizable(false);
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

		l1=new JLabel("Book I.D.");
		l2=new JLabel("Enrolment No");

		t1=new JTextField(200);
		t2=new JTextField(200);
	
		b1=new JButton("Return book");
		b2=new JButton("Cancel");
		b3=new JButton("Log Out");
	
		l1.setLayout(null);
		l1.setBounds(150,100,100,40);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(150,200,100,40);
		f.add(l2);

		t1.setLayout(null);
		t1.setBounds(300,100,200,30);
		f.add(t1);
		t2.setLayout(null);
		t2.setBounds(300,200,200,30);
		f.add(t2);
	
		b1.setLayout(null);
		b1.setBounds(130,300,150,40);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(290,300,150,40);
		f.add(b2);
		b3.setLayout(null);
		b3.setBounds(210,350,150,40);
		f.add(b3);
 /** ImageIcon i1 = new ImageIcon("book.jpg");
                l11=new JLabel();
                l11.setLayout(null);
                l11.setBounds(700,0,1110,700);
                l11.setIcon(i1);
                 f.add(l11);*/
		f.setVisible(true);
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
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			if(s1.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Book Id");
			}
	            else if(s2.equals(""))
			{
			JOptionPane.showMessageDialog(null,"Enter The Studetn Id");
			}
		     else
			{
			returnbook rb=new returnbook(s1,s2);
			f.setVisible(false);
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
	public static void main(String arg[])
{
	retrn r=new retrn();
}
}