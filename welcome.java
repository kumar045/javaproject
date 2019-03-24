import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class welcome implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel l;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
        JLabel l9;
JLabel l11;
JLabel l12;
JLabel l13,l10,l25,l26;

	JTextField t1;
	JTextField t2;
	JTextField t3;
	JButton b1;
	//JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
               JButton b9,b10,b11,b12;
	String s2;
	welcome()
	{
		f=new JFrame("Welcome to Library Management System");
		  f.setVisible(false);
		
		f.setLayout(null);
		f.setLocation(0,0);
		Dimension screen     =     Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(screen.width,(screen.height-25));
l12=new JLabel(new ImageIcon("logo2.jpg"));
l11=new JLabel("Sri Sri Institute of Technology & Management");
		l=new JLabel("Welcome to Library Management System");
		l.setFont(new Font("Magneto", Font.PLAIN, 40));
l11.setFont(new Font("Magneto", Font.PLAIN, 40));
		l1=new JLabel("What would you like to continue with??");
		l1.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
		l2=new JLabel(":Student details");
		l3=new JLabel(":	Add nNew Student");
		l4=new JLabel(":	View book details");
		l5=new JLabel(":	Return back a book and know the amount to be paid");
		l6=new JLabel(":	Add a new book to the stock.*   ");   
		l7=new JLabel(":	Remove a book from the stock.*   "); 
		l8=new JLabel(":	Logout from Library Management");
l13=new JLabel(":Issue book");
l10=new JLabel(":Books in library stock");

		b1=new JButton("Issue a book");
		//b2=new JButton("Change Password");
		b3=new JButton("Book detail");
		b4=new JButton("Return a book");
		b5=new JButton("Add new book");
		b6=new JButton("Remove book ");
		b8=new JButton("Add New Student");
		b7=new JButton("Logout");
                                b9=new JButton("Student detail");
b10=new JButton("Books in library");

b11=new JButton("Change password");
b11.setBounds(431,200,140,40);
f.add(b11);

b12=new JButton("Change I.D. No");
b12.setBounds(431,250,140,40);
f.add(b12);

l25=new JLabel("Change librarian password");
l25.setBounds(581,200,170,40);
f.add(l25);

l26=new JLabel("Change librarian I.D. No");
l26.setBounds(581,250,140,40);
f.add(l26);





		l.setLayout(null);
		l.setBounds(200,20,950,70);
		f.add(l);
                                l11.setLayout(null);
		l11.setBounds(220,70,950,70);
		f.add(l11);

                                 l12.setLayout(null);
		l12.setBounds(10,10,134,120);
		f.add(l12);



		l1.setLayout(null);
		l1.setBounds(100,130,850,60);
		f.add(l1);

l13.setLayout(null);
		l13.setBounds(300,191,200,40);
		f.add(l13);

		
		l3.setLayout(null);
		l3.setBounds(300,200,200,40);
		f.add(l3);
		l4.setLayout(null);
		l4.setBounds(300,250,200,40);
		f.add(l4);
		l5.setLayout(null);
		l5.setBounds(300,300,200,40);
		f.add(l5);
		l6.setLayout(null);
		l6.setBounds(300,350,200,40);
		f.add(l6);
		l7.setLayout(null);
		l7.setBounds(300,430,400,40);
		f.add(l7);
		
		l3.setLayout(null);
		l3.setBounds(300,480,200,40);
		f.add(l3);


		l2.setLayout(null);
		l2.setBounds(300,530,400,40);
		f.add(l2);
l10.setLayout(null);
		l10.setBounds(300,580,150,40);
		f.add(l10);
	
		l8.setLayout(null);
		l8.setBounds(300,631,400,40);
		f.add(l8);
		
		//t2.setLayout(null);
		//t2.setBounds(250,120,100,30);
		//f.add(t2);
		//t3.setLayout(null);
		//t3.setBounds(250,170,100,30);
		//f.add(t3);
		b1.setLayout(null);
		b1.setBounds(100,200,150,40);
		f.add(b1);
		b3.setLayout(null);
		b3.setBounds(100,250,150,40);
		f.add(b3);
		b4.setLayout(null);
		b4.setBounds(100,300,150,40);
		f.add(b4);
		b5.setLayout(null);
		b5.setBounds(100,350,150,40);
		f.add(b5);
		b6.setLayout(null);
		b6.setBounds(100,430,150,40);
		f.add(b6);
		b8.setLayout(null);
		b8.setBounds(100,480,150,40);
		f.add(b8);
		//b2.setLayout(null);
		//b2.setBounds(100,530,150,40);
		//f.add(b2);
		b7.setLayout(null);
		b7.setBounds(100,631,150,40);
		f.add(b7);
	                b9.setBounds(100,530,150,40);
                                f.add(b9);
   b10.setBounds(100,580,150,40);
                                f.add(b10);


                ImageIcon i1 = new ImageIcon("book.jpg");
                l9=new JLabel();
                l9.setLayout(null);

                l9.setBounds(700,0,1110,700);
                l9.setIcon(i1);
                 f.add(l9);
                 f.setVisible(true);
		b1.addActionListener(this);
		//b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
                                b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  b12.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			issue i=new issue();
                        
			f.setVisible(false);
		}
		
		//if(ae.getSource()==b2)
		{
			//changepass i=new changepass(s2);
                        
			//f.setVisible(false);
		}
		if(ae.getSource()==b3)
		{
		        search1 b=new search1();
			f.setVisible(false);
		}
		if(ae.getSource()==b4)
		{
				retrn r=new retrn();
			f.setVisible(false);
		}
		if(ae.getSource()==b5)
		{
	             addbook ab=new addbook();
			f.setVisible(false);
		}
		if(ae.getSource()==b6)
		{
			removebook r=new removebook();
			f.setVisible(false);
		}
		if(ae.getSource()==b8)
		{
		Registration l=new Registration();
			f.setVisible(false);
		}
		if(ae.getSource()==b7)
		{
			
			welcome2 w=new welcome2();
			f.setVisible(false);
			
		}
                                     if(ae.getSource()==b9)
		{
			student s=new student();
			f.setVisible(false);
			
		}
if(ae.getSource()==b10)
{
table d=new table();
}
if(ae.getSource()==b11)
{
changepas b=new changepas();

}
if(ae.getSource()==b12)
{
changenam b=new changenam();
}



	}
public static void main(String arg[])
{
welcome w=new welcome();
}
}