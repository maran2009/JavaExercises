/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qajavaproject;

import java.util.ArrayList;

/**
 *
 * @author Maran
 */
public class peopleClass {

    static int size;
    
     private String Name;
     private int age;
     private String jobTitle;
     
     
     public peopleClass (String FName, int peopleAge, String jobtitle){
     
     Name = FName;
     age = peopleAge;
     jobTitle = jobtitle;
     
      
     }
      public String toString (){
          
          return "Name :- " + Name + "  Age:- "+ age + "  Job Title:-"+ jobTitle ;
     }
      
    public peopleClass peopleSearch (people[]a, people p){
        
        for(people m:a) {
        
        if (m==p){
         
            System.out.println( "Person is in the array list");
            //return m;
        }
        
        else if (m != p){
            System.out.println( "Person is not in the array list");
        }
        
        }
        return null;
        
    }
    
}

   

