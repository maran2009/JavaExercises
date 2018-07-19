/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qajavaproject;

/**
 *
 * @author Maran
 */
public class tooHotClass {
    
    public static String weather(int temp, boolean isSummer){
    
    if(isSummer && temp <= 60 && temp >= 90){
        
        return "True";}
    
    if (temp <= 60 && temp>= 100 != isSummer){
    
    return  "True";}
    
    else {
    
    return "False";}
    
  // return "False"; 
    }
    
}
