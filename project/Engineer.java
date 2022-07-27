//updated
package mini.payroll.system;
import java.util.Scanner;

public class Engineer extends Employee{
    private int WorkingHours;
    private Grade grade;
private Engineer []engineers=new Engineer[50];
 
       public Engineer(int id,String name,int age,int WorkingHours, Grade grade) {      
        this.id = id;
        this.name = name;
        this.age = age;
        this.WorkingHours = WorkingHours;
        this.grade = grade;
    }

    public Engineer() {
    }
   
      public void add(Engineer newEngineer)
      {
          
       for (int i=0;i<engineers.length;i++)
       {
       if(engineers[i]==null){
       engineers[i]= newEngineer;
       break;
       }
   
      }
      }
 
      public void editName() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  Engineer id you want to edit :");
          int engId=input.nextInt();
           System.out.println("enter  Engineer name to edit :");
          String engname=input.next();
          for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null && engineers[i].id == engId){
        	  engineers[i].name = engname;
        	          break;  
          }
           }
          
      }
      public void editAge() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  Engineer id you want to edit :");
          int engId=input.nextInt();
           System.out.println("enter  Engineer age to edit :");
          int engAge=input.nextInt();
          for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null && engineers[i].id == engId){
        	  engineers[i].age = engAge;
        	          break;  
          }
           }
          
      }
      
       public void editWorkingHours() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  Engineer id you want to edit :");
          int engId=input.nextInt();
           System.out.println("enter  Engineer working hours to edit :");
          int engWorkingHours=input.nextInt();
          for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null && engineers[i].id == engId){
        	  engineers[i].WorkingHours = engWorkingHours;
        	          break;  
          }
           }
          
      }
      
         public void editPosition() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  Engineer id you want to edit :");
          int engId=input.nextInt();
           System.out.println("enter  Engineer position to edit :");
          String engPosition=input.next();
          for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null && engineers[i].id == engId){
        	  engineers[i].grade.setPosition(engPosition);
        	          break;  
          }
           }
          
      }
       
          public void editPayRate() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  Engineer id you want to edit :");
          int engId=input.nextInt();
           System.out.println("enter  Engineer pay rate to edit :");
          int engPayRate=input.nextInt();
          for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null && engineers[i].id == engId){
        	  engineers[i].grade.setPayRate(engPayRate);
        	          break;  
          }
           }
          
      }
       
       
       
      public void edit(){
        Scanner input = new Scanner(System .in);
        System.out.println("press '1'  to edit name :");
        System.out.println("press '2'  to edit age:");
        System.out.println("press '3'  to edit working hours:");
        System.out.println("press '4'  to edit position:");
        System.out.println("press '5'  to edit pay rate:");
        System.out.println("enter  your choice :");
          int choice=input.nextInt();
      switch (choice){
      
          case 1:
          editName();
          break;
          case 2:
          editAge();
          break;
          case 3:
          editWorkingHours();
          break;
          case 4:
          editPosition();
          break;
          case 5:
          editPayRate();
           break;
          default:
           System.out.println("enter  a valid choice :");
           break;
      }  
      }

      public void calculateSalary() {
    	  for (int i=0;i<engineers.length;i++)
          {
          if(engineers[i]!=null ){
        	  
        	   engineers[i].salary = (engineers[i].WorkingHours * engineers[i].grade.getPayRate()) -  (engineers[i].grade.getTaxRate()*engineers[i].WorkingHours* engineers[i].grade.getPayRate());
        	System.out.println(" Engineer id :" + engineers[i].id);
                System.out.println(" Engineer name :" + engineers[i].name);
                System.out.println(" Engineer age :" + engineers[i].age);
                System.out.println(" Engineer salary :" + engineers[i].salary);
                System.out.println("Engineer working hours :" + engineers[i].WorkingHours);
                System.out.println(" Engineer position :" +engineers[i].grade.getPosition());
                System.out.println(" Engineer taxrate :" + engineers[i].grade.getTaxRate());
                System.out.println(" Engineer payrate :" + engineers[i].grade.getPayRate());
                System.out.println(" ------------------------" );
          }
          }
      }
      
      public void delete()
      {
          Scanner input = new Scanner(System .in);
         System.out.println("enter  Engineer id  you want to delete :");
         int engId=input.nextInt();
           for (int i = 0; i < engineers.length; i++) {
             
           if (engineers[i] != null &&engineers[i].id == engId){
               engineers[i] = null;
             break;
           }
         
      }
      }
        public void display()
        {
           for (int i = 0; i < engineers.length; i++) {
            if (engineers[i] != null) {
                System.out.println(" Engineer id :" + engineers[i].id);
                System.out.println(" Engineer name :" + engineers[i].name);
                System.out.println(" Engineer age :" + engineers[i].age);
                System.out.println(" Engineer salary :" + engineers[i].salary);
                System.out.println(" Engineer working hours :" + engineers[i].WorkingHours);
                System.out.println(" Engineer position :" +engineers[i].grade.getPosition());
                System.out.println(" Engineer taxrate :" + engineers[i].grade.getTaxRate());
                System.out.println(" Engineer payrate :" + engineers[i].grade.getPayRate());
                System.out.println(" ------------------------" );
            }
        }
        }
   
}