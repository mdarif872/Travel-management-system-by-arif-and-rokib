package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class adduser extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox c1;
    JButton b1,b2;
    JRadioButton r1,r2;
    
    adduser(String username){
        setBounds(600,250,850,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l11=new JLabel("ADD USER DETAILS");
        l11.setBounds(50,0,300,25);
        l11.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l11);
        
        JLabel l1=new JLabel("Username :");
        l1.setBounds(30,50,150,25);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,50,150,25);
        add(t1);
        
        JLabel l2=new JLabel("ID Type :");
        l2.setBounds(30,90,150,25);
        add(l2);
        
        c1=new JComboBox(new String[] {"Passport","National Identity Card"});
        c1.setBounds(220,90,150,25);
        add(c1);
        
        JLabel l3=new JLabel("ID Number :");
        l3.setBounds(30,130,150,25);
        add(l3);
        
        t2=new JTextField();
        t2.setBounds(220,130,150,25);
        add(t2);
        
        JLabel l4=new JLabel("Full Name :");
        l4.setBounds(30,170,150,25);
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(220,170,150,25);
        add(t3);
        
        JLabel l5=new JLabel("Gender :");
        l5.setBounds(30,210,150,25);
        add(l5);
        
        r1=new JRadioButton("Male");
        r1.setBackground(Color.white);
        r1.setBounds(220,210,70,25);
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBackground(Color.white);
        r2.setBounds(300,210,70,25);
        add(r2);
        
        JLabel l6=new JLabel("Country :");
        l6.setBounds(30,250,150,25);
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(220,250,150,25);
        add(t4);
        
        JLabel l7=new JLabel("Address :");
        l7.setBounds(30,290,150,25);
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(220,290,150,25);
        add(t5);
        
        JLabel l8=new JLabel("Phone :");
        l8.setBounds(30,330,150,25);
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(220,330,150,25);
        add(t6);
        
        JLabel l9=new JLabel("Email :");
        l9.setBounds(30,370,150,25);
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(220,370,150,25);
        add(t7);
        
        b1=new JButton("Add");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(70,430,100,25);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(220,430,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/adduser.png"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10=new JLabel(i3);
        l10.setBounds(400,40,450,420);
        add(l10);
        
        try{
            connect c=new connect();
            ResultSet rs=c.s.executeQuery("select * from account where username='"+username+"'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("fullname"));
            }
        }catch(Exception e){
            
        }
           
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        String username=t1.getText();
        String p_id=(String)c1.getSelectedItem();
        String pid_number=t2.getText();
        String fullname=t3.getText();
        String radio=null;
        if(r1.isSelected()){
            radio="Male";
        }
        else if(r2.isSelected()){
            radio="Female";
        }
        String country=t4.getText();
        String address=t5.getText();
        String phone=t6.getText();
        String email=t7.getText();

        String q="Insert into customer values('"+username+"','"+p_id+"','"+pid_number+"','"+fullname+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
        try{
         connect c=new connect();
         c.s.executeUpdate(q);

         JOptionPane.showMessageDialog(null,"User details added succesfully");
         this.setVisible(false);
     }catch(Exception e){
     e.printStackTrace();
     }
        
    }else if(ae.getSource()==b2){
        this.setVisible(false);
    }    
    }
    public static void main(String[] args){
        new adduser("").setVisible(true);
    }
}
 