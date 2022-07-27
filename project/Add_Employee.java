
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_payroll;
import mini_payroll.Employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class Add_Employee extends JFrame implements ActionListener
{
JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5;
    JButton b,b1,b2,b3;
    public Add_Employee()
    {
        f = new JFrame("Add Employee");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150); 

        id6=new JLabel();
        id6.setBounds(0,0,900,700);
        id6.setLayout(null);
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
//        id15.setIcon(img);

        id5 = new JLabel("New Employee Details");
        id5.setBounds(320,30,500,50);
        id5.setFont(new Font("serif",Font.ITALIC,25));
        id5.setForeground(Color.black);
        id6.add(id5);
        f.add(id6);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id6.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id6.add(t1);

        id2= new JLabel("Age");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id6.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id6.add(t2);
     

        id4= new JLabel(" Id");
        id4.setBounds(50,200,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id6.add(id4);

        t4=new JTextField();   
        t4.setBounds(200,200,150,30);
        id6.add(t4);

        id5= new JLabel("salary");
        id5.setBounds(400,200,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id6.add(id5);

        t5=new JTextField();
        t5.setBounds(600,200,150,30);
        id6.add(t5);

        lab=new JLabel();
        lab.setBounds(400,200,200,30);
	id6.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,200,150,30);
        id6.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id6.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id6.add(b1);
        
         b.addActionListener((ActionListener) this);
         b1.addActionListener((ActionListener) this);
  
        
       
    }
   
    public static void main(String[] args) 
    {
       
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String a = t1.getText();
        String dd= t2.getText();
        String c = t3.getText();
        String d = t4.getText();
      
        if(ae.getSource() == b)
        {
            JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                f.setVisible(false);
               new Details().f1.setVisible(true);
               
        }
        else if(ae.getSource() == b1)
        {
           new Details().f1.setVisible(true);
            f.setVisible(false);
        }
        
        }
    }
