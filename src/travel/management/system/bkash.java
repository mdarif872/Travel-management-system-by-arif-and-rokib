package travel.management.system;

import java.awt.event.*;
import javax.swing.*;

public class bkash extends JFrame implements ActionListener{
    JButton b1;
    bkash(){
        JEditorPane j=new JEditorPane();
        j.setEditable(false);
        try{
            j.setPage("https://www.bkash.com/products-services/send-money");
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("<html>Could not load,error 404</html>");
        }
        JScrollPane js=new JScrollPane(j);
        getContentPane().add(js);
        
        b1=new JButton("back");
        b1.setBounds(610,20,80,40);
        b1.addActionListener(this);
        j.add(b1);
        
        setBounds(670,240,800,600);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new payment().setVisible(true);
    }
    public static void main(String[] args){
        new bkash().setVisible(true);
    }
}
