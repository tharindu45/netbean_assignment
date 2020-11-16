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
        double price=40.00;
        System.out.println("Enter the age");
        int age=num.nextInt();
        
        if(age>0)
        {
            if(age<5)
            {
                price=0.00;
                 
            }
            
            else{
                System.out.println("Enter your country name");
                String country1=num.next();

                String country= country1.toLowerCase();
                
                
                if(country.equals("clermont") && age<14){
                    price=price-price*18/100;
                }
                
                else if(age>=65)
                {
                    if(country.equals("warren")){
                     price=30.00;
                     
                     price=price-price*50/100;
                    }
                    else if(country.equals("campbell"))
                    {
                      price=price-price*57.5/100;
                     
                    }
                    else
                        price=price-price*50/100;
                    
                }
                else if(country.equals("warren"))
                {
                    price=30.00;
                }
                        
            }
          System.out.println("ticket price: $"+price+"0");     
        }
        
       
        else{
                System.out.println("Invalid age please input again correcttly ");
            }
            
    }
        
        
        
        
        
        
        // TODO code application logic here
}
    

