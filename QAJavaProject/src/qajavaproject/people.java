/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qajavaproject;
import java.util.Scanner;


/**
 *
 * @author Maran
 */
import java.util.ArrayList;
public class people {
   
    public static void main(String[] args) {
        
       /* Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter Your Name: -");
        String Name = obj.next();
        
        System.out.println("Enter Age: -");
        int age = obj.nextInt();
        
        System.out.println("Enter Job Title");
        String jobTitle = obj.next();*/
       
     peopleClass person1 = new peopleClass ("Maran", 22, "Trainee");
     peopleClass person2 = new peopleClass("HP", 34, "Student");
     peopleClass person3 = new peopleClass("philips", 14, "QA trainer");
     
        //System.out.println(person1 );
        //System.out.println(person2 );
       // System.out.println(person3);
        
        
    //ArrayList<peopleClass> people = new ArrayList<peopleClass> ();
         ArrayList<peopleClass> people = new ArrayList<peopleClass> ();
         people.add(person1);
         people.add(person2);
         people.add(person3);
         
      for (int i =0; i< people.size(); i++){
          
          System.out.println(people.get(i));
          
          
      }
        
       //peopleSearch("John", people);
       //peopleSearch("Nathan", people);
        
        
        
    }

  
}
