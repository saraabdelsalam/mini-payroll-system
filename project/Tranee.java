/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_payroll;

import java.util.Scanner;

/**
 *
 * @author Reem
 */
public class Tranee  extends Employee{
    
  private String University_name;
   private int Academic_year;
   private float GPA;
   private Tranee[] trainees = new Tranee[50];
   
     public Tranee(String name, int id, int age, String University_name, int Academic_year, float GPA) {
        this.name = name;
        this.id = id;
        this.age=age;
        this.University_name= University_name;
        this.Academic_year = Academic_year;
        this.GPA = GPA;
        this.salary=1000;
    }

    public Tranee() {
    }
      public void delete() {
        System.out.println("Delete a Trainee");
        System.out.println("__________________");
        System.out.println("Please enter trainee's ID you want to delete");
            Scanner input = new Scanner(System .in);
        int traineeid = input.nextInt();

        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i] != null && trainees[i].id== traineeid) {
                trainees[i] = null;
                break;
            }
        }
    }
      public void add( Tranee newTrainee)
      {
          
       for (int i=0;i<trainees.length;i++)
       {
       if(trainees[i]==null){
      trainees[i]= newTrainee;
       break;
       }
   
      }
      }
       public void editName() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  trainee id you want to edit :");
          int traineeId=input.nextInt();
           System.out.println("enter  trainee name to edit :");
          String traineeName=input.next();
          for (int i=0;i<trainees.length;i++)
          {
          if(trainees[i]!=null && trainees[i].id == traineeId){
        	 trainees[i].name = traineeName;
        	          break;  
          }
           }
          
      }
       public void editAge() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  trainee id you want to edit :");
          int traineeId=input.nextInt();
           System.out.println("enter trainee age to edit :");
          int traineeAge=input.nextInt();
          for (int i=0;i<trainees.length;i++)
          {
          if(trainees[i]!=null && trainees[i].id == traineeId){
        	  trainees[i].age = traineeAge;
        	          break;  
          }
           }
          
      }
      
      public void editUniversityName() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  trainee id you want to edit :");
          int traineeId=input.nextInt();
           System.out.println("enter trainee university name to edit :");
        String UniversityName=input.next();
          for (int i=0;i<trainees.length;i++)
          {
          if(trainees[i]!=null && trainees[i].id == traineeId){
        	  trainees[i].University_name = UniversityName;
        	          break;  
          }
           }
          
      }
      public void editGpa() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  trainee id you want to edit :");
          int traineeId=input.nextInt();
           System.out.println("enter trainee gpa to edit :");
          float traineeGpa=input.nextFloat();
          for (int i=0;i<trainees.length;i++)
          {
          if(trainees[i]!=null && trainees[i].id == traineeId){
        	  trainees[i].GPA = traineeGpa;
        	          break;  
          }
           }
          
      }
      
      public void editAcademicYear() {
    	  Scanner input = new Scanner(System .in);
          System.out.println("enter  trainee id you want to edit :");
          int traineeId=input.nextInt();
           System.out.println("enter trainee academic year to edit :");
          int academicYear=input.nextInt();
          for (int i=0;i<trainees.length;i++)
          {
          if(trainees[i]!=null && trainees[i].id == traineeId){
        	  trainees[i].Academic_year = academicYear;
        	          break;  
          }
           }
          
      }
      
      
      
      public void edit(){
        Scanner input = new Scanner(System .in);
        System.out.println("press '1'  to edit name :");
        System.out.println("press '2'  to edit age:");
        System.out.println("press '3'  to edit university name:");
        System.out.println("press '4'  to edit gpa:");
        System.out.println("press '5'  to edit academic year:");
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
          editUniversityName();
          break;
          case 4:
          editGpa();
          break;
          case 5:
          editAcademicYear();
           break;
          default:
           System.out.println("enter  a valid choice :");
           break;
      }  
      }
      
      
        public void display() {
        for (int i = 0; i < trainees.length; i++) {
            if (trainees[i] != null) {
                System.out.println("Trainee name :" +   trainees[i].name);
                System.out.println("Trainee age :" + trainees[i].age);
                System.out.println("Trainee ID :" + trainees[i].id);
                System.out.println("Trainee University name :" + trainees[i].University_name);
                System.out.println("Trainee Academic year :" +trainees[i]. Academic_year);
                System.out.println("Trainee GPA :" + trainees[i].GPA);
                System.out.println("Trainee salary :" + trainees[i].salary);
                System.out.println(" ------------------------" );
            }
        }
    }

    
}
