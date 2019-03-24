import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class welcome2 extends Thread implements ActionListener
{
JFrame f;
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19;
ImageIcon i,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19;
JButton b1,b2;
welcome2()
{
f=new JFrame("ravi");
f.setSize(1366,700);
f.setLayout(null);

l=new JLabel();
l.setBounds(0,0,1366,700);
f.add(l);
i =new ImageIcon("ssitm2.jpg");
l.setIcon(i);

l12=new JLabel("Welcome to Library Management System");
l12.setFont(new Font("Cooper Black", Font.PLAIN,40));
l12.setForeground(new Color(0,10,220));
l.add(l12);


l11=new JLabel("panipat institute of engineering and technology");
l11.setFont(new Font("Algerian", Font.PLAIN,60));
l11.setForeground(new Color(0,10,220));
l.add(l11);

//l1=new JLabel();
//l.add(l1);
//i2 =new ImageIcon("kul1.jpg");
//l1.setIcon(i2);

l2=new JLabel();
l.add(l2);
i3 =new ImageIcon("kul2.jpg");
l2.setBounds(580,352,149,149);
l2.setIcon(i3);

//l3=new JLabel("Student");
//l.add(l3);
//l3.setFont(new Font("Algerian", Font.PLAIN,60));
//l3.setForeground(new Color(10,10,220));
//l.add(l3);
//l3.setBounds(155,421,500,149);

l4=new JLabel("Librarian");
l.add(l4);
l4.setFont(new Font("Algerian", Font.PLAIN,60));
l4.setForeground(new Color(10,10,220));
l.add(l4);
l4.setBounds(500,452,500,149);

//b1=new JButton("Login");
//b1.setFont(new Font("Algerian", Font.PLAIN,18));
//b1.setBounds(220,531,100,30);
//l.add(b1);
//b1.addActionListener(this);

b2=new JButton("Login");
b2.setFont(new Font("Algerian", Font.PLAIN,18));
b2.setBounds(607,555,100,30);
l.add(b2);
b2.addActionListener(this);
f.setVisible(true);
start();
}
public void run()
{
int i = 30;
int j=30;


while(true)
{

for(;i<=1000;i=i+10)

{

l12.setBounds(281,200,i,65);

                try
	{
	sleep(40);
	}//try
               catch(Exception e)
	{} 
}
for(;i>=200;i=i-10)

{

	
              l12.setBounds(281,i,1160,65);

	try
	{
	sleep(40);
	}

	catch(Exception e){}
}

while(true){
for(;j<=231;j=j+5)

{


l11.setBounds(j,250,1160,65);

	try
	{
	sleep(40);
	}//try

	catch(Exception e)
	{}
}

for(;j>=30;j=j-5)

{
           l11.setBounds(j,250,1160,65);
                try
	{
	sleep(40);
	}
               catch(Exception e){}
}
}
}
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)

{
loginstudent a=new loginstudent();
}

if(ae.getSource()==b2)

{
loginlibrarian a=new loginlibrarian();
f.setVisible(false);
}

}


public static void main(String ar[])
{
welcome2 a=new welcome2();

}


}

