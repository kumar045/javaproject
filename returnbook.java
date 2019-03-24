import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.sql.*;
import java.awt.print.*;

class returnbook implements ActionListener
{
	JFrame f;
	JPanel p;
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
	JButton b1;
	JButton b2;
	JButton b3;
                JButton print;
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
	String s1;
	String s2;
	
	returnbook(String str3,String str2)
	{
		s1=str3; //book id
		s2=str2; //student id
		f=new JFrame("Library Management System");
		f.setVisible(true);

		f.setResizable(false);
		f.setLocation(300,200);
			Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize((screen.width/2+60),(screen.height/2+95));
		
		p=new JPanel();
		p.setSize(screen.width,screen.height);
		f.add(p);

	   p.setLayout(null);

		l1=new JLabel("Book I.D.");
		l2=new JLabel("Student I.D.");
		l3=new JLabel("Issuing Date");
		
		l4=new JLabel("Current Date");
		l5=new JLabel("Amount");



		l1.setLayout(null);
		l1.setBounds(100,50,100,40);
		p.add(l1);
		
		l2.setLayout(null);
		l2.setBounds(100,100,100,40);
		p.add(l2);
		
		l3.setLayout(null);
		l3.setBounds(100,150,100,40);
		p.add(l3);
		
		l4.setLayout(null);
		l4.setBounds(100,200,100,40);
		p.add(l4);
		
		l5.setLayout(null);
		l5.setBounds(100,250,100,40);
		p.add(l5);

                ImageIcon i1 = new ImageIcon("book.jpg");
                l11=new JLabel();
                l11.setLayout(null);
                l11.setBounds(700,0,1110,700);
                l11.setIcon(i1);
                 f.add(l11);
		
		
		try{

		                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();


		ResultSet rs= stat.executeQuery("select * from issue where bookid='"+s1+"' ");

		java.util.Date d1= new java.util.Date();

		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		String str="";
		while(rs.next())
		{
		str= rs.getString("date_issued");
		}
		java.util.Date d2=new java.util.Date();
		d2=df.parse(str);
		l6=new JLabel();

		

		java.util.Date d3=new java.util.Date();
		Calendar c=Calendar.getInstance();
		c.setTime(d3);
		String str1=df.format(d3);
		java.util.Date d4=new java.util.Date();
		d4=df.parse(str1);
		l7=new JLabel();



		long mili=d4.getTime()-d2.getTime();
		long days=mili/(3600000*24);
                 	l9=new JLabel();
		l10=new JLabel();
		l8=new JLabel();
                String s10="";
		if(days<15)
		{
 s10="0.00";
			

		}
		else
		{
			long amt = (days-15)*5;
			s10= String.valueOf(amt);
			
		}
		
	
		l6.setText(str3);
		l7.setText(str2);
		l8.setText(str);
		l9.setText(str1);

			l10.setText(s10);

		b1 = new JButton("Pay");
		b2 = new JButton("Cancel");
		b3 = new JButton("Log Out");
		print=new JButton("Print");
		
		l6.setLayout(null);
		l6.setBounds(200,50,100,40);
		p.add(l6);
		l7.setLayout(null);
		l7.setBounds(200,100,100,40);
		p.add(l7);

		l8.setLayout(null);
		l8.setBounds(200,150,100,40);
		p.add(l8);

		l9.setLayout(null);
		l9.setBounds(200,200,100,40);
		p.add(l9);
		
		l10.setLayout(null);
		l10.setBounds(200,250,100,40);
		p.add(l10);
		
		b1.setLayout(null);
		b1.setBounds(100,300,100,40);
		p.add(b1);

		b2.setLayout(null);
		b2.setBounds(220,300,100,40);
		p.add(b2);

		b3.setLayout(null);
		b3.setBounds(350,300,100,40);
		p.add(b3);

                            print.setLayout(null);
		print.setBounds(470,300,100,40);
		p.add(print);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
print.addActionListener(this);
		

	}
	catch(Exception e){}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try{

                                                     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			


			Connection con2 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
			Statement stat2= con2.createStatement();
			Connection con3 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
			Statement stat3= con3.createStatement();


			stat2.executeUpdate("delete from issue where bookid='"+s1+"' and student_id='"+s2+"' ");
			ResultSet rs2 = stat2.executeQuery("select * from stock where bookid='"+s1+"' ");
			ResultSet rs3=stat3.executeQuery("select * from studentdetail where student_id='"+s2+"' ");

			while(rs2.next() && rs3.next())
			{
				int i=Integer.parseInt(rs2.getString("copies_issued"));
				i--;
				int i2=Integer.parseInt(rs2.getString("copies_in_stock"));
				i2++;
				int i3=Integer.parseInt(rs3.getString("no_of_books"));
				i3--;



	stat2.executeUpdate("update stock set copies_issued="+i+" where bookid='"+s1+"' ");
			stat2.executeUpdate("update stock set copies_in_stock="+i2+" where bookid='"+s1+"' ");
		stat3.executeUpdate("update studentdetail set no_of_books="+i3+" where student_id='"+s2+"' ");
			stat2.executeUpdate("delete from issue where bookid='"+s1+"' and student_id='"+s2+"' ");
                                    

			JOptionPane.showMessageDialog(null,"Book has been successfully returned");
			f.setVisible(false);
welcome w=new welcome();
			}
			



			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		if(ae.getSource()==b2)
		{
			retrn r=new retrn();
			f.setVisible(false);
		}
		if(ae.getSource()==b3)
		{
			welcome2 a=new welcome2();
			f.setVisible(false);
		}

               if(ae.getSource()==print)
		{
			PrinterJob printJob = PrinterJob.getPrinterJob();			
			if (printJob.printDialog()) 
			{
            			try 
				{
                			printJob.print();  
                		} 
				catch (Exception PrintException) 
				{   
					PrintException.printStackTrace();             			
            			}
				printJob.cancel();
       			}
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


}
}