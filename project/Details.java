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

public class Details extends JFrame implements ActionListener
{

     JFrame f1;
   JLabel l1,l2;
   JButton b1,b2,b3,b4;
   Details()
   {
    f1= new JFrame("Employee Details");
    f1.setBackground(Color.WHITE);
    f1.setLayout(null);
    f1.getContentPane().setBackground(Color.WHITE);
    f1.setVisible(true);
    f1.setSize(700, 500);
    f1.setLocation(450, 300);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
       
      l1=new JLabel();
      l1.setBounds(0, 0, 700, 500);
      l1.setLayout(null);
      f1.add(l1);
      
      l2=new JLabel();
      l2.setBounds(430, 20, 200, 40);
      l2.setLayout(null);
      l2.setBackground(Color.BLACK);
      l2.setFont(new Font("serif",Font.BOLD,25));
      f1.add(l2);
       
    b1=new JButton("add");
    b1.setBounds(420, 80, 100, 40);
    b1.setFont(new Font("serif",Font.BOLD,15));
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.addActionListener((ActionListener) this);
    l1.add(b1);
       
    b2=new JButton("VIEW");
    b2.setBounds(530, 80, 100, 40);
    b2.setFont(new Font("serif",Font.BOLD,15));
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.addActionListener((ActionListener) this);
    l1.add(b2); 
       
    b3=new JButton("DELETE");
    b3.setBounds(420, 140, 100, 40);
    b3.setFont(new Font("serif",Font.BOLD,15));
    b3.setBackground(Color.BLACK);
    b3.setForeground(Color.WHITE);
    b3.addActionListener((ActionListener) this);
    l1.add(b3);    
       
    b4=new JButton("UPDATE");
    b4.setBounds(530, 140, 100, 40);
    b4.setFont(new Font("serif",Font.BOLD,15));
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.addActionListener((ActionListener) this);
    l1.add(b4);
    
       
   }
 

    public static void main(String[] args)
    {
     Details d=new Details();  
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
          if(ae.getSource()==b1);
       {
           f1.setVisible(false);
           Add_Employee add_employee = new Add_Employee();
   
       }
        
       if(ae.getSource()==b2);
       {
            View_Employee view_Employee = new View_Employee();
            
           f1.setVisible(false);
           
       }
       if(ae.getSource()==b3);
       {
            Delete_Employee  delete_employee = new  Delete_Employee();
           f1.setVisible(false);
          
       }
       if(ae.getSource()==b4);
       {
              Update_Employee  Update_Employee = new  Update_Employee();
           f1.setVisible(false);
         
       }
         
    }
   
}
