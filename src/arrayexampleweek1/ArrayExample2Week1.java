/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexampleweek1;

import java.util.Scanner;
/**
 *
 * @author Manpreet Singh
 */
public class ArrayExample2Week1 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the Word you want: ");
        String word1 = input.nextLine();//input word from user
        
        char[] word = new char[word1.length()];
        
        for(int i =0; i < word1.length(); i++){
            word[i] = word1.charAt(i); 
        }
        
        for(int count = (word.length-1); count > 0; count--){
        System.out.print(word[count]);
    }
    }
}
