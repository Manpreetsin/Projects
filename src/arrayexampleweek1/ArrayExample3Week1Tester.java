/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 * Name: Manpreet Singh
 * date : May 22nd, 2019.
 */
package arrayexampleweek1;

/**
 *
 * @author Manpreet Singh
 */
public class ArrayExample3Week1Tester {
    
    public static void main(String[] args){
        ArrayExample3Week1 obj1 = new ArrayExample3Week1();
        obj1.setName("Manpreet"); 
        System.out.println(obj1.getName());
        
        ArrayExample3Week1 obj2 = new ArrayExample3Week1();
        obj2.setName("Manpreet Singh Saini"); 
        System.out.println(obj2.getName());
        
        ArrayExample3Week1[] name = new ArrayExample3Week1[5];
        name[1] = obj1;
        name[2] = obj2;
        
        for (ArrayExample3Week1 name1 : name) {
            System.out.print(name1.getName());
        }
    }//End of main method
}//End of class
