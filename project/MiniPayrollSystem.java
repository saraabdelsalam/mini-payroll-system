/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.payroll.system;
import java.util.Scanner;
/**
 * //updated
 * @author Reem
 */
public class MiniPayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Engineer  obj=new Engineer();
            Grade gradeObj1=new Grade("manager",0.2f,100);
            Grade gradeObj2=new Grade("team leader",0.2f,60);
            Grade gradeObj3=new Grade("team member",0.2f,40);
            Engineer  engObj1=new Engineer(10,"Salma",40,150,gradeObj1);
            Engineer  engObj2=new Engineer(20,"Nour",32,150,gradeObj1);
            Engineer  engObj3=new Engineer(30,"Mariam",31,150,gradeObj2);
            Engineer  engObj4=new Engineer(40,"Rana",30,150,gradeObj3);
            Trainee t =new Trainee();
            Trainee t1=new Trainee("Aya",100,19,"Cairo University",3,3.4f);
            Trainee t2=new Trainee("Esraa",101,20,"Ain Shams University",3,3.3f);
            Trainee t3=new Trainee("Dina",102,18,"Ain Shams University",4,3.2f);
              obj.add(engObj1);
              obj.add(engObj2);
              obj.add(engObj3);
              obj.add(engObj4);
              t.add(t1);
              t.add(t2);
              t.add(t3);
           boolean y= true;
           do{
               
               System.out.println(" *************Menu************");
               System.out.println("press '1' to add new Engineer");
               System.out.println("press '2' to edit an existing Engineer");
               System.out.println("press '3' to delete Engineer");
               System.out.println("press '4' to view all Engineers data");
               System.out.println("press '5' to calculate salary");
               System.out.println("press '6' to add a new trainee");
               System.out.println("press '7' to edit an existing trainee");
               System.out.println("press '8' to delete trainee");
               System.out.println("press '9' to view all trainee data");
               System.out.println("press '10' to exit");
               System.out.println("enter your choice");
                Scanner input=new Scanner(System.in);
             int choice=input.nextInt();
              switch(choice)
              {
                  case 1:
          System.out.println("enter  Engineer id:");
          int engId=input.nextInt();
          System.out.println("enter  Engineer name you want to add :");
          String engName=input.next();
          
          System.out.println("enter  Engineer age:");
          int engAge=input.nextInt();
          
          System.out.println("enter  Engineer working hours:");
          int engWorkHours = input.nextInt();
           System.out.println("enter  Engineer position:");
            String engPosition=input.next();
              System.out.println("enter  Engineer tax rate:");
              float engTaxRate=input.nextFloat();
                System.out.println("enter  Engineer pay rate:");
                 int engPayRate=input.nextInt();
          Grade gradeObject=new Grade(engPosition,engTaxRate,engPayRate);
         
          Engineer  newEngineer = new Engineer( engId,engName,engAge,engWorkHours, gradeObject);
                     obj.add( newEngineer);
                     break;
                  case 2:
                     obj.edit();
                     break;
                  case 3:
                     obj.delete();
                     break;
                  case 4:
                      obj.display();
                      break;
                   case 5:
                      obj.calculateSalary();
                      break;
                  case 6:
           System.out.println("enter  trainee id :");
          int traineeId=input.nextInt();
          System.out.println("enter  trainee name :");
          String traineeName=input.next();
          
          System.out.println("enter  trainee age:");
          int traineeAge=input.nextInt();
          
          System.out.println("enter  trainee university name:");
          String universityName=input.next();
           System.out.println("enter  trainee gpa:");
            float gpa=input.nextFloat();
              System.out.println("enter  trainee academic year:");
             int academicYear=input.nextInt();
               Trainee newTrainee=new Trainee (traineeName,traineeId,traineeAge,universityName, academicYear, gpa);
                      t.add(newTrainee);
                      break;
                  case 7:
                      t.edit();
                      break;
                  case 8:
                      t.delete();
                      break;
                  case 9:
                      t.display();
                      break;
                  case 10:
                      break;
                  default:
                       System.out.println("please enter a valid choice");
              
              
              } System.out.println("do you want to choose again  'y/n' ");
              String answer=input.next();
           if (answer.equals ("n"))
           {
           y=false;
           }
           }while(y!=false);
    }
    
}
