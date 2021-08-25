package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;


public  class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    Signup(){
        setBounds(600,280,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(51,204, 255));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setForeground(Color.white);
        l1.setBounds(50,20,100,25);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190,20,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        add(t1);
        
        JLabel l2=new JLabel("Full Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.white);
        l2.setBounds(50,60,125,25);
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(190,60,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        add(t2);
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.white);
        l3.setBounds(50,100,125,25);
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(190,100,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        add(t3);
        
        JLabel l4=new JLabel("Security Question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.white);
        l4.setBounds(50,140,125,25);
        p1.add(l4);
        
        c1=new Choice();
        c1.add("What is your Nickname?");
        c1.add("What is your favourite Book?");
        c1.add("Your favourite Book Writer?");
        c1.add("Your favourite sportsperson?");
        c1.setBounds(190,140,180,25);
        p1.add(c1);
        
        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.white);
        l5.setBounds(50,180,125,25);
        p1.add(l5);
        
        t4=new JTextField();
        t4.setBounds(190,180,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        add(t4);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250,220,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3); 
        l6.setBounds(570,20,250,220);
        add(l6);
        
        b1=new JButton("Create");
        b1.setFont(new Font("Tahoma",Font.BOLD,14));
        b1.setBackground(Color.WHITE);
        b1.setBounds(80,250,100,30);
        b1.addActionListener(this);
        p1.add(b1);
        
        b2=new JButton("Back");
        b2.setFont(new Font("Tahoma",Font.BOLD,14));
        b2.setBackground(Color.WHITE);
        b2.setBounds(250,250,100,30);
        b2.addActionListener(this);
        p1.add(b2);
            
    }
    
    public void actionPerformed(ActionEvent a1){
        if(a1.getSource()==b1){
            String username=t1.getText();
            String fullname=t2.getText();
            String password=t3.getText(); 
            String security=c1.getSelectedItem(); 
            String answer=t4.getText(); 
            
            String query="insert into account values('"+username+"','"+fullname+"','"+password+"','"+security+"','"+answer+"')";
            try{
                connect c=new connect();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Congratulations,your account has been successfully created.");
                this.setVisible(false);
                new login().setVisible(true);
            }catch(Exception e){
                
            }
     }else if(a1.getSource()==b2){
         new login().setVisible(true); 
         this.setVisible(false);
    }
    
    }   
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
    
}
