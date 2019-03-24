import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Search implements ActionListener
{
	JFrame f;
	JLabel l1;
	JLabel l2,l3,l4,l5,l6,l7,l8,l9;


	JTextField t1;
        String s="";
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
        JComboBox cb;
	
	Search()
	{
		f=new JFrame("Library Management System");
		f.setVisible(true);

		f.setResizable(false);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocation(150,150);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(screen.width/2,(screen.height/2+50));

		

		l1=new JLabel("Enter the Book I.D. you wish to fetch details of:");
		l1.setFont(new Font("",Font.PLAIN,26));
		l2=new JLabel("Book I.D.");

		b1=new JButton("Search");
		b2=new JButton("Back");
	
		t1=new JTextField(100);

		l1.setLayout(null);
		l1.setBounds(80,40,850,60);
		f.add(l1);
		l2.setLayout(null);
		l2.setBounds(200,150,100,40);
		f.add(l2);

		t1.setLayout(null);
		t1.setBounds(350,150,100,30);
		f.add(t1);

		b1.setLayout(null);
		b1.setBounds(150,250,150,40);
		f.add(b1);
		b2.setLayout(null);
		b2.setBounds(350,250,150,40);
		f.add(b2);
	     

		b1.addActionListener(this);
		b2.addActionListener(this);
	

	}
	Search(String s)
	{
		this.s=s;
		System.out.println(s);
                
		f=new JFrame("Library Management System");
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocation(380,150);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(screen.width/2,(screen.height/2+50));

		System.out.println(s);
		l1=new JLabel("Search By "+s);
		l1.setFont(new Font("",Font.PLAIN,16));
		l1.setLayout(null);
		l1.setBounds(80,40,200,30);
		f.add(l1);

                l2=new JLabel("Book I.D.");
		l3=new JLabel("Book Name");
		l4=new JLabel("Author's Name");
		l5=new JLabel("Availability");

		  l6=new JLabel("");
		l7=new JLabel("");
		l8=new JLabel("");
		l9=new JLabel("");
	
	
		b3=new JButton("Search");
		b4=new JButton("back");
		

		
	        cb=new JComboBox();
		cb.setBounds(300,40,180,30);
		f.add(cb);
               
		b3.setLayout(null);
		b3.setBounds(150,300,150,40);
		f.add(b3);
		b4.setLayout(null);
		b4.setBounds(350,300,150,40);
		f.add(b4);
		cb.addActionListener(this);
                   if(s.trim().equals("Id"))
		
		{
                   try
		{
			
                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select bookid from bookdetail  ");
			while(rs.next())
			{
				cb.addItem(rs.getString("bookid")); 
				
			
			}
			rs.close();
		}
			catch(Exception e)
		{
			//System.out.println(e);
		}
		}

                       else if(s.trim().equals("Name"))
		
		{
                   try
		{
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select book_name from bookdetail  ");
			while(rs.next())
			{
				cb.addItem(rs.getString("book_name"));
			
			}
			rs.close();
		}
			catch(Exception e)
		{
			//System.out.println(e);
		}
		}
          else if(s.trim().equals("Author"))
		
		{
                   try
		{
			
                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select book_author from bookdetail  ");
			while(rs.next())
			{
				cb.addItem(rs.getString("book_author"));
			
			}
			rs.close();
		}
			catch(Exception e)
		{
			//System.out.println(e);
		}
		}
               
	
		
		l2.setLayout(null);
		l2.setBounds(150,100,100,40);
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
		l6.setBounds(300,100,200,40);
		f.add(l6);
		l7.setLayout(null);
		l7.setBounds(300,150,200,40);
		f.add(l7);
		l8.setLayout(null);
		l8.setBounds(300,200,100,40);
		f.add(l8);
		l9.setLayout(null);
		l9.setBounds(300,250,300,40);
		f.add(l9);

		b3.addActionListener(this);
		b4.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s=t1.getText();
			bookdetail bd=new bookdetail(s);
			f.setVisible(false);
		}
		if(ae.getSource()==b2)
		{
			

		}
		if(ae.getSource()==b3)
		{
                 String sid=(String)cb.getSelectedItem();
                 System.out.println(sid+"    "+s);
		if(s.trim().equals("Id"))
		{
		try
		{
                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();

			ResultSet rs = stat.executeQuery("select * from bookdetail where bookid = '"+sid+"' ");
			l6.setText(sid);
			int i=0;
			while(rs.next())
			{
			l7.setText(rs.getString("book_name"));
			l8.setText(rs.getString("book_author"));
			Connection con1 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
			Statement stat1 = con1.createStatement();

			ResultSet rs1 = stat1.executeQuery("select * from stock where bookid='"+sid+"' ");
			while(rs1.next())
			{
	
			String str=rs1.getString("copies_in_stock");
			 i=Integer.parseInt(str);
                        }
			}

			if(i>0)
				l9.setText("No Of Copies Available: "+String.valueOf(i));
			else
				l9.setText("Not available in stock"+String.valueOf(i));
			
			
		        
		}
		
	         catch(Exception e)
		{
			//System.out.println(e);
		}
		 
                
	       }

		else if(s.trim().equals("Name"))
		{
		try
		{
                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select * from bookdetail where book_name = '"+sid+"' ");
			int i=0;
			while(rs.next())
			{
			String f=rs.getString("bookid");
			//System.out.println(f+"  Ravi");
			l6.setText(f);
			l7.setText(sid);
			l8.setText(rs.getString("book_author"));
			Connection con1 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
			Statement stat1 = con1.createStatement();
                       
			ResultSet rs1 = stat1.executeQuery("select * from stock where bookid='"+f+"' ");
			while(rs1.next())
			{
	
			String str=rs1.getString("copies_in_stock");
			 i=Integer.parseInt(str);
			}
			}

			if(i>0)
				l9.setText("Number Of Copies available "+String.valueOf(i));
			else
				l9.setText("Not available in stock");
			}
			
		        
		
	         catch(Exception e)
		{
			//System.out.println(e);
		}
		 
                
	       }
            else if(s.trim().equals("Author"))
		{
		try
		{
                                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
			ResultSet rs = stat.executeQuery("select * from bookdetail where book_author = '"+sid+"' ");
			int i=0;
			while(rs.next())
			{
			String sf=rs.getString("bookid");
			l6.setText(sf);
			l7.setText(rs.getString("book_name"));
			Connection con1 = DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
			l8.setText(sid);
			Statement stat1 = con1.createStatement();

			ResultSet rs1 = stat1.executeQuery("select * from stock where bookid='"+sf+"' ");
			while(rs1.next())
			{
	
			String str=rs1.getString("copies_in_stock");
			 i=Integer.parseInt(str);
			}
			}
			if(i>0)
				l9.setText("Number Of Copies Available  "+String.valueOf(i));
			else
				l9.setText("Not available in stock"+String.valueOf(i));
			
		}
		
	         catch(Exception e)
		{
			//System.out.println(e);
		}
		 
                
	       }
		}
		if(ae.getSource()==b4)
		{
              f.setVisible(false);
			welcome w=new welcome();
		}
		
	}
	public static void main(String arg[])
{

}
}