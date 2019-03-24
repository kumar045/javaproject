import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.io.*;
import java.util.*;
import java.sql.*;

class issuebook
{
	JFrame f;
	public void init(String s1,String s2,java.util.Date d1,java.util.Date d2)
	{
	try{

	                                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   		Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");        
			Statement stat=con.createStatement();
	Connection con1= DriverManager.getConnection("jdbc:odbc:ap","sa","niit");  
	Statement stat1=con1.createStatement();
	ResultSet rs=stat.executeQuery("select * from stock where bookid='"+s1+"' ");
	String str3="";
	String str4="";
	System.out.println("hi");
         while(rs.next())
	{
	 str3=rs.getString("copies_issued");
	 str4=rs.getString("copies_in_stock");	
	}

	System.out.println("hi   "+str3);
        

	System.out.println("hi    " +str4);
	String str2="";
	ResultSet rs1=stat1.executeQuery("select * from studentdetail where student_id='"+s2+"' ");
	while(rs1.next())
	{
            str2=rs1.getString("no_of_books");
	}
	
	//String str1=rs.getString("copies_in_stock");
	//System.out.println("hi    "+str1);
	int i=Integer.parseInt(str4);
	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	String date1=df.format(d1);

	System.out.println("hi ravi"  );
	if(i>0)
	{
		
		int i1=Integer.parseInt(str2);
		int i2=Integer.parseInt(str3);
		int i3=Integer.parseInt(str4);
		if( i1 < 5)

		{
			i1++;
			i2++;
			i3--;
		stat.executeUpdate("update studentdetail set no_of_books= "+i1+" where student_id='"+s2+"' ");
		stat.executeUpdate("update stock set copies_issued="+i2+" where bookid='"+s1+"' ");
		stat.executeUpdate("update stock set copies_in_stock="+i3+" where bookid='"+s1+"' ");
		stat.executeUpdate("insert into issue values ('"+s1+"','"+date1+"','"+s2+"') ");
		JOptionPane.showMessageDialog(null,"Congratulations!!The book has been successfully issued.");
	                System.out.println("hi    ravi mishra");
		f.setVisible(false);
                                f.setResizable(false);
		}
		else
			JOptionPane.showMessageDialog(null,"Sorry!!5 books are already issued to this Student I.D.No more books can be issued untill previous ones are returned");
	}
	else
		JOptionPane.showMessageDialog(null,"Sorry!!There is just one reference book available in the library.Requested book cannot be issued.Try again later");
	}
	catch(Exception e)
	{
		//System.out.println(e);
	}
	}
	
}