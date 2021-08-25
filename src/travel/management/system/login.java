
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
 login(){
    setLayout(null);
    getContentPane().setBackground(Color.white);
    setBounds(550,250,900,400);
    
    JPanel p1=new JPanel();
    p1.setBackground(new Color(51,204, 255));
    p1.setBounds(0,0,400,400);
    add(p1);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
    Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    
    JLabel l1=new JLabel(i3);
    l1.setBounds(100,120,200,200);
    p1.setLayout(null);
    p1.add(l1);
    
    
   JPanel p2=new JPanel();
   p2.setLayout(null);
   p2.setBounds(400,30,450,300);
   add(p2);
   
   JLabel l2=new JLabel("Username");
   l2.setBounds(60,20,100,25);
   l2.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
   p2.add(l2);
   
   t1=new JTextField();
   t1.setBounds(60,60,200,25); 
   t1.setBorder(BorderFactory.createEmptyBorder());
   p2.add(t1);
   
   JLabel l3=new JLabel("Password");
   l3.setBounds(60,110,100,25);
   l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
   p2.add(l3);
   
   t2=new JPasswordField();
   t2.setBounds(60,150,200,25);
   t2.setBorder(BorderFactory.createEmptyBorder());
   p2.add(t2);
   
   b1=new JButton("Login");
   b1.setBounds(60,200,130,30);
   b1.setBackground(new Color(51,204, 255));
   b1.setForeground(Color.white);
   b1.setBorder(BorderFactory.createEmptyBorder());
   b1.addActionListener(this);
   p2.add(b1);
   
   b2=new JButton("Sign Up");
   b2.setBounds(230,200,130,30);
   b2.setForeground(new Color(51,204, 255));
   b2.setBackground(Color.white);
   b2.setBorder(new LineBorder(new Color(51,204, 255)));
   b2.addActionListener(this);
   p2.add(b2);
   
   b3=new JButton("Forgot Password");
   b3.setBounds(130,250,160,30);
   b3.setForeground(new Color(51,204, 255));
   b3.setBackground(Color.white);
   b3.setBorder(new LineBorder(new Color(51,204, 255)));
   b3.addActionListener(this);
   p2.add(b3);
   
   JLabel l4=new JLabel("Password");
   
    
    setVisible(true);
 }
 
 public void actionPerformed(ActionEvent a1){
     if(a1.getSource()==b1){
         try{
            String username=t1.getText();
            String password=t2.getText();
            String sql="select * from account where username = '"+username+"' AND password='"+password+"'";
            connect c=new connect();
            ResultSet rs=c.s.executeQuery(sql);
            if(rs.next()){
              this.setVisible(false);
              new loading(username).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "No user found.");
            }
         }catch(Exception e){
             
         }
     }else if(a1.getSource()==b2){
         this.setVisible(false);
         new Signup().setVisible(true);     
     }else if(a1.getSource()==b3){
             this.setVisible(false);
             new Forgotpassword().setVisible(true);
    }
 }
 public static void main(String[] args){
     new login();
 }
}

