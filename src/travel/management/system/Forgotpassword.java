
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Forgotpassword extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    Forgotpassword(){
        setBounds(550,250,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.png"));
        JLabel l6=new JLabel(i1);
        l6.setBounds(535,20,300,300);
        add(l6);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,20,150,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        b1=new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(380,20,100,25);
        p1.add(b1);
        
        JLabel l2=new JLabel("Full Name");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(220,60,150,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Security Question");
        l3.setBounds(40,100,170,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(220,100,250,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Answer");
        l4.setBounds(40,140,170,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l4);
        
        t4=new JTextField();
        t4.setBounds(220,140,150,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        b2=new JButton("Retrieve");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(380,140,100,25);
        p1.add(b2);
        
        JLabel l5=new JLabel("Password");
        l5.setBounds(40,180,150,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l5);
        
        t5=new JTextField();
        t5.setBounds(220,180,150,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
        b3=new JButton("Back");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150,230,100,25);
        b3.addActionListener(this);
        p1.add(b3);
        
    }
    public void actionPerformed(ActionEvent ae){
        connect c=new connect();
        if(ae.getSource()==b1){
            try{
          String sql="Select * from account where username='"+t1.getText()+"'";
          ResultSet rs=c.s.executeQuery(sql);
          while(rs.next()){
              t2.setText(rs.getString("fullname"));
              t3.setText(rs.getString("security"));
          }
            }catch(Exception e){
            }
        }else if(ae.getSource()==b2){
            try{
          String sql="Select * from account where answer='"+t4.getText()+"' AND username='"+t1.getText()+"'";
          ResultSet rs=c.s.executeQuery(sql);
          while(rs.next()){
              t5.setText(rs.getString("password"));
          }
            }catch(Exception e){
            }
          
        }else if(ae.getSource()==b3){
         this.setVisible(false);
         new login().setVisible(true);
      }
    }
    
    public static void main(String[] args){
     new Forgotpassword().setVisible(true);    
    }
}
