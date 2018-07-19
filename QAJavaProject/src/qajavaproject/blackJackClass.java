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
public class blackJackClass {
    
    public static int blackJack (int fistNumber, int secoundNumber){
    
    if (fistNumber == secoundNumber || fistNumber >21 && secoundNumber >21){
    return 0;}
    
    if (fistNumber > 21 && secoundNumber <= 21 && secoundNumber > 0 ){
        return secoundNumber;
    }
    if (secoundNumber > 21 && fistNumber <= 21 && fistNumber > 0 ){
        return fistNumber;
    }
    if (fistNumber > secoundNumber && fistNumber <=21 && fistNumber >0){
    
    return fistNumber;}
    
    if (secoundNumber > fistNumber && secoundNumber <=21 && secoundNumber >0 ){
    return secoundNumber;}
    return 0;
    }
    
}
