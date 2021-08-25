

package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class viewbookedhotel extends JFrame implements ActionListener{
    JButton b1;
    viewbookedhotel(String username){
       setBounds(610,240,1000,600);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/hotel1.jpg"));
       Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l30=new JLabel(i3);
       l30.setBounds(450,90,420,350);
       add(l30);
       
       JLabel heading=new JLabel("VIEW BOOKED HOTEL DETAILS");
       heading.setBounds(60,0,300,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(heading);
       
       JLabel l1=new JLabel("Username :");
       l1.setBounds(30,50,100,30);
       add(l1);
       
       JLabel l11=new JLabel("");
       l11.setBounds(250,50,200,30);
       add(l11);
       
       JLabel l2=new JLabel("Hotel Name: ");
       l2.setBounds(30,90,100,30);
       add(l2);
       
       JLabel l12=new JLabel("");
       l12.setBounds(250,90,200,30);
       add(l12);
       
       JLabel l3=new JLabel("Total Persons: ");
       l3.setBounds(30,130,100,30);
       add(l3);
       
       JLabel l13=new JLabel("");
       l13.setBounds(250,130,200,30);
       add(l13);
       
       JLabel l4=new JLabel("Total Days: ");
       l4.setBounds(30,170,100,30);
       add(l4);
       
       JLabel l14=new JLabel("");
       l14.setBounds(250,170,200,30);
       add(l14);
       
       JLabel l5=new JLabel("AC included?: ");
       l5.setBounds(30,210,100,30);
       add(l5);
       
       JLabel l15=new JLabel("");
       l15.setBounds(250,210,200,30);
       add(l15);
       
       JLabel l6=new JLabel("Food Included? ");
       l6.setBounds(30,250,100,30);
       add(l6);
       
       JLabel l16=new JLabel("");
       l16.setBounds(250,250,200,30);
       add(l16);
       
       JLabel l7=new JLabel("Personal ID: ");
       l7.setBounds(30,290,100,30);
       add(l7);
       
       JLabel l17=new JLabel("");
       l17.setBounds(250,290,200,30);
       add(l17);
       
       JLabel l8=new JLabel("PID Number: ");
       l8.setBounds(30,330,100,30);
       add(l8);
       
       JLabel l18=new JLabel("");
       l18.setBounds(250,330,200,30);
       add(l18);
       
       JLabel l9=new JLabel("Phone: ");
       l9.setBounds(30,370,100,30);
       add(l9);
       
       JLabel l19=new JLabel("");
       l19.setBounds(250,370,200,30);
       add(l19);
       
       JLabel l10=new JLabel("Total Cost: ");
       l10.setBounds(30,410,100,30);
       add(l10);
       
       JLabel l20=new JLabel("");
       l20.setBounds(250,410,200,30);
       add(l20);
       
       try{
           connect c=new connect();
           ResultSet rs=c.s.executeQuery("select * from bookhotel where username='"+username+"'");
           while(rs.next()){
               l11.setText(rs.getString(1));
               l12.setText(rs.getString(2));
               l13.setText(rs.getString(3));
               l14.setText(rs.getString(4));
               l15.setText(rs.getString(5));
               l16.setText(rs.getString(6));
               l17.setText(rs.getString(7));
               l18.setText(rs.getString(8));
               l19.setText(rs.getString(9));
               l20.setText(rs.getString(10));
                 
                        
           }
       }catch(Exception e){
           
       }
       
       b1=new JButton("Back");
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.white);
       b1.setBounds(130,460,100,25);
       b1.addActionListener(this);
       add(b1);
    }
     public void actionPerformed(ActionEvent ae){  
        this.setVisible(false);
     }
    public static void main(String[] args){
        new viewbookedhotel("").setVisible(true);
    }
}

