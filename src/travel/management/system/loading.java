package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
          
        public void run(){
            try{
               for(int i=1;i<=101;i++){
                   int m=p.getMaximum();
                   int n=p.getValue();
                   if(n<m){
                       p.setValue(p.getValue()+1);
                   }else{
                       i=101;
                       setVisible(false);
                       new home(username).setVisible(true);
                       
                   }
                   Thread.sleep(50);
            } 
            }catch(Exception e){     
            }
        }
        
    loading(String user){
        username=user;
        t=new Thread(this);
  
        setBounds(700,250,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel l1=new JLabel("Travel And Tourism Management");
        l1.setBounds(90,20,520,40);
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setForeground(new Color(51,204, 255));
        add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(150,100,300,25);
        add(p);
        
        JLabel l2=new JLabel("Loading......");
        l2.setBounds(270,130,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.RED);
        add(l2);
        
        JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(20,310,400,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(new Color(51,204, 255));
        add(l3);
        
        t.start();
    }
    public static void main(String[] args){
        new loading("").setVisible(true);
    }
}
