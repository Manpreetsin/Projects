/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint 
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */
Payroll ac[]=new Payroll[50];
try{
double result =0;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the employee name:");
    String name = sc.nextLine();
System.out.println("Please enter the salary: ");
//ac[0]=a
    double value = sc.nextDouble();
 if(value <= 3000){
        result = value + (0.1 * value);
        System.out.println("The final Salary including bonus is: " + result);
    }
 else{
     System.out.println("The final Salary is: " + value + " without bonus");
 }
}catch(Exception e){
    System.out.println("Enter the correct value");
}
}
}
