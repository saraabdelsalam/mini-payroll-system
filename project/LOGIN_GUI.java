
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_payroll;
import mini_payroll.Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class LOGIN_GUI  extends JFrame implements ActionListener
{
JFrame f;
   JLabel l1,l2;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2;
   
   LOGIN_GUI()
   {
    f= new JFrame("LOGON");
    f.setBackground(Color.WHITE);
    f.setLayout(null);
    f.getContentPane().setBackground(Color.WHITE);
    f.setVisible(true);
    f.setSize(600, 300);
    f.setLocation(400, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    
    l1=new JLabel("NAME");
    l1.setBounds(40,20,100,30);
    f.add(l1);
    
   
    l2=new JLabel("PASSWORD");
    l2.setBounds(40, 70, 100, 30);
    f.add(l2);
    
    
    t1=new JTextField();
    t1.setBounds(150, 20, 150, 30);
    f.add(t1);
  
    t2=new JPasswordField();
    t2.setBounds(150,70,150,30);
    f.add(t2);
    
    b1=new JButton("LOGIN");
    b1.setBounds(40, 140, 120, 30);
    b1.setFont(new Font("serif",Font.BOLD,15));
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    f.add(b1);
    
    b2=new JButton("cancel");
    b2.setBounds(180, 140, 120, 30);
    b2.setFont(new Font("serif",Font.BOLD,15));
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    
    f.add(b2);
    
    b1.addActionListener((ActionListener) this);
    b2.addActionListener((ActionListener) this);
  

  }
   
    public static void main(String[] args)
    {
         LOGIN_GUI l=new LOGIN_GUI();
        // TODO code application logic here
    }


    @Override
    public void actionPerformed(ActionEvent ae)
    {
       
    String user_name=t1.getText();   
    String password=String.valueOf(t2.getPassword());
    
        if (ae.getSource()==b2)
       {
           t1.setText(null);
           t2.setText(null);
       }
      else if(ae.getSource()==b1&&user_name.contains("admin")&&password.contains("123"))
       {
         
            new Details().f1.setVisible(true);
            f.setVisible(false);
       }

       else
       {
           l1.setForeground(Color.RED);
           l1.setText("wrong name");
           l2.setForeground(Color.RED);
           l2.setText("wrong password");
           t1.setText(null);
           t2.setText(null);
       }
    }
    
}
