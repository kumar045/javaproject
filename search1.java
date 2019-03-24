import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class search1 implements ActionListener
{
	JFrame f;
	JLabel l1;
        JLabel l11;
	JLabel l2;
	JComboBox t1;
	//JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;

	
	search1()
	{
		f=new JFrame("Library Management System");
		f.setVisible(true);
		f.setLayout(null);
		
		f.setResizable(false);
	        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize((screen.width/4+60),(screen.height/5+95));
		f.setLocation(470,240);
              
		

		l1=new JLabel("Search By");
		//l2=new JLabel("Student I.D.");
                String[] arr={"Name"," Id","Author"};
		t1=new JComboBox(arr);
		//t2=new JTextField(200);
	
		b1=new JButton("Return book");
	        l1.setLayout(null);
		l1.setBounds(20,30,100,40);
		f.add(l1);
	
		b2=new JButton("Back");
                b2.setBounds(170,80,150,30);
		f.add(b2);
                b2.addActionListener(this);
		t1.setBounds(150,30,150,30);
		f.add(t1);
		t1.addActionListener(this);
	        b1=new JButton("Continue");
		b1.setLayout(null);
		b1.setBounds(10,80,150,30);
		f.add(b1);
		
		t1.addActionListener(this);
		b1.addActionListener(this);
	

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String sn=(String)t1.getSelectedItem();
			Search s=new Search(sn);
			f.setVisible(false);
		
		}
		if(ae.getSource()==b2)
		{
			f.setVisible(false);
			welcome w=new welcome();
		
		}
		
	}
	public static void main(String arg[])
{
	search1 r=new search1();
}
}