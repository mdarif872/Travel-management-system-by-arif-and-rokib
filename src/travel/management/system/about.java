
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class about extends JFrame implements ActionListener{
    String s;
    JButton b1;
    about(){
     setBounds(800,240,500,550);
     setLayout(null);
     getContentPane().setBackground(Color.white);
     
     JLabel l1=new JLabel("Travel and Tourism Management System");
     l1.setBounds(50,10,400,80);
     l1.setForeground(Color.BLACK);
     l1.setFont(new Font("Tahoma",Font.PLAIN,20));
    
     add(l1);
     
     s="About project\n" +
        "\n" +
        "The objective of the travel and tourism management system is to develop a system which will make the tour easy for a tourist.\n" +
        "\n" +
        "Here, User can check package details easily as all the packages are divided into sub category. User can Book packages. User can Add/Update/Delete his personal details.User can also check/book/view booked hotel here. The design of this project is pretty simple and user won’t find it difficult to understand, use and navigate.";
     
     TextArea t1=new TextArea(s,10,40,Scrollbar.VERTICAL);
     t1.setEditable(false);
     t1.setBounds(20,100,450,300);
     add(t1);
     add(l1);
     b1=new JButton("back");
     b1.setBounds(180,420,100,25);
     b1.addActionListener(this);
     add(b1);
    }
    public void actionPerformed(ActionEvent ae){
         this.setVisible(false);
     }
    public static void main(String[] args){
        new about().setVisible(true);
    }
}
