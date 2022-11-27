// a java program that displays prime numbers between 1 and 500
package com.mycompany.isprime;

public class Isprime {

    public static void main(String[] args) 
    {
     int i=0;
     int number = 0;
     //empty string
     String primeNumbers ="";
     
     for (i=1; i<500;i++)
     {
        int counter=0;
        for (number=i;number>=1;number--)
        {
           if(i%number==0)
           {
           counter = counter + 1;
           }   
        }
     if(counter ==2)
     {
     //link the prime number to the String
     primeNumbers = primeNumbers + i + "";
     }
     
     }
      System.out.println("Prime number from 1 t0 500 are :");
      System.out.println(primeNumbers);
    }
}
