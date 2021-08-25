
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class bookhotel extends JFrame implements ActionListener{
    Choice c1,c2,c3;
    JTextField t1,t2;
    JLabel l21,l22,l23,l24,l25;
    JButton b1,b2,b3;
    bookhotel(String username){
        setBounds(550,240,1100,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1=new JLabel("BOOK HOTEL");
        l1.setFont(new Font("Tahoma",Font.PLAIN,24));
        l1.setBounds(100,0,300,30);
        add(l1);
        
        JLabel l2=new JLabel("Username: ");
        l2.setBounds(20,70,200,30);
        add(l2);
        
        l21=new JLabel();
        l21.setBounds(250,70,200,30);
        add(l21);
        
        JLabel l3=new JLabel("Select Hotel: ");
        l3.setBounds(20,110,200,30);
        add(l3);
        
        c1=new Choice();
        try{
            connect c=new connect();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch(Exception e){}
        c1.setBounds(250,110,200,30);
        add(c1);
        
        JLabel l4=new JLabel("Total persons: ");
        l4.setBounds(20,150,200,30);
        add(l4);
        
        t1=new JTextField();
        t1.setBounds(250,150,200,25);
        add(t1);
     
        JLabel l5=new JLabel("No. of Days: ");
        l5.setBounds(20,190,200,30);
        add(l5);
        
        t2=new JTextField();
        t2.setBounds(250,190,200,25);
        add(t2);
        
        JLabel l6=new JLabel("AC/NON-AC: ");
        l6.setBounds(20,230,200,30);
        add(l6);
        
        c2=new Choice();
        c2.add("Yes");
        c2.add("No");
        c2.setBounds(250,230,200,30);
        add(c2);
        
        JLabel l7=new JLabel("Food Included: ");
        l7.setBounds(20,270,200,30);
        add(l7);
        
        c3=new Choice();
        c3.add("Yes");
        c3.add("No");
        c3.setBounds(250,270,200,30);
        add(c3);
       
        JLabel l8=new JLabel("Personal ID: ");
        l8.setBounds(20,310,200,30);
        add(l8);
        
        l22=new JLabel();
        l22.setBounds(250,310,200,30);
        add(l22);
        
        JLabel l9=new JLabel("PID Number: ");
        l9.setBounds(20,350,200,30);
        add(l9);
        
        l23=new JLabel();
        l23.setBounds(250,350,200,30);
        add(l23);
        
        JLabel l10=new JLabel("Phone: ");
        l10.setBounds(20,390,200,30);
        add(l10);
        
        l24=new JLabel();
        l24.setBounds(250,390,200,30);
        add(l24); 
        
        JLabel l11=new JLabel("Total Price: ");
        l11.setBounds(20,430,200,30);
        add(l11);
        
        l25=new JLabel();
        l25.setForeground(Color.blue);
        l25.setBounds(250,430,200,30);
        add(l25);
        
        try{
            connect c=new connect();
            ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next()){
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("p_id"));
                l23.setText(rs.getString("pid_number"));
                l24.setText(rs.getString("phone"));
                   
            }
        }catch(Exception e){}
        b1=new JButton("Check price");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(40,490,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Book");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(200,490,120,30);
        b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Back");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(350,490,120,30);
        b3.addActionListener(this);
        add(b3);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/bookhotel.png"));
       Image i2=i1.getImage().getScaledInstance(500,200,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l12=new JLabel(i3);
       l12.setBounds(550,180,500,200);
       add(l12);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                connect c=new connect();
                ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("cost_per_day"));
                    int food=Integer.parseInt(rs.getString("food_charges"));
                    int ac=Integer.parseInt(rs.getString("ac_charges"));
                    
                    int persons=Integer.parseInt(t1.getText());
                    int days=Integer.parseInt(t2.getText());
                    
                    String acprice=c2.getSelectedItem();
                    String foodprice=c3.getSelectedItem();
                    
                    if(persons * days > 0){
                        int total=0;
                        total += acprice.equals("Yes") ? ac : 0;
                        total += foodprice.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        l25.setText(""+total);
                    }else{
                        l25.setText("Please enter a valid number");
                    }    
                }
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            String username=l21.getText();
            String hotel=c1.getSelectedItem();
            String persons=t1.getText(); 
            String days=t2.getText(); 
            String ac=c2.getSelectedItem();
            String food=c3.getSelectedItem();
            String p_id=l22.getText();
            String pid_number=l23.getText();
            String phone=l24.getText();
            String cost=l25.getText();
            
            String query="INSERT INTO bookhotel VALUES('"+username+"','"+hotel+"','"+persons+"','"+days+"','"+ac+"','"+food+"','"+p_id+"','"+pid_number+"','"+phone+"','"+cost+"')";
            try{
              connect c=new connect();
              c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "hotel booked successfully");
              this.setVisible(false);
              
            }catch(Exception e){
        }
    }else if(ae.getSource()==b3){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new bookhotel("").setVisible(true);
    }
}
