package travel.management.system;

import java.awt.*;
import javax.swing.*;


public class checkpackage extends JFrame{
    checkpackage(){
        setBounds(700,250,900,600);
        
        String[] package1=new String[]{"GOLD","PACKAGE","8 Days 7 Nights","Arrival-Check in hotel 2 Hours","Airport Assistance","AC Private Transportation","Tour Guide","Half Day Dhaka City Tour","Saint Martin Ship Ticket included","English Speaking Guide","BOOK NOW...","WINTER SPECIAL","COST:50000/- BDT.","package1.jpg"};
        
        String[] package2=new String[]{"SILVER","PACKAGE","5 Days 4 Nights","Meet and greet at Airport","Airport Assistance","NON AC Transportation","Tour Guide","Half Day Dhaka City Tour","Saint Martin Ship Ticket included","English Speaking Guide","BOOK NOW...","SUUMER SPECIAL","COST:30000/- BDT.","package2.jfif"};
        
        String[] package3=new String[]{"BRONZE","PACKAGE","4 Days 3 Nights","Welcome drinks on arrival","Airport Assistance","NON AC Transportation","Tour Guide","BBQ Dinner","Sajek Valey Camp","English Speaking Guide","BOOK NOW...","WINTER SPECIAL","COST:25000/- BDT.","package3.jpg"};
      
        JTabbedPane pane=new JTabbedPane();
        
        JPanel p1=createPackage(package1); 
        pane.addTab("Package 1",null,p1);
        
        JPanel p2=createPackage(package2);
        pane.addTab("Package 2",null,p2);
        
        JPanel p3=createPackage(package3);
        pane.addTab("Package 3",null,p3);
        
        add(pane,BorderLayout.CENTER);
        
    }
    
    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,35);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel la=new JLabel(pack[1]);
        la.setBounds(180,5,300,35);
        la.setForeground(new Color(0,100,0));
        la.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(la);
        
        JLabel l2=new JLabel(pack[2]);
        l2.setBounds(30,60,300,35);
        l2.setForeground(new Color(0,100,0));
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);
        
        JLabel l3=new JLabel(pack[3]);
        l3.setBounds(30,110,300,35);
        l3.setForeground(Color.red);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[4]);
        l4.setBounds(30,160,300,35);
        l4.setForeground(new Color(0,100,0));
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);
        
        JLabel l5=new JLabel(pack[5]);
        l5.setBounds(30,210,300,35);
        l5.setForeground(Color.red);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[6]);
        l6.setBounds(30,260,300,35);
        l6.setForeground(new Color(0,100,0));
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[7]);
        l7.setBounds(30,310,300,35);
        l7.setForeground(Color.red);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[8]);
        l8.setBounds(30,360,300,35);
        l8.setForeground(new Color(0,100,0));
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[9]);
        l9.setBounds(30,410,300,35);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[10]);
        l10.setBounds(60,460,300,35);
        l10.setForeground(Color.blue);
        l10.setFont(new Font("Tahoma",Font.PLAIN,28));
        p1.add(l10);
        
        JLabel l11=new JLabel(pack[11]);
        l11.setBounds(330,460,300,35);
        l11.setForeground(Color.red);
        l11.setFont(new Font("Tahoma",Font.PLAIN,28));
        p1.add(l11);
        
        JLabel l12=new JLabel(pack[12]);
        l12.setBounds(600,460,300,35);
        l12.setForeground(Color.red);
        l12.setFont(new Font("Tahoma",Font.PLAIN,28));
        p1.add(l12);
        
        
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Travel/management/system/icons/"+pack[13]));
       Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l13=new JLabel(i3);
       l13.setBounds(350,20,500,400);
       p1.add(l13);
        return p1;
    }
    
    public static void main(String[] args){
        new checkpackage().setVisible(true);
    }
}
