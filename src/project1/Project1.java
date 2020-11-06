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
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num=new Scanner(System.in);
        int price=40;
        System.out.println("Enter the age");
        int age=num.nextInt();
        
        if(age<5)
        {
            price=0;
             System.out.println("price :$"+price+".00");
        }
        else{
            System.out.println("Enter your country name");
            String country=num.next();
            
            if(country.equals("warren"))
            {
                price=30;
                if(age>=65)
                {
                   price=price-price*50/100; 
                   System.out.println("price :$"+price+".00");
                }
                else
                    System.out.println("$"+price+".00");

            }
            else{
                if(age>=65)
                {
                   price=price-price*50/100; 
                   System.out.println("price :$"+price+".00");
                }
                else
                    System.out.println("$"+price+".00");

        
        }
        
            
        }
        
        
        
        // TODO code application logic here
    }
    
}
