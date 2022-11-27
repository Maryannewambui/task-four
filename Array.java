//java program that allows user to input and store 15 integer value 
package com.mycompany.array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
                Scanner input= new Scanner(System.in);
                int number,i,found=0;
                //to read the number of elements entered
                System.out.println("Enter number of elements you want to store");
                number= input.nextInt();
                //Create a memory length of 15
                int[]array = new int[15];
                System.out.println("enter array elements:");
                for(int i=0; i<number;i++)
                {
                array[i]=input.nextInt();
                }
                System.out.println("Array elements are:");
                //accessing array elements using loop
                for(int i=0;i<number;i++)
                {
                System.out.println(array[i]);
                }
                 System.out.println("Enter the value to be searched:");
                 number = input.nextInt();
                 for(i=0; i<15;i++)
                 {
                 if (number==array[i])
                 {
                     System.out.println("The position is:"+i);
                     found=1;
                             break;
                 }
                 
                 }
if(found==0)
    System.out.println("Not Found in this array");


    }
}
