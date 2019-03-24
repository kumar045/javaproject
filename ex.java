import java.util.*;

import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;

import java.io.File;


public class ex
{
	JFrame f;
	JLabel l1;
ex() throws IOException
	{
				f=new JFrame("Welcome to Library Management System");
		f.setVisible(true);
		f.setLayout(null);
		f.setLocation(0,0);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(screen.width,screen.height);
Image love;
ImageIcon icon = new ImageIcon(this.getClass().getResource("library7.jpg"));
    love = icon.getImage();
public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.drawImage(love, 10, 10, null); 
}



		JMenuBar mb=new JMenuBar();
		f.setJMenuBar(mb);
		JMenu m1=new JMenu("Home");
		JMenu m2=new JMenu("Student Tools");
		JMenu m3=new JMenu("Admisitrative Tools");
		JMenu m4=new JMenu("Exit");
		JMenuItem mi1=new JMenuItem("Home");
		JMenuItem mi2=new JMenuItem("Issue");
		JMenuItem mi3=new JMenuItem("Return");
		JMenuItem mi4=new JMenuItem("Book Detail");
		JMenuItem mi5=new JMenuItem("Student Detail");
		JMenuItem mi6=new JMenuItem("Add book");
		JMenuItem mi7=new JMenuItem("Remove book");
		JMenuItem mi8=new JMenuItem("Log Out");
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
}
public static void main(String arg[]) throws IOException
{
ex e=new ex();
}
}