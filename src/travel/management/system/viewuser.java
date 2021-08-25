package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class viewuser extends JFrame implements ActionListener{

    JButton b2;
    
    viewuser(String username){
        setBounds(700,250,850,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l11=new JLabel("VIEW USER DETAILS");
        l11.setBounds(50,0,300,25);
        l11.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l11);
        
        JLabel l1=new JLabel("Username :");
        l1.setBounds(30,50,150,25);
        add(l1);
        
        JLabel l12=new JLabel();
        l12.setBounds(220,50,150,25);
        add(l12);
        
        JLabel l2=new JLabel("ID Type :");
        l2.setBounds(30,90,150,25);
        add(l2);
        
        JLabel l13=new JLabel();
        l13.setBounds(220,90,150,25);
        add(l13);
        
        JLabel l3=new JLabel("ID Number :");
        l3.setBounds(30,130,150,25);
        add(l3);
        
        JLabel l14=new JLabel();
        l14.setBounds(220,130,150,25);
        add(l14);
        
        JLabel l4=new JLabel("Full Name :");
        l4.setBounds(30,170,150,25);
        add(l4);
        
        JLabel l15=new JLabel();
        l15.setBounds(220,170,150,25);
        add(l15);
        
        JLabel l5=new JLabel("Gender :");
        l5.setBounds(30,210,150,25);
        add(l5);
        
        JLabel l16=new JLabel();
        l16.setBounds(220,210,150,25);
        add(l16);
        
        JLabel l6=new JLabel("Country :");
        l6.setBounds(30,250,150,25);
        add(l6);
        
        JLabel l17=new JLabel();
        l17.setBounds(220,250,150,25);
        add(l17);
        
        JLabel l7=new JLabel("Address :");
        l7.setBounds(30,290,150,25);
        add(l7);
        
        JLabel l18=new JLabel();
        l18.setBounds(220,290,150,25);
        add(l18);
        
        JLabel l8=new JLabel("Phone :");
        l8.setBounds(30,330,150,25);
        add(l8);
        
        JLabel l20=new JLabel();
        l20.setBounds(220,330,150,25);
        add(l20);
        
        JLabel l9=new JLabel("Email :");
        l9.setBounds(30,370,150,25);
        add(l9);
        
        JLabel l21=new JLabel();
        l21.setBounds(220,370,150,25);
        add(l21);
        
        b2=new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(90,430,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/viewuser.png"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10=new JLabel(i3);
        l10.setBounds(400,40,450,420);
        add(l10);
        
        try{
            connect c=new connect();
            ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next()){
                l12.setText(rs.getString("username"));
                l13.setText(rs.getString("p_id"));
                l14.setText(rs.getString("pid_number"));
                l15.setText(rs.getString("fullname"));
                l16.setText(rs.getString("gender"));
                l17.setText(rs.getString("country"));
                l18.setText(rs.getString("address"));
                l20.setText(rs.getString("phone"));
                l21.setText(rs.getString("email"));
           }
        }catch(Exception e){
            
        }
           
    }
    
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b2){
        this.setVisible(false);
    }    
    }
    public static void main(String[] args){
        new viewuser("").setVisible(true);
    }
}