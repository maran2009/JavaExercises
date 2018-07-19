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
public class uniqueSum {
    
    public static int uniqueSumValue (int firstNo, int secoundNo, int thirdNo){
    
    if (firstNo == secoundNo && secoundNo == thirdNo){
    return 0;}
    
    if (firstNo == secoundNo){
    return thirdNo;}
    if (firstNo == thirdNo){
    return secoundNo;}
    if (secoundNo == thirdNo){
    return firstNo;}
    
    if (firstNo != secoundNo && secoundNo != thirdNo){
    
    int Total = firstNo+ secoundNo+ thirdNo;
    
    return  Total;}
    
    
    
   return 0; } 
    
}
