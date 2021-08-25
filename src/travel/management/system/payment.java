
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener{
    JButton b1,b2;
    payment(){
        setBounds(670,240,800,700);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/payment.PNG"));
       Image i2=i1.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(0,100,800,500);
       add(l1);
       
       b1=new JButton("pay");
       b1.setBounds(300,30,80,40);
       b1.addActionListener(this);
       add(b1);
        
       b2=new JButton("back");
       b2.setBounds(400,30,80,40);
       b2.addActionListener(this);
       add(b2);
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==b1){
             this.setVisible(false);
             new bkash().setVisible(true);
         }else if(ae.getSource()==b2){
             this.setVisible(false);
         }
     }
    public static void main(String[] args){
        new payment().setVisible(true);
    }
}
