/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.payroll.system;

/**
 * //updated
 * @author Reem
 */
public abstract class Employee {
    protected int id;
    protected String name;
    protected int age ;
    protected float salary;

 
 public abstract void display();
 public abstract void delete();
  public abstract void edit();
   
 
   
   
}


