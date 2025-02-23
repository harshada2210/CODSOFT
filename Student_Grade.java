package com.demo10;
import java.util.Scanner;
public class Student_Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("*******************Student Grade Calculator**************\n");
        System.out.println("Enter the number of subjects:");
      
        //Here p is number of subjects
        int p=sc.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in "+p+" subjects (Out of 100) ");
        for(int i=0;i<p;i++){
            int marks=sc.nextInt();
            total=total+marks;
        }
        //AvgPercent is Average percentage
         double AvgPercent=(double)total/p;
         String Grade;
         if (AvgPercent>=90){
           Grade="A+"; 
           System.out.println("Congrats..!  you are pass..!");
         }
         else if(AvgPercent>=80){
            Grade="A";
            System.out.println("Congrats..!  you are pass..!");
         }
         else if(AvgPercent>=70){
            Grade="B";
            System.out.println("Congrats..!  you are pass..!");
         }
         else if(AvgPercent>=60){
            Grade="C";
            System.out.println("you are pass..!");
         }
         else if(AvgPercent>=50){
            Grade="D";
            System.out.println("you are pass..!");
         }
         else if(AvgPercent>=40){
            Grade="E";
            System.out.println("you are pass..!");
         }
         else{
            Grade="Fail(F)";
         }
         System.out.println("Total marks are : "+total);
         System.out.println("Avreage Percentage is : "+AvgPercent+" %");
         System.out.println("Grade is : "+Grade);

         sc.close();
    }
}
