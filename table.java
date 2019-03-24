import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
class table
{
JFrame g;
TextField t;
JScrollPane sp;
JTable tb;
table()
{
g=new JFrame("Library Books");

g.setLocation(300,0);
g.setSize(500,500);

t=new TextField();
//System.out.println("Hi");
String []col={"Book_id","Total_book","Issued_book","Remains_books"};
//System.out.println("Hi");
String [][]data=new String[1][];
//System.out.println("Hi");
g.setVisible(true);
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:ap","sa","niit");
//System.out.println("Hi");
Statement stat=con.createStatement();
//System.out.println("Hi");
ResultSet rs=stat.executeQuery("select * from stock");
//System.out.println("Hi");
int ctr=0;
while(rs.next())
{
ctr++;
}
//System.out.println(ctr);
rs.close();
rs=stat.executeQuery("select * from stock");
data=new String[ctr][4];
int i1=0;
while(rs.next())
{
data[i1][0]=rs.getString("bookid");
data[i1][1]=rs.getString("totalno");
data[i1][2]=rs.getString("copies_issued");
data[i1][3]=rs.getString("copies_in_stock");
i1++;
}
//System.out.println("Hi..........");

}
catch(Exception e)
{
//System.out.println("Ravi..........");
}
tb=new JTable(data,col);
sp=new JScrollPane(tb);
g.add(sp);
}
public static void main(String [] arg)
{
table d=new table();
}
}