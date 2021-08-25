package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class home extends JFrame{
    String username;
    public static void main(String[] args) {
        new home("").setVisible(true);
    }
    
    public home(String username) {
        super("Travel and Tourism Management System");
	this.username= username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dashboard.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("Travel and Tourism Management System");
	l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(500, 60, 1000, 100);
	NewLabel.add(l1);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu m1 = new JMenu("PROFILE");
        m1.setForeground(Color.BLUE);
        m1.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m1);
		
        JMenuItem mi1 = new JMenuItem("ADD USER DETAILS");
	m1.add(mi1);
        
        JMenuItem mi2 = new JMenuItem("UPDATE USER DETAIL");
	m1.add(mi2);
        
        JMenuItem mi3 = new JMenuItem("VIEW USER DETAILS");
	m1.add(mi3);
        
        JMenuItem mi4 = new JMenuItem("DELETE USER");
	m1.add(mi4);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new adduser(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new updateuser(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewuser(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new deleteuser(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
		
	JMenu m2 = new JMenu("PACKAGES");
        m2.setForeground(Color.RED);
        m2.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m2);
        
        JMenuItem mi6 = new JMenuItem("CHECK PACKAGE");
	m2.add(mi6);
        
        JMenuItem mi7 = new JMenuItem("BOOK PACKAGE");
	m2.add(mi7);
        
        JMenuItem mi5 = new JMenuItem("VIEW PACKAGE");
	m2.add(mi5);
        
        
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new checkpackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new bookpackage(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewpackage(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
        JMenu m3 = new JMenu("HOTELS");
        m3.setForeground(Color.BLUE);
        m3.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m3);
        
        
        
        JMenuItem mi9 = new JMenuItem("VIEW HOTELS");
	m3.add(mi9);
        
        JMenuItem mi8 = new JMenuItem("BOOK HOTELS");
	m3.add(mi8);
        
        JMenuItem mi10 = new JMenuItem("VIEW BOOKED HOTEL");
	m3.add(mi10);
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new bookhotel(username).setVisible(true);
            }
	});
        
        
        
	mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new checkhotels().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new viewbookedhotel(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        JMenu m4 = new JMenu("DESTINATION");
        
        m4.setForeground(Color.RED);
        m4.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m4);
        
        JMenuItem mi11 = new JMenuItem("DESTINATION");
	m4.add(mi11);
        
        mi11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new destination().setVisible(true);
            }
	});
        
        
        JMenu m5 = new JMenu("PAYMENT");
        m5.setForeground(Color.BLUE);
        m5.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m5);
        
        JMenuItem mi12 = new JMenuItem("PAY USING BKASH");
	m5.add(mi12);
        
        mi12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new payment().setVisible(true);
            }
	});
        
        JMenu m6 = new JMenu("UTILITY");
        m6.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
        m6.setForeground(Color.RED);
	menuBar.add(m6);
        
        JMenuItem mi13 = new JMenuItem("NOTEPAD");
	m6.add(mi13);
        
        JMenuItem mi14 = new JMenuItem("CALCULATOR");
	m6.add(mi14);
        
        mi13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){ }
            }
	});
        
        
        mi14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){ }
            }
	});
        
        JMenu m7 = new JMenu("ABOUT");
        m7.setForeground(Color.BLUE);
        m7.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m7);
        
        JMenuItem mi15 = new JMenuItem("ABOUT");
	m7.add(mi15);
        
        mi15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new about().setVisible(true);
            }
	});
        
        JMenu m8= new JMenu("LOGOUT");
        m8.setForeground(Color.BLUE);
        m8.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuBar.setPreferredSize(new Dimension(80,80));
	menuBar.add(m8);
        
       JMenuItem mi16 = new JMenuItem("logout");
	m8.add(mi16);
        
        mi16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                setVisible(false);
                JOptionPane.showMessageDialog(null,"Logged Out succesfully");
              new login().setVisible(true);
              
            }
	});
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
