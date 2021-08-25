
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class viewpackage extends JFrame implements ActionListener{
    JButton b1;
    viewpackage(String username){
       setBounds(650,240,900,450);
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/bookpackage.jpg"));
       Image i2=i1.getImage().getScaledInstance(400,350,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l10=new JLabel(i3);
       l10.setBounds(450,20,400,350);
       add(l10);
       
       JLabel heading=new JLabel("View Package Details");
       heading.setBounds(60,0,300,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(heading);
       
       JLabel l1=new JLabel("Username :");
       l1.setBounds(30,50,100,30);
       add(l1);
       
       JLabel l11=new JLabel("");
       l11.setBounds(250,50,200,30);
       add(l11);
       
       JLabel l2=new JLabel("Package :");
       l2.setBounds(30,90,100,30);
       add(l2);
       
       JLabel l12=new JLabel("");
       l12.setBounds(250,90,200,30);
       add(l12);
       
       JLabel l3=new JLabel("Total Persons :");
       l3.setBounds(30,130,100,30);
       add(l3);
       
       JLabel l13=new JLabel("");
       l13.setBounds(250,130,200,30);
       add(l13);
       
       JLabel l4=new JLabel("Personal ID :");
       l4.setBounds(30,170,100,30);
       add(l4);
       
       JLabel l14=new JLabel("");
       l14.setBounds(250,170,200,30);
       add(l14);
       
       JLabel l5=new JLabel("PID Number :");
       l5.setBounds(30,210,100,30);
       add(l5);
       
       JLabel l15=new JLabel("");
       l15.setBounds(250,210,200,30);
       add(l15);
       
       JLabel l6=new JLabel("Phone :");
       l6.setBounds(30,250,100,30);
       add(l6);
       
       JLabel l16=new JLabel("");
       l16.setBounds(250,250,200,30);
       add(l16);
       
       JLabel l7=new JLabel("Price :");
       l7.setBounds(30,290,100,30);
       add(l7);
       
       JLabel l17=new JLabel("");
       l17.setBounds(250,290,200,30);
       add(l17);
       
       try{
           connect c=new connect();
           ResultSet rs=c.s.executeQuery("select * from bookpackage where username='"+username+"'");
           while(rs.next()){
               l11.setText(rs.getString("username"));
               l12.setText(rs.getString("package"));
               l13.setText(rs.getString("persons"));
               l14.setText(rs.getString("p_id"));
               l15.setText(rs.getString("pid_number"));
               l16.setText(rs.getString("phone"));
               l17.setText(rs.getString("price"));
                        
           }
       }catch(Exception e){
           
       }
       
       b1=new JButton("Back");
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.white);
       b1.setBounds(130,360,100,25);
       b1.addActionListener(this);
       add(b1);
    }
     public void actionPerformed(ActionEvent ae){  
        this.setVisible(false);
     }
    public static void main(String[] args){
        new viewpackage("").setVisible(true);
    }
}
