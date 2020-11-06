/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author Tharindu
 */
public class Project0_partII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num=new Scanner(System.in);
        int price=30;
        System.out.println("Enter the age");
        int age=num.nextInt();
        System.out.println("Enter the your country");
        String country=num.next();
        if(age>65)
        {
           price=price-price*50/100; 
           System.out.println("price :$"+price+".00");
        }
        else
            System.out.println("$"+price+".00");
        
        // TODO code application logic here
    }
    
}
